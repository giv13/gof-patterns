package ru.giv13.creational.prototype;

public class Demo {
    public static void main(String[] args) {
        Chair original = new Chair("Эргономик", "металл", 150.0);
        Chair copy = original.copy();
        copy.applyDiscount(0.1); // -10%

        System.out.println("Оригинал: " + original);
        System.out.println("Копия: " + copy);
    }
}
