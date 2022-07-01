package dependency_injection.with_google_guice.services;

public interface MessageService {
    boolean sendMessage(String message, String receiver);
}
