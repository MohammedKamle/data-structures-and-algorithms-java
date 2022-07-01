package dependency_injection.with_DI.services;

public class SMSService implements MessageService{

    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("SMS sent at mobile number "+receiver+" with message :: "+message);
    }
}
