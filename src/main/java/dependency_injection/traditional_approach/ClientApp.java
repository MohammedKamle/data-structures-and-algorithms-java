package dependency_injection.traditional_approach;

public class ClientApp {
    public static void main(String[] args) {
        MyApplication myApplication = new MyApplication(new EmailService());
        myApplication.processMessage("Hi Raj, how are you ?", "raj@gmail.com");
    }
}
