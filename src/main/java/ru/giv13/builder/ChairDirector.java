package ru.giv13.builder;

public class ChairDirector {
    public OfficeChair createExecutiveChair() {
        return new OfficeChair.ChairBuilder("4-лучевая", "алюминий")
                .hasWheels(true)
                .hasArmrests(true)
                .cushionType("кожаная премиум")
                .color("коричневый")
                .maxWeight(150)
                .build();
    }
}
