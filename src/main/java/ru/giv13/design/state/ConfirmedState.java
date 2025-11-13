package ru.giv13.design.state;

public class ConfirmedState extends OrderState {
    public ConfirmedState(OrderContext order) {
        super(order);
    }

    @Override
    public void cancel() {
        System.out.println("❌ Заказ отменен");
        order.changeState(new CancelledState(order));
    }

    @Override
    public void confirm() {
        System.out.println("🚫 Заказ уже подтвержден");
    }

    @Override
    public void prepare() {
        System.out.println("✅ Заказ приготовлен");
        order.changeState(new PreparedState(order));
    }

    @Override
    public void deliver() {
        System.out.println("🚫 Нельзя доставить неготовый заказ");
    }
}
