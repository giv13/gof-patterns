package ru.giv13.design.chain_of_responsibility;

import ru.giv13.design.delievery.Order;

public class MinimumAmountHandler extends OrderHandler {
    private static final double MIN_PRICE = 300.0;

    @Override
    protected boolean isValid(Order order) {
        return order.getTotalPrice() >= MIN_PRICE;
    }

    @Override
    protected void handle(Order order) {
        System.out.println("🚫 Заказ " + order.getId() + " отклонен: сумма " + order.getTotalPrice() + " меньше минимальной " + MIN_PRICE);
    }
}
