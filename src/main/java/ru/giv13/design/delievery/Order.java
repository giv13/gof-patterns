package ru.giv13.design.delievery;

import java.util.List;

public class Order {
    protected final String id;
    protected String customerName;
    protected List<String> items;
    protected double totalPrice;
    protected OrderStatus status;

    public Order(String id, String customerName, List<String> items, double totalPrice) {
        this.id = id;
        this.customerName = customerName;
        this.items = items;
        this.totalPrice = totalPrice;
        this.status = OrderStatus.CREATED;
    }

    public Order(String id, String customerName, List<String> items, double totalPrice, OrderStatus status) {
        this.id = id;
        this.customerName = customerName;
        this.items = items;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
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
