package multithreading.producerConsumer;

public class Consumer extends Thread{
    Company c;

    public  Consumer(Company c){
        this.c = c;
    }
    public void run(){
        while (true){
            try {
                c.consume_item();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
