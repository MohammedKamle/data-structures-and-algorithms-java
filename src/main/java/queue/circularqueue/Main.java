package queue.circularqueue;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(3);
        System.out.println(circularQueue.isEmpty());

        System.out.println(circularQueue.topOfQueue);
        System.out.println(circularQueue.beginningOfQueue);

        circularQueue.enQueue(2);

        System.out.println(circularQueue.topOfQueue);
        System.out.println(circularQueue.beginningOfQueue);

        circularQueue.enQueue(4);

        System.out.println(circularQueue.topOfQueue);
        System.out.println(circularQueue.beginningOfQueue);

        circularQueue.enQueue(4);

        System.out.println(circularQueue.topOfQueue);
        System.out.println(circularQueue.beginningOfQueue);

        System.out.println("Dequing+++++++++++++");



        circularQueue.deQueue();

        System.out.println(circularQueue.topOfQueue);
        System.out.println(circularQueue.beginningOfQueue);

        circularQueue.deQueue();

        System.out.println(circularQueue.topOfQueue);
        System.out.println(circularQueue.beginningOfQueue);

        circularQueue.deQueue();


        System.out.println(Arrays.toString(circularQueue.arr));

        System.out.println(circularQueue.isEmpty());




    }


}
