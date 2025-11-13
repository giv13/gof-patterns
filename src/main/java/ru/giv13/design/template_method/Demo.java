package ru.giv13.design.template_method;

import ru.giv13.design.delievery.Order;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Order fastFoodOrder = new Order("FF_001", "Иван Быстров", Arrays.asList("Чизбургер", "Картофель фри", "Кола"), 450.0);
        System.out.println("1. 🍔 ОБРАБОТКА ЗАКАЗА ФАСТФУДА:");
        OrderProcessor fastFoodProcessor = new FastFoodProcessor();
        fastFoodProcessor.processOrder(fastFoodOrder);

        Order pizzaOrder = new Order("PZ_001", "Петр Пиццаев", Arrays.asList("Пицца Пепперони", "Пицца сырная", "Лимонад"), 890.0);
        System.out.println("\n2. 🍕 ОБРАБОТКА ЗАКАЗА ПИЦЦЫ:");
        OrderProcessor pizzaProcessor = new PizzaProcessor();
        pizzaProcessor.processOrder(pizzaOrder);
    }
}
