package ru.giv13.design.observer;

import ru.giv13.design.delievery.Order;

public interface OrderObserver {
    void update(Order order);
}
