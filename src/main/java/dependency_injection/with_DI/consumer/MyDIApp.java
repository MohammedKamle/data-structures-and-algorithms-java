package dependency_injection.with_DI.consumer;

import dependency_injection.with_DI.services.MessageService;

public class MyDIApp implements Consumer{
    private MessageService messageService;

    public MyDIApp(MessageService messageService){
        this.messageService = messageService;
    }
    @Override
    public void processMessage(String message, String receiver) {
        messageService.sendMessage(message,receiver);
    }
}
