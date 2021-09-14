package linkedlist.singly;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
       // singlyLinkedList.createSinglyLinkedList(5);
        singlyLinkedList.insertInLinkedList(25, 0);
        singlyLinkedList.insertInLinkedList(45, 1);
        singlyLinkedList.insertInLinkedList(100, 2);
        singlyLinkedList.insertInLinkedList(200, 3);

        singlyLinkedList.traverseSinglyLinkedList();

        singlyLinkedList.insertInLinkedList(200, 0);

        singlyLinkedList.traverseSinglyLinkedList();

        singlyLinkedList.searchNode(200);

        singlyLinkedList.deletionOfNode(0);
        singlyLinkedList.traverseSinglyLinkedList();

        singlyLinkedList.deletionOfNode(2);
        singlyLinkedList.traverseSinglyLinkedList();

        singlyLinkedList.deleteEntireSLL();
        singlyLinkedList.traverseSinglyLinkedList();

        System.out.println("Current list size is "+singlyLinkedList.size);

    }
}
