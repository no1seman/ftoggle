package com.example.model;

public class Notification {
    private String message;
    private String recipient;

    public Notification(String message, String recipient) {
        this.message = message;
        this.recipient = recipient;
    }

    // Getters and setters
    public String getMessage() {
        return message;
    }

    public String getRecipient() {
        return recipient;
    }
}
