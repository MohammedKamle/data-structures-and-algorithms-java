package dependency_injection.with_google_guice.consumer;

import dependency_injection.with_google_guice.services.MessageService;

import javax.inject.Inject;
//import com.google.inject.Inject;
public class MyDIApp {
    private MessageService messageService;

    @Inject
    public MyDIApp(MessageService messageService){
        this.messageService = messageService;
    }

    public void processMessgae(String message, String receiver){
        messageService.sendMessage(message, receiver);
    }
}
