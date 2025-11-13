package ru.giv13.design.state;

public abstract class OrderState {
    protected OrderContext order;

    public OrderState(OrderContext order) {
        this.order = order;
    }

    public abstract void cancel();
    public abstract void confirm();
    public abstract void prepare();
    public abstract void deliver();
}
