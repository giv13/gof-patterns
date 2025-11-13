package ru.giv13.design.strategy;

public class CashPayment implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.printf("💵 Оплата наличными: %.2f руб.%n", amount);
        return true; // Всегда успешный платеж
    }

    @Override
    public String getPaymentMethod() {
        return "Наличные";
    }
}
