package ru.giv13.design.observer;

import ru.giv13.design.delievery.Order;
import ru.giv13.design.delievery.OrderStatus;

import java.util.ArrayList;
import java.util.List;

public class OrderTracker {
    private final List<OrderObserver> observers = new ArrayList<>();
    private Order order;

    public OrderTracker() {
    }

    public void createOrder(Order order) {
        this.order = order;
        notifyObservers();
        System.out.printf("🆕 Создан заказ %s%n", order.getId());
    }

    public void updateStatus(OrderStatus status) {
        OrderStatus previousStatus = order.getStatus();
        order.setStatus(status);
        notifyObservers();
        System.out.printf("🔄 Статус заказа %s изменен: %s → %s%n", order.getId(), previousStatus, status);
    }

    public OrderTracker subscribe(OrderObserver observer) {
        observers.add(observer);
        System.out.println("✅ Новый подписчик: " + observer.getClass().getSimpleName());
        return this;
    }

    public OrderTracker unsubscribe(OrderObserver observer) {
        observers.remove(observer);
        System.out.println("❌ Отписан: " + observer.getClass().getSimpleName());
        return this;
    }

    public void unsubscribeAll() {
        observers.clear();
        System.out.println("🧹 Все подписчики отписаны");
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            try {
                observer.update(order);
            } catch (Exception e) {
                System.err.println("Ошибка в наблюдателе " + observer.getClass().getSimpleName() + ": " + e.getMessage());
            }
        }
    }
}
