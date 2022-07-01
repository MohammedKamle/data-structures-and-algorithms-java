package dependency_injection.traditional_approach;

public class EmailService {
    public void sendEmail(String message, String receiver){
        // logic to send email
        System.out.println("Email sent to "+receiver+" with message :: "+message);
    }

}
