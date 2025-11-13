package ru.giv13.design.state;

public class ReceivedState extends OrderState {
    public ReceivedState(OrderContext order) {
        super(order);
    }

    @Override
    public void cancel() {
        System.out.println("❌ Заказ отменен");
        order.changeState(new CancelledState(order));
    }

    @Override
    public void confirm() {
        System.out.println("✅ Заказ подтвержден");
        order.changeState(new ConfirmedState(order));
    }

    @Override
    public void prepare() {
        System.out.println("🚫 Нельзя приготовить неподтвержденный заказ");
    }

    @Override
    public void deliver() {
        System.out.println("🚫 Нельзя доставить неподтвержденный заказ");
    }
}
