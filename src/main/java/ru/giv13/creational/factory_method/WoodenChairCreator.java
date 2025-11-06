package ru.giv13.creational.factory_method;

import ru.giv13.creational.product.chair.Chair;
import ru.giv13.creational.product.chair.WoodenChair;

public class WoodenChairCreator extends ChairCreator {
    @Override
    public Chair createChair() {
        return new WoodenChair();
    }
}
