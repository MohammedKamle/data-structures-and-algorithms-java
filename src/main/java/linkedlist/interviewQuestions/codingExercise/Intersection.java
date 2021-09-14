package linkedlist.interviewQuestions.codingExercise;

import linkedlist.interviewQuestions.LinkedList;
import linkedlist.interviewQuestions.Node;

/*
* Coding Exercise - 28
* */
public class Intersection {
    // My approach
    static int findIntersection(LinkedList list1, LinkedList list2){
        int sizeDifference = Math.abs(list1.size-list2.size);
        int index = 0;
        Node t1 = list1.head;
        Node t2 = list2.head;
        while (index < sizeDifference){
            if (list1.size > list2.size){
                t1 = t1.next;
            }else {
                t2 = t2.next;
            }
            index++;
        }

        while (t1 != null && t2 != null){
            if (t1.value == t2.value){
                // you can return either t1.value or t2.value as both will be same after intersection
                return t1.value;
            }else {
                t1 = t1.next;
                t2 = t2.next;
            }
        }
        return  -1;
    }

    // INSTRUCTOR'S APPROACH
    static Node findIntersection_(LinkedList list1, LinkedList list2){
        if (list1.head == null || list2.head == null){
            return null;
        }
        // if intersection exist between the lists then tail will be same (see solution video)
        if (list1.tail != list2.tail){
            return null;
        }
        Node shorter = new Node();
        Node longer = new Node();
        if (list1.size > list2.size){
            longer = list1.head;
            shorter = list2.head;
        }else {
            longer = list2.head;
            shorter = list1.head;
        }
        longer = getKthNode(longer, Math.abs(list1.size- list2.size));
        while (shorter != longer){
            shorter = shorter.next;
            longer = longer.next;
        }
        // you can return either shorter or longer as both are same after intersection
        return longer;

    }

    static Node getKthNode(Node head, int k){
        Node current = head;
        while (k >0 && current != null){
            current = current.next;
            k--;
        }
        return current;
    }


   static void addSameNode(LinkedList llA, LinkedList llB, int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next =null;
        llA.tail.next = newNode;
        llA.tail = newNode;
        llA.size++;
        llB.tail.next = newNode;
        llB.tail = newNode;
        llB.size++;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list1.insert(3);
        list1.insert(1);
        list1.insert(5);
        list1.insert(9);

        list2.insert(23);
        list2.insert(98);
        list2.insert(56);
        list2.insert(2);
        list2.insert(4);
        list2.insert(6);

        addSameNode(list1,list2, 7);
        addSameNode(list1,list2, 2);
        addSameNode(list1,list2, 1);

        list1.traverse();
        list2.traverse();

        System.out.println(findIntersection(list1,list2));
        System.out.println(findIntersection_(list1,list2).value);

    }

}
