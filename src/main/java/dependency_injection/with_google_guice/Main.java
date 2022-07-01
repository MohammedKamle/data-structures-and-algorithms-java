package dependency_injection.with_google_guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import dependency_injection.with_google_guice.consumer.MyDIApp;
import dependency_injection.with_google_guice.injector.AppInjector;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AppInjector());
        MyDIApp app = injector.getInstance(MyDIApp.class);
        app.processMessgae("Hi, my name is Raj", "raj123@gmail.com");
    }
}
