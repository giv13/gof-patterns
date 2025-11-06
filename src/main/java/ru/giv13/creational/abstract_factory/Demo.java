package ru.giv13.creational.abstract_factory;

public class Demo {
    public static void main(String[] args) {
        FurnitureFactory factory;

        factory = new WoodenFurnitureFactory();
        FurnitureClient client1 = new FurnitureClient(factory);
        client1.useFurniture(); // Сижу на деревянном стуле. Ставлю вазу на деревянный стол.

        factory = new MetalFurnitureFactory();
        FurnitureClient client2 = new FurnitureClient(factory);
        client2.useFurniture(); // Сижу на металлическом стуле. Ставлю вазу на металлический стол.
    }
}
