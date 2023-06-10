package creational.factory;

public class Main {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        // By passing the type, in this case is String, objects are created by the factory
        Notification notification = notificationFactory.createNotification("SMS");

        notification.notifyUser();
    }
}