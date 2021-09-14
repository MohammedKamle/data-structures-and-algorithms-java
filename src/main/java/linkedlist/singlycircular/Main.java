package linkedlist.singlycircular;

public class Main {

    public static void main(String[] args) {
        CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();

        circularSinglyLinkedList.createCSLL(5);

        circularSinglyLinkedList.insertCSLL(1,0);
        circularSinglyLinkedList.insertCSLL(2,1);
        circularSinglyLinkedList.insertCSLL(3,2);
        circularSinglyLinkedList.insertCSLL(4,3);

        circularSinglyLinkedList.traverseCSLL();

        circularSinglyLinkedList.searchNode(3 );

        circularSinglyLinkedList.deleteNode(4);
        circularSinglyLinkedList.traverseCSLL();

        circularSinglyLinkedList.deleteEntireCSLL();
        System.out.println("Current size is :"+circularSinglyLinkedList.size);
    }
}
