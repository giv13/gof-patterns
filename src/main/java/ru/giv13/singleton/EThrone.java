package ru.giv13.singleton;

public enum EThrone {
    INSTANCE;

    private boolean isOccupied;
    private String currentOwner;

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
