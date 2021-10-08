package queue.linearqueue;

import queue.linearqueue.QueueArray;

public class Main {

    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);

        // Enqueueing
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);

        System.out.println(queue.isFull());
        queue.enQueue(5);
        System.out.println(queue.isFull());

        // Dequeuing
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());

        //Peeking
        System.out.println("Peek value is "+queue.peek());

        System.out.println(queue.isEmpty());
        System.out.println(queue.deQueue());
        System.out.println(queue.isEmpty());

        queue.deleteQueue();





    }
}
