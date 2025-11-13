package ru.giv13.design.state;

public class PreparedState extends OrderState {
    public PreparedState(OrderContext order) {
        super(order);
    }

    @Override
    public void cancel() {
        System.out.println("❌ Заказ отменен");
        order.changeState(new CancelledState(order));
    }

    @Override
    public void confirm() {
        System.out.println("🚫 Заказ уже подтвержден и приготовлен");
    }

    @Override
    public void prepare() {
        System.out.println("🚫 Заказ уже приготовлен");
    }

    @Override
    public void deliver() {
        System.out.println("✅ Заказ доставлен");
        order.changeState(new DeliveredState(order));
    }
}
