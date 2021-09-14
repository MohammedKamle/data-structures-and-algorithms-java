package multithreading.producerConsumer;

public class Company {
    int n;
    boolean flag = false;
    /*
    * If flag is false we will allow produce to produce item and stop consumer from executing
    *  and if flag is true then vice versa
    * */
    synchronized public void produce_item(int n) throws InterruptedException {
        if (flag){
            wait();
        }
        this.n = n;
        System.out.println("Produced :"+this.n);
        flag = true;
        notify();
    }
    synchronized public int consume_item() throws InterruptedException {
        if (!flag){
            wait();
        }
        System.out.println("Consumed :"+this.n);
        flag = false;
        notify();
        return this.n;

    }
}
