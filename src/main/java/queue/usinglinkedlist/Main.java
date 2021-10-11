package queue.usinglinkedlist;

public class Main {
    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        System.out.println(queue.isEmpty());

        queue.enQueue(5);

        System.out.println(queue.isEmpty());

        queue.enQueue(10);

        //peek
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());

        queue.deleteQueue();
    }
}
