package ru.giv13.design.command;

import ru.giv13.design.delievery.Order;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        OrderSystem orderSystem = new OrderSystem();
        OrderInvoker orderInvoker = new OrderInvoker();
        Order order = new Order("001", "Иван Иванов", Arrays.asList("Пицца Маргарита", "Чизбургер"), 500.0);

        OrderCommand create = new CreateOrderCommand(orderSystem, order);
        orderInvoker.executeCommand(create);

        OrderCommand confirm = new ConfirmOrderCommand(orderSystem, order);
        orderInvoker.executeCommand(confirm);

        orderInvoker.undoLastCommand();
        orderInvoker.undoLastCommand();
    }
}
