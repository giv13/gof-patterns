package ru.giv13.design.strategy;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        OrderContext order = new OrderContext("001", "Мария Сидорова", Arrays.asList("Суши", "Зеленый чай"), 800.0);
        PaymentStrategy[] strategies = {
                new CardPayment("8765432187654321", "MARIA SIDOROVA", "06/24", "456"),
                new PayPalPayment("maria.sidorova@example.com"),
                new CashPayment()
        };
        for (PaymentStrategy strategy : strategies) {
            order.setPaymentStrategy(strategy);
            if (order.processPayment()) {
                System.out.println("✅ Оплата прошла успешно!");
                break;
            } else {
                System.out.println("🔄 Пробуем другой способ оплаты...\n");
            }
        }
    }
}
