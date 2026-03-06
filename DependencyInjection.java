interface NotificationMethod {
    public abstract void send(String message);
}

class SMS implements NotificationMethod {

    @Override
    public void send(String message) {
        System.out.println("Sending SMS " + message);
        ;
    }
}

class Email implements NotificationMethod {

    @Override
    public void send(String message) {
        System.out.println("Sending Email " + message);
        ;
    }

}

class PushNotification implements NotificationMethod {

    @Override
    public void send(String message) {
        System.out.println("Sending Push " + message);
    }
}

class NotificationService {
    NotificationMethod notificationMethod;

    public NotificationService(NotificationMethod notificationMethod) {
        this.notificationMethod = notificationMethod;
    }

    void sendNotification(String message) {
        notificationMethod.send(message);
    }
}

public class DependencyInjection {

}
