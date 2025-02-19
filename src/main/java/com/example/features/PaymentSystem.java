package com.example.features;

import com.example.config.FeatureFlags;
import com.example.model.Payment;

public class PaymentSystem {
    public void processPayment(Payment payment) {
        if (FeatureFlags.NEW_PAYMENT_SYSTEM_ENABLED) {
            processPaymentNewSystem(payment);
        } else {
            processPaymentOldSystem(payment);
        }
    }

    private void processPaymentNewSystem(Payment payment) {
        System.out.println("Processing payment with new system");
        System.out.println("Amount: " + payment.getAmount() + " " + payment.getCurrency());
        // New system implementation
    }

    private void processPaymentOldSystem(Payment payment) {
        System.out.println("Processing payment with old system");
        System.out.println("Amount: " + payment.getAmount() + " " + payment.getCurrency());
        // Old system implementation
    }
}