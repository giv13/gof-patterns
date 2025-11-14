package ru.giv13.design.visitor;

import ru.giv13.design.delievery.Order;

import java.util.List;

public class GroceryOrder extends Order implements OrderElement {
    private final String store;
    private final boolean isRequiresRefrigeration;

    public GroceryOrder(String id, String customerName, List<String> items, double totalPrice, String store, boolean isRequiresRefrigeration) {
        super(id, customerName, items, totalPrice);
        this.store = store;
        this.isRequiresRefrigeration = isRequiresRefrigeration;
    }

    public String getStore() {
        return store;
    }

    public boolean isRequiresRefrigeration() {
        return isRequiresRefrigeration;
    }

    @Override
    public void accept(OrderVisitor visitor) {
        visitor.visit(this);
    }
}
