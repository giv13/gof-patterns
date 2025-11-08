package ru.giv13.design.mediator;

import ru.giv13.design.delievery.Order;

public class CustomerService extends Component {
    public CustomerService(Mediator mediator) {
        super(mediator, "CUSTOMER");
    }

    @Override
    public void receive(String event, Order order) {
        String message = switch (event) {
            case "ORDER_CONFIRMED" -> "✅ Заказ подтвержден";
            case "ORDER_READY" -> "📦 Заказ готов";
            case "ON_THE_WAY" -> "🚗 Курьер в пути";
            case "DELIVERED" -> "🎉 Заказ доставлен!";
            default -> "ℹ️ Статус обновлен";
        };

        System.out.println("📱 Клиенту " + order.getCustomerName() + ": " + message);
    }
}
