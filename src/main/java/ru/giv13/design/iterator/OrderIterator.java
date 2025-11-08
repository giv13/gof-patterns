package ru.giv13.design.iterator;

import ru.giv13.design.delievery.Order;

public interface OrderIterator {
    boolean hasNext();
    Order next();
    void reset();
}
