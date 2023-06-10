package creational.factory;

import java.util.Objects;

public class NotificationFactory {
    public Notification createNotification(String notificationType) {

        if (Objects.isNull(notificationType) || notificationType.isEmpty()) {
            throw new IllegalArgumentException("Notification type cannot be empty");
        }

        return switch (notificationType) {
            case "SMS" -> new SMSNotification();
            case "EMAIL" -> new EmailNotification();
            case "PUSH" -> new PushNotification();
            default ->
                    throw new IllegalArgumentException("Possible notification types are: SMS, EMAIL, PUSH");
        };
    }
}
