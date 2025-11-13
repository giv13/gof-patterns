package ru.giv13.design.state;

public class DeliveredState extends OrderState {
    public DeliveredState(OrderContext order) {
        super(order);
    }

    @Override
    public void cancel() {
        System.out.println("🚫 Нельзя отменить доставленный заказ");
    }

    @Override
    public void confirm() {
        System.out.println("🚫 Заказ уже подтвержден, приготовлен и доставлен");
    }

    @Override
    public void prepare() {
        System.out.println("🚫 Заказ уже приготовлен и доставлен");
    }

    @Override
    public void deliver() {
        System.out.println("🚫 Заказ уже доставлен");
    }
}
