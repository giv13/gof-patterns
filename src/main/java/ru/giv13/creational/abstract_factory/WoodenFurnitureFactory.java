package ru.giv13.creational.abstract_factory;

import ru.giv13.creational.product.chair.Chair;
import ru.giv13.creational.product.chair.WoodenChair;
import ru.giv13.creational.product.table.Table;
import ru.giv13.creational.product.table.WoodenTable;

public class WoodenFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new WoodenChair();
    }

    @Override
    public Table createTable() {
        return new WoodenTable();
    }
}
