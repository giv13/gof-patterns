package ru.giv13.design.command;

import ru.giv13.design.delievery.Order;
import ru.giv13.design.delievery.OrderStatus;

public class ConfirmOrderCommand implements OrderCommand {
    private final OrderSystem orderSystem;
    private final Order order;
    private OrderStatus previousStatus;

    public ConfirmOrderCommand(OrderSystem orderSystem, Order order) {
        this.orderSystem = orderSystem;
        this.order = order;
    }

    @Override
    public void execute() {
        previousStatus = order.getStatus();
        orderSystem.updateOrderStatus(order.getId(), OrderStatus.CONFIRMED);
    }

    @Override
    public void undo() {
        orderSystem.updateOrderStatus(order.getId(), previousStatus);
    }
}
