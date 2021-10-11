package queue.usinglinkedlist;

public class QueueUsingLinkedList {
    LinkedList list;

    public QueueUsingLinkedList() {
        list = new LinkedList();
        System.out.println("The Queue is successfully created");
    }

    public boolean isEmpty() {
        if (list.head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(int value) {
        list.insertInLinkedList(value, list.size);
        System.out.println("Successfully inserted " + value + " in queue");
    }

    public int deQueue() {
        int value = -1;
        if (isEmpty()) {
            System.out.println("The Queue is empty");
        } else {
            value = list.head.value;
            list.deletionOfNode(0);
        }
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The Queue is empty");
            return -1;
        } else {
            return list.head.value;
        }
    }

    public void deleteQueue() {
        list.head = null;
        list.tail = null;
        System.out.println("The Queue deleted successfully");
    }
}
