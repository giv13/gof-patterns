package ru.giv13.design.chain_of_responsibility;

import ru.giv13.design.delievery.Order;

import java.util.HashMap;
import java.util.Map;

public class AvailabilityHandler extends OrderHandler {
    private final Map<String, Boolean> menuAvailability;

    public AvailabilityHandler() {
        this.menuAvailability = new HashMap<>();
        menuAvailability.put("Пицца Маргарита", true);
        menuAvailability.put("Чизбургер", false);
    }

    @Override
    protected boolean isValid(Order order) {
        for (String item : order.getItems()) {
            Boolean available = menuAvailability.get(item);
            if (available == null || !available) {
                return false;
            }
        }
        return true;
    }

    @Override
    protected void handle(Order order) {
        System.out.println("🚫 Заказ " + order.getId() + " отклонен: некоторые блюда недоступны");
    }
}
