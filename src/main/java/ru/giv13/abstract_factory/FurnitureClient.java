package ru.giv13.abstract_factory;

import ru.giv13.product.chair.Chair;
import ru.giv13.product.table.Table;

public class FurnitureClient {
    private final Chair chair;
    private final Table table;

    public FurnitureClient(FurnitureFactory factory) {
        chair = factory.createChair();
        table = factory.createTable();
    }

    public void useFurniture() {
        chair.sitOn();
        table.putOn();
    }
}
