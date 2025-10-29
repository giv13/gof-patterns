package ru.giv13.factory_method;

import ru.giv13.product.chair.Chair;
import ru.giv13.product.chair.MetalChair;

public class MetalChairCreator extends ChairCreator {
    @Override
    public Chair createChair() {
        return new MetalChair();
    }
}
