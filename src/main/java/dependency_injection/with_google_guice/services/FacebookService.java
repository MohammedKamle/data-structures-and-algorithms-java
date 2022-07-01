package dependency_injection.with_google_guice.services;

import javax.inject.Singleton;
//import com.google.inject.Singleton;

@Singleton
public class FacebookService implements MessageService{

    @Override
    public boolean sendMessage(String message, String receiver) {
        System.out.println("Facebook message has been sent to "+receiver+" with message :: "+message);
        return true;
    }
}
