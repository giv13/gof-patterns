package ru.giv13.design.iterator;

import ru.giv13.design.delievery.Order;

public interface OrderCollection {
    OrderIterator createIterator();
    void addOrder(Order order);
    int size();
}
