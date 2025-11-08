package ru.giv13.design.mediator;

import ru.giv13.design.delievery.Order;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        DeliveryMediator mediator = new DeliveryMediator();
        KitchenService kitchen = new KitchenService(mediator);
        CourierService courier = new CourierService(mediator);
        CustomerService customer = new CustomerService(mediator);
        mediator.setComponents(kitchen, courier, customer);

        Order order1 = new Order("001", "Иван Иванов", Arrays.asList("Пицца Маргарита", "Кола"), 850.0);
        Order order2 = new Order("002", "Мария Петрова", Arrays.asList("Суши Филадельфия", "Мисо-суп"), 1200.0);

        kitchen.receiveOrder(order1);
        try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
        kitchen.receiveOrder(order2);
    }
}
