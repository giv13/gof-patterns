package ru.giv13.design.iterator;

import ru.giv13.design.delievery.Order;

import java.util.List;

public class PriceOrderIterator extends OrderList.SimpleOrderIterator {
    public PriceOrderIterator(List<Order> orders) {
        super(orders);
        this.orders.sort((o1, o2) -> Double.compare(o2.getTotalPrice(), o1.getTotalPrice()));
    }
}
