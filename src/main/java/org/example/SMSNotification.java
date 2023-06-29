package org.example;

public class SMSNotification extends NotificationTemplate {
    @Override
    protected void prepareNotification() {
        System.out.println("Preparing SMS notification");
    }

    @Override
    protected String createMessage() {
        return "SMS message";
    }

    @Override
    protected void sendMessage(String message, String recipient) {
        System.out.println("Sending SMS message to " + recipient + " with content: " + message);
    }
}
