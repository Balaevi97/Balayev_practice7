package Task2;

public class NotificationService {

    public static void sendAlert(Notification notification, String message) {
        notification.sendNotification(message);

    }

    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification();
        Notification SMSNotification = new SMSNotification();

        sendAlert(emailNotification, "ეს არის Email შეტყობინება");
        sendAlert(SMSNotification, "ეს არის SMS შეტყობინება");

//        emailNotification.sendNotification("ეს არის Email შეტყობინება");
//        SMSNotification.sendNotification("ეს არის SMS შეტყობინება");


    }

}

