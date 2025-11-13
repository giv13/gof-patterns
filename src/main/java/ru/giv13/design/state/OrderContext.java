package ru.giv13.design.state;

import ru.giv13.design.delievery.Order;

import java.util.List;

public class OrderContext extends Order {
    private OrderState state;

    public OrderContext(String id, String customerName, List<String> items, double totalPrice) {
        super(id, customerName, items, totalPrice);
        this.state = new ReceivedState(this);
    }

    public void cancel() {
        System.out.printf("🔄 Попытка отменить заказ %s: ", id);
        state.cancel();
    }

    public void confirm() {
        System.out.printf("🔄 Попытка подтвердить заказ %s: ", id);
        state.confirm();
    }

    public void prepare() {
        System.out.printf("🔄 Попытка приготовить заказ %s: ", id);
        state.prepare();
    }

    public void deliver() {
        System.out.printf("🔄 Попытка доставить заказ %s: ", id);
        state.deliver();
    }

    void changeState(OrderState state) {
        this.state = state;
    }
}
