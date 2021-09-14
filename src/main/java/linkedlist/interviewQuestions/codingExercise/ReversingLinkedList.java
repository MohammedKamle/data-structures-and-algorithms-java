package linkedlist.interviewQuestions.codingExercise;

import linkedlist.interviewQuestions.LinkedList;
import linkedlist.interviewQuestions.Node;

public class ReversingLinkedList {

    public static LinkedList reverseList(LinkedList list){
        Node prev =null;
        Node current = list.head;
        Node next = list.head;
        while (next != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        list.head = prev;
        return  list;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.createLinkedList(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(4);
        list1.insert(5 );
        list1.traverse();
        list1 = reverseList(list1);
        list1.traverse();

    }
}
