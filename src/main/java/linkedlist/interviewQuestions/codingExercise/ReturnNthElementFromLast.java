package linkedlist.interviewQuestions.codingExercise;

import linkedlist.interviewQuestions.LinkedList;
import linkedlist.interviewQuestions.Node;

/*
* Coding Exercise - 25 - Missing info in the ques, directly look at solution video for instructor's approach
* */
public class ReturnNthElementFromLast {

    // My approach
    public static int returnNthToLast(LinkedList list, int nth){
        Node tempNode = list.head;
        for (int i=0; i<(list.size-nth); i++){
            tempNode = tempNode.next;
        }
        return tempNode.value;
    }

    // Instructor's approach
    public static Node returnNthToLast_(LinkedList list, int nth){
        Node p1 = list.head;
        Node p2 = list.head;
        for (int i=0; i<nth; i++){
            p1= p1.next;
        }
        while (p1 != null){
            p2 = p2.next;
            p1 = p1.next;
        }
        return p2;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.createLinkedList(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(4);
        list1.insert(5);
        list1.insert(6);
        list1.traverse();
        System.out.println(returnNthToLast(list1, 3));

        Node n = returnNthToLast_(list1, 3);
        System.out.println(n.value);
    }
}
