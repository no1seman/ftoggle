package com.example;

import com.example.features.DarkMode;
import com.example.features.NotificationSystem;
import com.example.features.PaymentSystem;
import com.example.model.Notification;
import com.example.model.Payment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            // Load configuration
            Properties properties = new Properties();
            properties.load(Main.class.getClassLoader().getResourceAsStream("config.properties"));

            logger.info("Starting application with configuration: {}", properties);

            // Test Dark Mode
            DarkMode darkMode = new DarkMode();
            logger.info("Current theme: {}", darkMode.getTheme());
            logger.info("Background color: {}", darkMode.getBackgroundColor());

            // Test Notification System
            NotificationSystem notificationSystem = new NotificationSystem();
            Notification notification = new Notification("Hello!", "user@example.com");
            notificationSystem.sendNotification(notification);

            // Test Payment System
            PaymentSystem paymentSystem = new PaymentSystem();
            Payment payment = new Payment(99.99, "USD");
            paymentSystem.processPayment(payment);

        } catch (IOException e) {
            logger.error("Failed to load configuration", e);
            System.exit(1);
        }
    }
}