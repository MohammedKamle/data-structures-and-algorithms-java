package dependency_injection.with_google_guice.injector;

import com.google.inject.AbstractModule;
import dependency_injection.with_google_guice.services.EmailService;
import dependency_injection.with_google_guice.services.FacebookService;
import dependency_injection.with_google_guice.services.MessageService;

public class AppInjector extends AbstractModule {

    @Override
    protected void configure() {
        //bind MessageService to Facebook Message implementation
        //bind(MessageService.class).to(FacebookService.class);

        //bind the service to implementation class
        bind(MessageService.class).to(EmailService.class);

    }
}
