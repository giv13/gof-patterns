package ru.giv13.design.visitor;

import java.util.HashMap;
import java.util.Map;

public class PricingCalculatorVisitor implements OrderVisitor {
    private double totalRevenue = 0;
    private final Map<String, Double> categoryRevenue = new HashMap<>();

    @Override
    public void visit(FoodOrder order) {
        double price = order.getTotalPrice();
        totalRevenue += price;
        categoryRevenue.merge("Еда", price, Double::sum);
        System.out.printf("💰 ЕДА: Заказ %s - %.2f руб.%n", order.getId(), price);
    }

    @Override
    public void visit(GroceryOrder order) {
        double price = order.getTotalPrice();
        totalRevenue += price;
        categoryRevenue.merge("Продукты", price, Double::sum);
        double deliveryFee = order.isRequiresRefrigeration() ? 100 : 50;
        System.out.printf("💰 ПРОДУКТЫ: Заказ %s - %.2f руб. (доставка: %.2f)%n", order.getId(), price, deliveryFee);
    }

    public void printRevenueReport() {
        System.out.println("📊 ОТЧЕТ ПО ВЫРУЧКЕ ПО КАТЕГОРИЯМ:");
        categoryRevenue.forEach((category, revenue) -> {
            System.out.printf("   %s: %.2f руб.%n", category, revenue);
        });
        System.out.printf("   ОБЩАЯ ВЫРУЧКА: %.2f руб.%n", totalRevenue);
    }
}
