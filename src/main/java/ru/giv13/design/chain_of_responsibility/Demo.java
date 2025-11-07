package ru.giv13.design.chain_of_responsibility;

import ru.giv13.design.delievery.Order;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        OrderHandler minAmount = new MinimumAmountHandler();
        OrderHandler availability = new AvailabilityHandler();
        minAmount.setNext(availability);

        Order order = new Order("001", Arrays.asList("Пицца Маргарита", "Чизбургер"), 500.0);
        if (minAmount.process(order)) {
            System.out.println("✅ Заказ " + order.getId() + " подтвержден!");
        }
    }
}
