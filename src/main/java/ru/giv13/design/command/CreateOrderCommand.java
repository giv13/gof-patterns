package ru.giv13.design.command;

import ru.giv13.design.delievery.Order;

public class CreateOrderCommand implements OrderCommand {
    private final OrderSystem orderSystem;
    private final Order order;

    public CreateOrderCommand(OrderSystem orderSystem, Order order) {
        this.orderSystem = orderSystem;
        this.order = order;
    }

    @Override
    public void execute() {
        orderSystem.createOrder(order);
    }

    @Override
    public void undo() {
        orderSystem.cancelOrder(order.getId());
    }
}
