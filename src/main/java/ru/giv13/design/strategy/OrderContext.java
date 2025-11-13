package ru.giv13.design.strategy;

import ru.giv13.design.delievery.Order;

import java.util.List;

public class OrderContext extends Order {
    private PaymentStrategy paymentStrategy;
    private boolean isPaid;

    public OrderContext(String id, String customerName, List<String> items, double totalPrice) {
        super(id, customerName, items, totalPrice);
        this.isPaid = false;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
        System.out.printf("💰 Установлен способ оплаты: %s", paymentStrategy.getPaymentMethod());
    }

    public boolean processPayment() {
        if (paymentStrategy == null) {
            System.out.println("❌ Не выбран способ оплаты");
            return false;
        }
        if (isPaid) {
            System.out.println("ℹ️ Заказ уже оплачен");
            return true;
        }
        System.out.printf("\n💸 Попытка оплаты заказа %s на сумму %.2f руб....%n", id, totalPrice);
        isPaid = paymentStrategy.pay(totalPrice);
        return isPaid;
    }
}
