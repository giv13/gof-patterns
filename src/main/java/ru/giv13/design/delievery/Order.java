package ru.giv13.design.delievery;

import java.util.List;

public class Order {
    private final String id;
    private final List<String> items;
    private final double totalPrice;
    private OrderStatus status;

    public Order(String id, List<String> items, double totalPrice) {
        this.id = id;
        this.items = items;
        this.totalPrice = totalPrice;
        this.status = OrderStatus.CREATED;
    }

    public String getId() {
        return id;
    }

    public List<String> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
