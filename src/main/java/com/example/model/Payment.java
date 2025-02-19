package com.example.model;

public class Payment {
    private double amount;
    private String currency;

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    // Getters and setters
    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }
}