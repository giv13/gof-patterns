package ru.giv13.design.strategy;

public class CardPayment implements PaymentStrategy {
    private final String cardNumber;

    public CardPayment(String cardNumber, String cardHolder, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean pay(double amount) {
        System.out.printf("💳 Обработка платежа через карту: %.2f руб.%n", amount);
        System.out.printf("   Карта: **** **** **** %s%n", cardNumber.substring(cardNumber.length() - 4));
        boolean success = Math.random() > 0.75; // 25% успешных платежей
        if (success) {
            System.out.println("   ✅ Платеж успешно обработан");
        } else {
            System.out.println("   ❌ Ошибка обработки платежа");
        }
        return success;
    }

    @Override
    public String getPaymentMethod() {
        return "Карта";
    }
}
