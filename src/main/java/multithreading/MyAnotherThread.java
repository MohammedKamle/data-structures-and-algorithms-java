package multithreading;

public class MyAnotherThread extends Thread{
    public void run(){
        for (int i=10; i>=1; i--){
            System.out.println("Another thread is "+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
