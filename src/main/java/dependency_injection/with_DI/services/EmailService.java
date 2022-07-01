package dependency_injection.with_DI.services;

public class EmailService implements MessageService{
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Email sent to "+receiver+" with message :: "+message);
    }
}
