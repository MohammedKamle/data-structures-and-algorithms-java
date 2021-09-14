package linkedlist.doubly;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.createDLL(5);

        doublyLinkedList.insertDLL(1,0);
        doublyLinkedList.insertDLL(2,1);
        doublyLinkedList.insertDLL(3,2);
        doublyLinkedList.insertDLL(4,3);

        doublyLinkedList.traverseDLL();

        doublyLinkedList.reverseTraversalOfDLL();

        doublyLinkedList.searchNodeInDLL(3);

        doublyLinkedList.deleteNodeDLL(0);
        doublyLinkedList.deleteNodeDLL(2);
        doublyLinkedList.deleteNodeDLL(100);
        doublyLinkedList.traverseDLL();
        System.out.println("Current size is "+doublyLinkedList.size);

        doublyLinkedList.deleteEntireDLL();
        System.out.println("Current size is "+doublyLinkedList.size);
        doublyLinkedList.traverseDLL();


    }
}
