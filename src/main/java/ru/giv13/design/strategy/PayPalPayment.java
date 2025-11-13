package ru.giv13.design.strategy;

public class PayPalPayment implements PaymentStrategy {
    private final String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public boolean pay(double amount) {
        System.out.printf("📧 Обработка платежа через PayPal: %.2f руб.%n", amount);
        System.out.printf("   Аккаунт: %s%n", email);
        boolean success = Math.random() > 0.5; // 50% успешных платежей
        if (success) {
            System.out.println("   ✅ Платеж через PayPal успешен");
        } else {
            System.out.println("   ❌ Ошибка авторизации PayPal");
        }
        return success;
    }

    @Override
    public String getPaymentMethod() {
        return "PayPal";
    }
}
