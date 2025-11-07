package ru.giv13.design.chain_of_responsibility;

import ru.giv13.design.delievery.Order;

public abstract class OrderHandler {
    protected OrderHandler nextHandler;

    public OrderHandler setNext(OrderHandler handler) {
        this.nextHandler = handler;
        return handler; // Позволяет строить цепочку в fluent-стиле
    }

    public final boolean process(Order order) {
        if (!isValid(order)) {
            handle(order);
            return false;
        }

        if (nextHandler != null) {
            return nextHandler.process(order);
        }

        return true;
    }

    protected abstract boolean isValid(Order order);

    protected abstract void handle(Order order);

}
