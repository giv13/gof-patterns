package ru.giv13.design.mediator;

import ru.giv13.design.delievery.Order;

public class CourierService extends Component {
    public CourierService(Mediator mediator) {
        super(mediator, "COURIER");
    }

    @Override
    public void receive(String event, Order order) {
        switch (event) {
            case "PICKUP_ORDER":
                System.out.println("🚴 Курьер выехал за заказом: " + order.getId());
                // Имитируем доставку
                new Thread(() -> {
                    try {
                        Thread.sleep(1500);
                        System.out.println("📦 Курьер забрал заказ: " + order.getId());
                        send("ORDER_PICKED_UP", order);

                        Thread.sleep(2000);
                        System.out.println("🏠 Заказ доставлен: " + order.getId());
                        send("ORDER_DELIVERED", order);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }).start();
                break;
        }
    }
}
