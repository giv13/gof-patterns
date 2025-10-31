package ru.giv13.prototype;

public class Chair implements Prototype {
    private final String model;
    private final String material;
    private double price;

    public Chair(String model, String material, double price) {
        this.model = model;
        this.material = material;
        this.price = price;
    }

    // Копирующий конструктор
    private Chair(Chair source) {
        this.model = source.model;
        this.material = source.material;
        this.price = source.price;
    }

    @Override
    public Chair copy() {
        return new Chair(this);
    }

    public void applyDiscount(double discount) {
        price *= (1 - discount);
    }

    @Override
    public String toString() {
        return String.format("Chair{model='%s', material='%s', price=%.2f}",
                model, material, price);
    }
}
