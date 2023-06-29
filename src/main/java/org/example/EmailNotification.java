package org.example;

public class EmailNotification extends NotificationTemplate {

    @Override
    protected void prepareNotification() {
        System.out.println("Preparing email notification");
    }

    @Override
    protected String createMessage() {
        return "Email message";
    }

    @Override
    protected void sendMessage(String message, String recipient) {
        System.out.println("Sending email message to " + recipient + " with content: " + message);
    }

}
