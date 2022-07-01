package dependency_injection.with_DI.injector;

import dependency_injection.with_DI.consumer.Consumer;
import dependency_injection.with_DI.consumer.MyDIApp;
import dependency_injection.with_DI.services.FacebookService;

public class FacebookServiceInjector implements MessageServiceInjector{

    @Override
    public Consumer getConsumer() {
        return new MyDIApp(new FacebookService());
    }
}
