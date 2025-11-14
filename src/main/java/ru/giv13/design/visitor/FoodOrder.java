package ru.giv13.design.visitor;

import ru.giv13.design.delievery.Order;

import java.util.List;

public class FoodOrder extends Order implements OrderElement {
    private final String restaurant;
    private final int preparationTime;
    private final boolean isVegetarian;

    public FoodOrder(String id, String customerName, List<String> items, double totalPrice, String restaurant, int preparationTime, boolean isVegetarian) {
        super(id, customerName, items, totalPrice);
        this.restaurant = restaurant;
        this.preparationTime = preparationTime;
        this.isVegetarian = isVegetarian;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    @Override
    public void accept(OrderVisitor visitor) {
        visitor.visit(this);
    }
}
