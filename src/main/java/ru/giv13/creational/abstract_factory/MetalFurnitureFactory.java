package ru.giv13.creational.abstract_factory;

import ru.giv13.creational.product.chair.Chair;
import ru.giv13.creational.product.chair.MetalChair;
import ru.giv13.creational.product.table.MetalTable;
import ru.giv13.creational.product.table.Table;

public class MetalFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new MetalChair();
    }

    @Override
    public Table createTable() {
        return new MetalTable();
    }
}
