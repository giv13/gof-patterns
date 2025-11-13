package ru.giv13.design.template_method;

import ru.giv13.design.delievery.Order;

public class FastFoodProcessor extends OrderProcessor {
    @Override
    protected void cookOrder(Order order) {
        System.out.println("🍔 ПРИГОТОВЛЕНИЕ ФАСТФУДА:");
        System.out.println("   - Используем конвейерную систему");
        System.out.println("   - Одновременно готовим несколько заказов");
        for (String item : order.getItems()) {
            System.out.println("   - Готовим: " + item);
        }
    }

    @Override
    protected void packageOrder(Order order) {
        System.out.println("📦 УПАКОВКА ФАСТФУДА:");
        System.out.println("   - Бумажные пакеты и картонные коробки");
        System.out.println("   - Одноразовые приборы и салфетки");
        System.out.println("   - Отдельные пакеты для напитков");
    }

    @Override
    protected void deliverOrder(Order order) {
        System.out.println("🚴 ДОСТАВКА ФАСТФУДА:");
        System.out.println("   - Курьер на велосипеде/самокате");
        System.out.println("   - GPS-трекинг в реальном времени");
        System.out.println("   - Бесконтактная передача заказа");
    }

    @Override
    protected boolean needSpecialPreparation() {
        return true;
    }

    @Override
    protected void performSpecialPreparation(Order order) {
        System.out.println("🎯 СПЕЦИАЛЬНАЯ ПОДГОТОВКА ФАСТФУДА:");
        System.out.println("   - Дополнительный контроль скорости");
        System.out.println("   - Проверка температуры блюд перед упаковкой");
    }
}
