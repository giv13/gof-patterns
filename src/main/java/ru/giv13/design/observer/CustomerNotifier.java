package ru.giv13.design.observer;

import ru.giv13.design.delievery.Order;

public class CustomerNotifier implements OrderObserver {
    private final String customerPhone;

    public CustomerNotifier(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    @Override
    public void update(Order order) {
        System.out.printf("📱 SMS для %s: Заказ %s - %s%n", customerPhone, order.getId(), order.getStatus());
    }
}
