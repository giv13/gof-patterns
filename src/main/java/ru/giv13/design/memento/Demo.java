package ru.giv13.design.memento;

import ru.giv13.design.delievery.OrderStatus;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        OrderOriginator order = new OrderOriginator("ORD_001", "Иван Иванов", Arrays.asList("Пицца Маргарита", "Кола"), 850.0);
        OrderHistory history = new OrderHistory(5);

        System.out.println(order);
        history.saveState(order, "Новый заказ");

        order.setStatus(OrderStatus.CONFIRMED);
        order.setItems(Arrays.asList("Пицца Маргарита", "Кола", "Салат Цезарь"));
        order.setTotalAmount(1050.0);
        System.out.println("\nПосле первых изменений: " + order);
        history.saveState(order, "Добавлен салат");

        order.setItems(Arrays.asList("Пицца Маргарита", "Кола", "Салат Цезарь", "Чизкейк"));
        order.setTotalAmount(1300.0);
        System.out.println("\nПосле вторых изменений: " + order);

        history.showHistory("ORD_001");

        System.out.println("\nТекущее состояние: " + order);
        if (history.undo(order)) {
            System.out.println("После первого отката: " + order);
        }
        if (history.undo(order)) {
            System.out.println("После второго отката: " + order);
        }
    }
}
