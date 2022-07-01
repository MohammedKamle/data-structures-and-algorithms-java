package dependency_injection.with_DI.services;

public class FacebookService implements MessageService{

    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Facebook message has been sent to "+receiver+" with message :: "+message);
    }
}
