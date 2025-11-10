package ru.giv13.design.observer;

import ru.giv13.design.delievery.Order;

public class RestaurantNotifier implements OrderObserver {
    private final String restaurantId;

    public RestaurantNotifier(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    @Override
    public void update(Order order) {
        switch (order.getStatus()) {
            case CREATED:
                System.out.printf("👨‍🍳 Уведомление ресторану %s: НОВЫЙ ЗАКАЗ %s от %s%n", restaurantId, order.getId(), order.getCustomerName());
                break;
            case COOKING:
                System.out.printf("👨‍🍳 Ресторан %s: Начинаем готовить заказ %s%n", restaurantId, order.getId());
                break;
            case CANCELLED:
                System.out.printf("👨‍🍳 Уведомление ресторану %s: ЗАКАЗ ОТМЕНЕН %s%n", restaurantId, order.getId());
                break;
        }
    }
}
