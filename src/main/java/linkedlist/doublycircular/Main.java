package linkedlist.doublycircular;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList circularDoublyLinkedList = new CircularDoublyLinkedList();
        circularDoublyLinkedList.createCDLL(2);

        circularDoublyLinkedList.insertCDLL(1, 0);
        circularDoublyLinkedList.insertCDLL(2, 1);
        circularDoublyLinkedList.insertCDLL(3, 2);
        circularDoublyLinkedList.insertCDLL(4, 3);
        circularDoublyLinkedList.insertCDLL(5, 5);
        circularDoublyLinkedList.traverseCDLL();

        circularDoublyLinkedList.reverseTraversalOfCDLL();

        circularDoublyLinkedList.searchNode(4);

        circularDoublyLinkedList.deleteNodeInCDLL(0);
        circularDoublyLinkedList.traverseCDLL();
        circularDoublyLinkedList.deleteNodeInCDLL(3);
        circularDoublyLinkedList.traverseCDLL();
        circularDoublyLinkedList.deleteNodeInCDLL(circularDoublyLinkedList.size);
        circularDoublyLinkedList.traverseCDLL();

        System.out.println("Current size of CDLL is "+circularDoublyLinkedList.size);
        circularDoublyLinkedList.deleteEntireCDLL();
        circularDoublyLinkedList.traverseCDLL();
        System.out.println("Current size of CDLL is "+circularDoublyLinkedList.size);
    }
}
