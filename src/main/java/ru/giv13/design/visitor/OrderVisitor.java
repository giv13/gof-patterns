package ru.giv13.design.visitor;

public interface OrderVisitor {
    void visit(FoodOrder order);
    void visit(GroceryOrder order);
}
