package ru.giv13.simple_factory;

import ru.giv13.product.chair.Chair;

public class Demo {
    public static void main(String[] args) {
        SimpleChairFactory factory = new SimpleChairFactory();

        Chair chair1 = factory.createChair("wooden");
        chair1.sitOn(); // Сижу на деревянном стуле.

        Chair chair2 = factory.createChair("metal");
        chair2.sitOn(); // Сижу на металлическом стуле.
    }
}
