package queue.circularqueue;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(3);

        System.out.println(circularQueue.isEmpty());

        circularQueue.enQueue(1);
        circularQueue.enQueue(2);
        circularQueue.enQueue(3);

        circularQueue.enQueue(4);

        System.out.println("Dequeuing "+circularQueue.deQueue());

        circularQueue.enQueue(4);

        System.out.println("Peeking..."+circularQueue.peek());

        circularQueue.deQueue();

        System.out.println("Peeking..."+circularQueue.peek());
        System.out.println("Peeking..."+circularQueue.peek());

        System.out.println(Arrays.toString(circularQueue.arr));
        circularQueue.deQueue();
        circularQueue.deQueue();
        System.out.println(Arrays.toString(circularQueue.arr));
        circularQueue.deQueue();

        circularQueue.deleteQueue();



    }


}
