package ru.giv13.creational.singleton;

class Throne {
    private boolean isOccupied;
    private String currentOwner;

    Throne() {
        isOccupied = false;
        currentOwner = "никто";
        System.out.println("Создан Трон! Он может быть только один.");
    }

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
