package ru.giv13.design.observer;

import ru.giv13.design.delievery.Order;

public class CourierNotifier implements OrderObserver {
    private final String courierId;
    private boolean isAvailable;

    public CourierNotifier(String courierId) {
        this.courierId = courierId;
        this.isAvailable = true;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    @Override
    public void update(Order order) {
        if (!isAvailable) return;
        switch (order.getStatus()) {
            case READY_FOR_DELIVERY:
                System.out.printf("🚚 Курьер %s: Заказ %s готов к доставке!%n", courierId, order.getId());
                break;
            case ON_THE_WAY:
                System.out.printf("🚚 Курьер %s: Забрал заказ %s, еду к клиенту!%n", courierId, order.getId());
                break;
            case DELIVERED:
                System.out.printf("🚚 Курьер %s: Заказ %s доставлен!%n", courierId, order.getId());
                break;
        }
    }
}
