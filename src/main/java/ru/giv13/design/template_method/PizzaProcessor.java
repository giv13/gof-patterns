package ru.giv13.design.template_method;

import ru.giv13.design.delievery.Order;

public class PizzaProcessor extends OrderProcessor {
    @Override
    protected void cookOrder(Order order) {
        System.out.println("🍕 ПРИГОТОВЛЕНИЕ ПИЦЦЫ:");
        System.out.println("   - Дровяная печь при 400°C");
        System.out.println("   - Свежее тесто ручной раскатки");
        for (String item : order.getItems()) {
            if (item.toLowerCase().contains("пицца")) {
                System.out.println("   - Выпекаем пиццу: " + item);
            }
        }
    }

    @Override
    protected void packageOrder(Order order) {
        System.out.println("📦 УПАКОВКА ПИЦЦЫ:");
        System.out.println("   - Специальные картонные коробки для пиццы");
        System.out.println("   - Термопакеты для сохранения температуры");
        System.out.println("   - Отделение для соусов и специй");
    }

    @Override
    protected void deliverOrder(Order order) {
        System.out.println("🏍️ ДОСТАВКА ПИЦЦЫ:");
        System.out.println("   - Курьер на мотоцикле с термо-сумкой");
        System.out.println("   - Гарантия горячей пиццы");
        System.out.println("   - Акция: 'Не успеем за 30 минут - пицца бесплатно!'");
    }
}
