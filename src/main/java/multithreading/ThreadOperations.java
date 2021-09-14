package multithreading;

   class UserThread extends Thread {
    public void run(){
        int i=0;
        i++;
        System.out.println("User defined thread with id "+Thread.currentThread().getId()+" and i value is "+i);
    }

}
public class ThreadOperations {
    public static void main(String[] args) throws InterruptedException {
        UserThread t2= new UserThread();
        UserThread t3= new UserThread();
        t2.start();
        t3.start();
        //Thread t = Thread.currentThread();
       // Thread.sleep(5000);
//        System.out.println(t.getName());
//        System.out.println(t.getId());
    }
}
