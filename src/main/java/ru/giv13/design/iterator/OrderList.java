package ru.giv13.design.iterator;

import ru.giv13.design.delievery.Order;
import ru.giv13.design.delievery.OrderStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class OrderList implements OrderCollection {
    private final List<Order> orders = new ArrayList<>();

    @Override
    public OrderIterator createIterator() {
        // По умолчанию - простой итератор по порядку
        return new SimpleOrderIterator(orders);
    }

    @Override
    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public int size() {
        return orders.size();
    }

    // Специализированные итераторы
    public OrderIterator createStatusIterator(OrderStatus status) {
        return new StatusOrderIterator(orders, status);
    }

    public OrderIterator createPriceIterator() {
        return new PriceOrderIterator(orders);
    }

    // Простой итератор (по порядку добавления)
    protected static class SimpleOrderIterator implements OrderIterator {
        protected final List<Order> orders;
        private int position;

        public SimpleOrderIterator(List<Order> orders) {
            this.orders = new ArrayList<>(orders);
            this.position = 0;
        }

        @Override
        public boolean hasNext() {
            return position < orders.size();
        }

        @Override
        public Order next() {
            if (!hasNext()) {
                throw new NoSuchElementException("Нет больше заказов");
            }
            return orders.get(position++);
        }

        @Override
        public void reset() {
            position = 0;
        }
    }
}
