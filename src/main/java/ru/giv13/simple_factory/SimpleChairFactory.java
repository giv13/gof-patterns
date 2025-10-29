package ru.giv13.simple_factory;

import ru.giv13.product.chair.Chair;
import ru.giv13.product.chair.MetalChair;
import ru.giv13.product.chair.WoodenChair;

public class SimpleChairFactory {
    public Chair createChair(String type) {
        return switch (type.toLowerCase()) {
            case "wooden" -> new WoodenChair();
            case "metal" -> new MetalChair();
            default -> throw new IllegalArgumentException("Неизвестный тип стула");
        };
    }
}
