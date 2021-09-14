package multithreading;

public class MyThread implements  Runnable {

    public void run(){
        for (int i=1    ; i<=10; i++){
            System.out.println("Value of i is : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        Thread thread = new Thread(t1);
        thread.start();

        MyAnotherThread t2 = new MyAnotherThread();
        t2.start();


    }
}
