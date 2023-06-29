package org.example;

public class Main {
    public static void main(String[] args) {
        NotificationTemplate emailNotification = new EmailNotification();
        emailNotification.sendNotification("john@example.com");

        NotificationTemplate smsNotification = new SMSNotification();
        smsNotification.sendNotification("+1234567890");
    }
}
