package ru.giv13.creational.product.chair;

public class MetalChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Сижу на металлическом стуле.");
    }
}
