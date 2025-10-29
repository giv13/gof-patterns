package ru.giv13.product.chair;

public class WoodenChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Сижу на деревянном стуле.");
    }
}
