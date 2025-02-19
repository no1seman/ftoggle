package com.example.features;

import com.example.config.FeatureFlags;
import com.example.model.Notification;

public class NotificationSystem {
    public void sendNotification(Notification notification) {
        if (FeatureFlags.NOTIFICATIONS_ENABLED) {
            System.out.println("Sending notification to: " + notification.getRecipient());
            System.out.println("Message: " + notification.getMessage());
        } else {
            System.out.println("Notifications are disabled");
        }
    }
}