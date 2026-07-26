package ru.giv13.creational.singleton;

public class DoubleCheckedLockingThrone extends Throne {
    // Статическая переменная для хранения единственного экземпляра
    private static volatile DoubleCheckedLockingThrone instance;

    // Приватный конструктор - нельзя создать через new
    private DoubleCheckedLockingThrone() {
    }

    // Статический метод для получения экземпляра
    public static DoubleCheckedLockingThrone getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingThrone.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingThrone();
                }
            }
        }
        return instance;
    }
}
