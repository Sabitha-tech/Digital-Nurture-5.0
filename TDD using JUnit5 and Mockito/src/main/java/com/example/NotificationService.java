package com.example;

public class NotificationService {
    private final MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void notifyUser(String message) throws Exception {
        this.messageSender.send(message);
    }
}
