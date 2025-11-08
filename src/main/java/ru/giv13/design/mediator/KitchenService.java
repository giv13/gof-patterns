package ru.giv13.design.mediator;

import ru.giv13.design.delievery.Order;

public class KitchenService extends Component {
    public KitchenService(Mediator mediator) {
        super(mediator, "KITCHEN");
    }

    public void receiveOrder(Order order) {
        System.out.println("👨‍🍳 Кухня получила заказ: " + order.getId());
        send("NEW_ORDER", order);
    }

    @Override
    public void receive(String event, Order order) {
        switch (event) {
            case "START_COOKING":
                System.out.println("👨‍🍳 Готовим: " + order.getItems());
                // Имитируем приготовление
                new Thread(() -> {
                    try {
                        Thread.sleep(2000);
                        System.out.println("✅ Заказ готов: " + order.getId());
                        send("ORDER_READY", order);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }).start();
                break;
        }
    }
}
