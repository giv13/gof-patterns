package ru.giv13.design.observer;

import ru.giv13.design.delievery.Order;
import ru.giv13.design.delievery.OrderStatus;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        CustomerNotifier customer = new CustomerNotifier("+7-999-123-45-67");
        RestaurantNotifier restaurant = new RestaurantNotifier("REST_007");
        CourierNotifier courier = new CourierNotifier("COURIER_123");
        OrderTracker orderTracker = new OrderTracker()
                .subscribe(customer)
                .subscribe(restaurant)
                .subscribe(courier);
        Order order = new Order("001", "Иван Иванов", Arrays.asList("Пицца Маргарита", "Кола"), 850.0);
        orderTracker.createOrder(order);

        orderTracker.updateStatus(OrderStatus.CONFIRMED);
        try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
        orderTracker.updateStatus(OrderStatus.COOKING);
        try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
        orderTracker.updateStatus(OrderStatus.READY_FOR_DELIVERY);
        try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
        courier.setAvailable(false);
        orderTracker.updateStatus(OrderStatus.ON_THE_WAY);
        try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
        courier.setAvailable(true);
        orderTracker.updateStatus(OrderStatus.DELIVERED);
        try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
        orderTracker.unsubscribe(customer);
        orderTracker.updateStatus(OrderStatus.CANCELLED);
    }
}
