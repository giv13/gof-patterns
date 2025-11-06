package ru.giv13.creational.builder;

public class OfficeChair {
    private final String baseType;     // обязательный
    private final String material;     // обязательный
    private final boolean hasWheels;   // опциональный
    private final boolean hasArmrests; // опциональный
    private final String cushionType;  // опциональный
    private final String color;        // опциональный
    private final int maxWeight;       // опциональный

    // Приватный конструктор - создаем только через Builder
    private OfficeChair(ChairBuilder builder) {
        this.baseType = builder.baseType;
        this.material = builder.material;
        this.hasWheels = builder.hasWheels;
        this.hasArmrests = builder.hasArmrests;
        this.cushionType = builder.cushionType;
        this.color = builder.color;
        this.maxWeight = builder.maxWeight;
    }

    public void displaySpecifications() {
        System.out.println("=== Спецификация офисного кресла ===");
        System.out.println("Основание: " + baseType);
        System.out.println("Материал: " + material);
        System.out.println("Колесики: " + (hasWheels ? "Да" : "Нет"));
        System.out.println("Подлокотники: " + (hasArmrests ? "Да" : "Нет"));
        System.out.println("Подушка сиденья: " + cushionType);
        System.out.println("Цвет: " + color);
        System.out.println("Макс. нагрузка: " + maxWeight + " кг");
    }

    // 2. Вложенный класс Builder
    public static class ChairBuilder {
        // Обязательные параметры
        private final String baseType;
        private final String material;

        // Опциональные параметры (инициализированы значениями по умолчанию)
        private boolean hasWheels = true;
        private boolean hasArmrests = true;
        private String cushionType = "стандартная";
        private String color = "черный";
        private int maxWeight = 120;

        // Конструктор с обязательными параметрами
        public ChairBuilder(String baseType, String material) {
            this.baseType = baseType;
            this.material = material;
        }

        // Методы для опциональных параметров (возвращают this для fluent interface)
        public ChairBuilder hasWheels(final boolean hasWheels) {
            this.hasWheels = hasWheels;
            return this;
        }

        public ChairBuilder hasArmrests(final boolean hasArmrests) {
            this.hasArmrests = hasArmrests;
            return this;
        }

        public ChairBuilder cushionType(final String cushionType) {
            this.cushionType = cushionType;
            return this;
        }

        public ChairBuilder color(final String color) {
            this.color = color;
            return this;
        }

        public ChairBuilder maxWeight(final int maxWeight) {
            this.maxWeight = maxWeight;
            return this;
        }

        // Финальный метод построения
        public OfficeChair build() {
            // Можно добавить валидацию
            if (maxWeight <= 0) {
                throw new IllegalArgumentException("Макс. нагрузка должна быть положительной");
            }
            return new OfficeChair(this);
        }
    }
}
