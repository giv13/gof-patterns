package ru.giv13.creational.factory_method;

import ru.giv13.creational.product.chair.Chair;
import ru.giv13.creational.product.chair.MetalChair;

public class MetalChairCreator extends ChairCreator {
    @Override
    public Chair createChair() {
        return new MetalChair();
    }
}
