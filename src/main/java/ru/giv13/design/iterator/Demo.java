package ru.giv13.design.iterator;

import ru.giv13.design.delievery.Order;
import ru.giv13.design.delievery.OrderStatus;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        OrderList orders = new OrderList();
        orders.addOrder(new Order("001", List.of("Пицца Маргарита", "Кола"), 850.0, OrderStatus.DELIVERED));
        orders.addOrder(new Order("002", List.of("Суши Филадельфия"), 1200.0, OrderStatus.CONFIRMED));
        orders.addOrder(new Order("003", List.of("Бургер", "Картофель фри"), 450.0, OrderStatus.COOKING));
        orders.addOrder(new Order("004", List.of("Салат Цезарь"), 350.0, OrderStatus.READY_FOR_DELIVERY));
        orders.addOrder(new Order("005", List.of("Паста Карбонара", "Салат"), 950.0, OrderStatus.COOKING));

        OrderIterator iterator = orders.createStatusIterator(OrderStatus.COOKING);
        while (iterator.hasNext()) {
            Order order = iterator.next();
            System.out.println("Найден заказ: " + order.getId());
        }

        iterator = orders.createPriceIterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            System.out.println("Найден заказ: " + order.getId() + "; цена: " + order.getTotalPrice());
        }
    }
}
