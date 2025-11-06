package ru.giv13.creational.abstract_factory;

import ru.giv13.creational.product.chair.Chair;
import ru.giv13.creational.product.table.Table;

public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
}
