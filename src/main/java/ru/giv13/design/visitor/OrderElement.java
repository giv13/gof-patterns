package ru.giv13.design.visitor;

public interface OrderElement {
    void accept(OrderVisitor visitor);
}
