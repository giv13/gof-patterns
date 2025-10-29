package ru.giv13.factory_method;

import ru.giv13.product.chair.Chair;

public class Demo {
    public static void main(String[] args) {
        ChairCreator creator;
        
        creator = new WoodenChairCreator();
        Chair chair1 = creator.createChair();
        chair1.sitOn(); // Сижу на деревянном стуле.

        creator = new MetalChairCreator();
        Chair chair2 = creator.createChair();
        chair2.sitOn(); // Сижу на металлическом стуле.
    }
}
