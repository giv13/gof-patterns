package ru.giv13.design.mediator;

import ru.giv13.design.delievery.Order;

public class DeliveryMediator implements Mediator {
    private KitchenService kitchen;
    private CourierService courier;
    private CustomerService customer;

    public void setComponents(KitchenService kitchen, CourierService courier, CustomerService customer) {
        this.kitchen = kitchen;
        this.courier = courier;
        this.customer = customer;
    }

    @Override
    public void notify(Component sender, String event, Order order) {
        switch (event) {
            case "NEW_ORDER":
                kitchen.receive("START_COOKING", order);
                customer.receive("ORDER_CONFIRMED", order);
                break;
            case "ORDER_READY":
                courier.receive("PICKUP_ORDER", order);
                customer.receive("ORDER_READY", order);
                break;
            case "ORDER_PICKED_UP":
                customer.receive("ON_THE_WAY", order);
                break;
            case "ORDER_DELIVERED":
                customer.receive("DELIVERED", order);
                break;
        }
    }
}
