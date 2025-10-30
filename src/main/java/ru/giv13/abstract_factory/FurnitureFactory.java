package ru.giv13.abstract_factory;

import ru.giv13.product.chair.Chair;
import ru.giv13.product.table.Table;

public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
}
