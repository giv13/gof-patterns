package ru.giv13.product.table;

public class MetalTable implements Table {
    @Override
    public void putOn() {
        System.out.println("Ставлю вазу на металлический стол.");
    }
}
