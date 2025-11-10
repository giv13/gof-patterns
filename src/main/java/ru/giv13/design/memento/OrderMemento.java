package ru.giv13.design.memento;

import java.util.Date;

public class OrderMemento {
    private final OrderOriginator order;
    private final Date timestamp;
    private final String description;

    public OrderMemento(OrderOriginator order, String description) {
        this.order = order.copy();
        this.timestamp = new Date();
        this.description = description;
    }

    public OrderOriginator getOrder() {
        return order;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return String.format("Снимок [%s]: %s -> %s (%s)", order.getId(), order.getStatus(), description, timestamp);
    }
}
