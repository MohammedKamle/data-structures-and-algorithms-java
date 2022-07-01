package dependency_injection.with_DI;

import dependency_injection.with_DI.consumer.Consumer;
import dependency_injection.with_DI.injector.EmailServiceInjector;
import dependency_injection.with_DI.injector.FacebookServiceInjector;
import dependency_injection.with_DI.injector.MessageServiceInjector;
import dependency_injection.with_DI.injector.SMSServiceInjector;

public class Main {

    public static void main(String[] args) {
        //Data
        String msg = "Hello, my name is Xyz";
        String email = "raj@gmail.com";
        String phone = "8693015058";

        MessageServiceInjector messageServiceInjector;
        Consumer consumer;

        messageServiceInjector = new EmailServiceInjector();
        consumer = messageServiceInjector.getConsumer();
        consumer.processMessage(msg, email);

        messageServiceInjector = new SMSServiceInjector();
        consumer = messageServiceInjector.getConsumer();
        consumer.processMessage(msg, phone);

        messageServiceInjector = new FacebookServiceInjector();
        consumer = messageServiceInjector.getConsumer();
        consumer.processMessage(msg, "raj@facebook.com");
    }
}
