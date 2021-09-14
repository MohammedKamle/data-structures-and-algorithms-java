package linkedlist.interviewQuestions.codingExercise;

import linkedlist.interviewQuestions.LinkedList;
import linkedlist.interviewQuestions.Node;

/*
* Coding Excercise - 26 -- put all the elements less than x to the left
* */
public class Partition {

    public static LinkedList partition(LinkedList list, int x){
        Node tempNode = list.head;
        list.tail = list.head;
        while (tempNode != null){
            Node nextToTempNode = tempNode.next;
            if (tempNode.value < x){
                tempNode.next = list.head;
                list.head = tempNode;
            }else {
                list.tail.next = tempNode;
                list.tail = tempNode;
            }
            tempNode = nextToTempNode;
        }
        list.tail.next = null;
        return list;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.createLinkedList(1);
        list1.insert(4);
        list1.insert(9);
        list1.insert(5);
        list1.insert(10);
        list1.insert(2);
//        list1.insert(2);
//        list1.insert(1);
        list1.traverse();
        partition(list1, 4);
        list1.traverse();
    }
}
