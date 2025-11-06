package ru.giv13.creational.singleton;

public class Throne {
    // Статическая переменная для хранения единственного экземпляра
    private static volatile Throne instance;

    // Характеристики трона
    private boolean isOccupied;
    private String currentOwner;

    // Приватный конструктор - нельзя создать через new
    private Throne() {
        this.isOccupied = false;
        this.currentOwner = "никто";
        System.out.println("Создан Трон! Он может быть только один.");
    }

    // Статический метод для получения экземпляра
    public static Throne getInstance() {
        if (instance == null) {
            synchronized (Throne.class) {
                if (instance == null) {
                    instance = new Throne();
                }
            }
        }
        return instance;
    }

    // Бизнес-методы
    public void sitOn(String person) {
        if (isOccupied) {
            System.out.println("Трон уже занят " + currentOwner + "! Дождитесь своей очереди.");
        } else {
            isOccupied = true;
            currentOwner = person;
            System.out.println(person + " восседает на троне!");
        }
    }

    public void leaveThrone() {
        if (isOccupied) {
            System.out.println(currentOwner + " покидает трон.");
            isOccupied = false;
            currentOwner = "никто";
        } else {
            System.out.println("Трон и так пуст.");
        }
    }
}
