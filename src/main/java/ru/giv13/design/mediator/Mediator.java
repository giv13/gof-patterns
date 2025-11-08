package ru.giv13.design.mediator;

import ru.giv13.design.delievery.Order;

public interface Mediator {
    void notify(Component sender, String event, Order order);
}
