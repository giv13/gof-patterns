package ru.giv13.design.strategy;

public interface PaymentStrategy {
    boolean pay(double amount);
    String getPaymentMethod();
}
