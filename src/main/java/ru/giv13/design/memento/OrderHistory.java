package ru.giv13.design.memento;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class OrderHistory {
    private final Map<String, Deque<OrderMemento>> history = new HashMap<>();
    private final int maxHistorySize;

    public OrderHistory(int maxHistorySize) {
        this.maxHistorySize = maxHistorySize;
    }

    public void saveState(OrderOriginator order, String description) {
        String orderId = order.getId();
        OrderMemento memento = order.createMemento(description);
        Deque<OrderMemento> orderHistory = history.computeIfAbsent(orderId, h -> new ArrayDeque<>());
        orderHistory.addFirst(memento);
        if (orderHistory.size() > maxHistorySize) {
            orderHistory.pollLast();
        }
    }

    public boolean undo(OrderOriginator order) {
        String orderId = order.getId();
        Deque<OrderMemento> orderHistory = history.get(orderId);
        if (orderHistory == null || orderHistory.isEmpty()) {
            System.out.println("❌ Нет снимков для заказа " + orderId);
            return false;
        }
        OrderMemento memento = orderHistory.pollFirst();
        order.restoreFromMemento(memento);
        return true;
    }

    public void showHistory(String orderId) {
        Deque<OrderMemento> orderHistory = history.get(orderId);
        System.out.println("\n📜 История снимков заказа " + orderId + ":");
        if (orderHistory == null || orderHistory.isEmpty()) {
            System.out.println("   История пуста");
        } else {
            int i = 1;
            for (OrderMemento memento : orderHistory) {
                System.out.println("   " + i++ + ". " + memento);
            }
        }
    }
}
