package dependency_injection.with_google_guice.services;

import javax.inject.Singleton;
//import com.google.inject.Singleton;

@Singleton
public class EmailService implements MessageService{

    @Override
    public boolean sendMessage(String message, String receiver) {
        System.out.println("Email sent to "+receiver+" with message :: "+message);
        return true;
    }
}
