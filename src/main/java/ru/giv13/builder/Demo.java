package ru.giv13.builder;

public class Demo {
    public static void main(String[] args) {
        OfficeChair chair1 = new OfficeChair.ChairBuilder("5-лучевая", "нейлон")
                .hasWheels(true)
                .hasArmrests(true)
                .cushionType("стандартная")
                .color("черный")
                .maxWeight(120)
                .build();
        chair1.displaySpecifications();

        ChairDirector director = new ChairDirector();
        OfficeChair chair2 = director.createExecutiveChair();
        chair2.displaySpecifications();
    }
}
