package ru.giv13.design.visitor;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<OrderElement> orders = Arrays.asList(
                new FoodOrder("FOOD_001", "Иван Петров", Arrays.asList("Пицца Маргарита", "Картофель фри", "Кола"), 1250.0, "Пицца Мария", 20, false),
                new GroceryOrder("GROC_001", "Ольга Новикова", Arrays.asList("Молоко", "Хлеб", "Яйца", "Сыр"), 650.0, "Пятерочка", true),
                new FoodOrder("FOOD_002", "Мария Сидорова", Arrays.asList("Салат Цезарь", "Суши Филадельфия", "Зеленый чай"), 1800.0, "Токио Суши", 15, true),
                new GroceryOrder("GROC_002", "Петр Иванов", Arrays.asList("Яблоки", "Бананы", "Апельсины"), 480.0, "Магнит", false),
                new GroceryOrder("GROC_003", "Елена Смирнова", Arrays.asList("Курица", "Рис", "Огурцы", "Помидоры"), 1200.0, "Ашан", true),
                new FoodOrder("FOOD_003", "Алексей Козлов", Arrays.asList("Бургер Чизбургер", "Картофель по-деревенски"), 890.0, "Burger King", 12, false)
        );

        System.out.println("1. 🚚 ПОДГОТОВКА ДОСТАВКИ:");
        DeliveryPreparationVisitor deliveryVisitor = new DeliveryPreparationVisitor();
        for (OrderElement order : orders) {
            order.accept(deliveryVisitor);
        }

        System.out.println("\n2. 💰 РАСЧЕТ СТОИМОСТИ:");
        PricingCalculatorVisitor pricingVisitor = new PricingCalculatorVisitor();
        for (OrderElement order : orders) {
            order.accept(pricingVisitor);
        }
        pricingVisitor.printRevenueReport();
    }
}
