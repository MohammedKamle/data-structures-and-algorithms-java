package queue.linearqueue;

public class QueueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray(int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The Queue is successfully created with size: " + size);
    }

    public boolean isFull() {
        if (topOfQueue == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        // when we dequeued all the elements from the queue beginningOfQueue will equal arr.length
        if ((beginningOfQueue == -1) || (beginningOfQueue == arr.length)) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Queue is full!");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println(value + " is successfully inserted in the queue");
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println(value + " is successfully inserted in the queue");
        }
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The Queue is empty!");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            // if its the last element that is deQueued then beginningOfQueue > topOfQueue and
            // so we will make necessary changes
            if (beginningOfQueue > topOfQueue) {
                beginningOfQueue = topOfQueue = -1; // as queue will be empty

            }
            return result;
        }
    }

    public int peek(){
        if (!isEmpty()){
            return arr[beginningOfQueue];
        }else {
            System.out.println("The Queue is empty");
            return -1;
        }
    }

    // delete the queue
    public  void deleteQueue(){
        arr = null;
        System.out.println("Queue is successfully deleted");
    }
}
