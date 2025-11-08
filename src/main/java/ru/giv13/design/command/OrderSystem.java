package ru.giv13.design.command;

import ru.giv13.design.delievery.Order;
import ru.giv13.design.delievery.OrderStatus;

import java.util.HashMap;
import java.util.Map;

public class OrderSystem {
    private final Map<String, Order> orders = new HashMap<>();

    public void createOrder(Order order) {
        orders.put(order.getId(), order);
        System.out.println("🆕 Создан заказ: " + order.getId() + " для " + order.getCustomerName());
    }

    public void cancelOrder(String orderId) {
        Order order = orders.remove(orderId);
        if (order != null) {
            System.out.println("🚫 Отменен заказ: " + orderId);
        }
    }

    public void updateOrderStatus(String orderId, OrderStatus status) {
        Order order = orders.get(orderId);
        if (order != null) {
            order.setStatus(status);
            System.out.println("🔄 Статус заказа " + orderId + " изменен на: " + status);
        }
    }
}
