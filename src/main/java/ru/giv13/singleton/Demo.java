package ru.giv13.singleton;

public class Demo {
    public static void main(String[] args) {
        // Попытка создать троны - но получим один и тот же экземпляр
        Throne throne1 = Throne.getInstance();
        Throne throne2 = Throne.getInstance();
        System.out.println("Это один и тот же трон? " + (throne1 == throne2));

        throne1.sitOn("Король");
        throne2.sitOn("Королева"); // Не получится - трон занят!

        throne1.leaveThrone();
        throne2.sitOn("Королева"); // Теперь получится

        // Singleton через enum
        EThrone throne3 = EThrone.INSTANCE;
        throne3.sitOn("Король");
    }
}
