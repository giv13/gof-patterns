package ru.giv13.design.iterator;

import ru.giv13.design.delievery.Order;
import ru.giv13.design.delievery.OrderStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class StatusOrderIterator implements OrderIterator {
    private final List<Order> orders;
    private final OrderStatus status;
    private int position;

    public StatusOrderIterator(List<Order> orders, OrderStatus status) {
        this.orders = new ArrayList<>(orders);
        this.status = status;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        // Пропускаем заказы с неподходящим статусом
        while (position < orders.size()) {
            if (orders.get(position).getStatus() == status) {
                return true;
            }
            position++;
        }
        return false;
    }

    @Override
    public Order next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Нет больше заказов со статусом " + status);
        }
        return orders.get(position++);
    }

    @Override
    public void reset() {
        position = 0;
    }
}
