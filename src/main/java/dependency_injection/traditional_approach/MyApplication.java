package dependency_injection.traditional_approach;

public class MyApplication {
    private EmailService emailService;
    public MyApplication(EmailService emailService){
        this.emailService = emailService;
    }
    public void processMessage(String message, String receiver){
      emailService.sendEmail(message, receiver);
    }


}
