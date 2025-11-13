package ru.giv13.design.state;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        OrderContext order = new OrderContext("001", "Иван Петров", Arrays.asList("Пицца Маргарита", "Кола"), 850.0);
        order.confirm();
        order.prepare();
        order.deliver();
        order.cancel();
        order.prepare();

        OrderContext order2 = new OrderContext("002", "Мария Сидорова", Arrays.asList("Суши", "Чай"), 1200.0);
        order2.confirm();
        order2.cancel();
        order2.prepare();
        order2.deliver();
    }
}
