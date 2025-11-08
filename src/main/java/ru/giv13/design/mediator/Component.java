package ru.giv13.design.mediator;

import ru.giv13.design.delievery.Order;

public abstract class Component {
    protected Mediator mediator;
    protected String name;

    public Component(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public void send(String event, Order order) {
        System.out.println("📤 " + name + " отправляет событие: " + event);
        mediator.notify(this, event, order);
    }

    public abstract void receive(String event, Order order);
}
