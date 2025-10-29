package ru.giv13.factory_method;

import ru.giv13.product.chair.Chair;

public abstract class ChairCreator {
    public abstract Chair createChair();
}
