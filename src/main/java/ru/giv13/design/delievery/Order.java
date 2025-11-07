package ru.giv13.design.delievery;

import java.util.List;

public class Order {
    private final String id;
    private final List<String> items;
    private final double totalPrice;

    public Order(String id, List<String> items, double totalPrice) {
        this.id = id;
        this.items = items;
        this.totalPrice = totalPrice;
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
}
