package ru.giv13.design.memento;

import ru.giv13.design.delievery.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderOriginator extends Order {
    public OrderOriginator(String id, String customerName, List<String> items, double totalPrice) {
        super(id, customerName, items, totalPrice);
    }

    private OrderOriginator(OrderOriginator other) {
        super(other.id, other.customerName, new ArrayList<>(other.items), other.totalPrice, other.status);
    }

    public OrderOriginator copy() {
        return new OrderOriginator(this);
    }

    public OrderMemento createMemento(String description) {
        System.out.println("📸 Создан снимок заказа " + id + ": " + description);
        return new OrderMemento(this, description);
    }

    public void restoreFromMemento(OrderMemento memento) {
        Order order = memento.getOrder();
        if (!id.equals(order.getId())) {
            throw new IllegalArgumentException("Снимок не соответствует заказу");
        }
        this.customerName = order.getCustomerName();
        this.items = order.getItems();
        this.totalPrice = order.getTotalPrice();
        this.status = order.getStatus();
        System.out.println("↩️ Заказ " + id + " восстановлен из снимка: " + memento.getDescription());
    }

    public void setItems(List<String> items) {
        this.items = new ArrayList<>(items);
    }

    public void setTotalAmount(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return String.format("Заказ %s: %s - %.2f руб. [%s] - %s", id, customerName, totalPrice, status, items);
    }
}
