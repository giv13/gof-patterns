package ru.giv13.design.state;

public class CancelledState extends OrderState {
    public CancelledState(OrderContext order) {
        super(order);
    }

    @Override
    public void cancel() {
        System.out.println("🚫 Заказ уже отменен");
    }

    @Override
    public void confirm() {
        System.out.println("🚫 Нельзя подтвердить отмененный заказ");
    }

    @Override
    public void prepare() {
        System.out.println("🚫 Нельзя приготовить отмененный заказ");
    }

    @Override
    public void deliver() {
        System.out.println("🚫 Нельзя доставить отмененный заказ");
    }
}
