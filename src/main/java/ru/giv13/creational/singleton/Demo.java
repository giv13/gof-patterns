package ru.giv13.creational.singleton;

public class Demo {
    public static void main(String[] args) {
        // Два обращения к Singleton возвращают один и тот же трон
        DoubleCheckedLockingThrone throne1 = DoubleCheckedLockingThrone.getInstance();
        DoubleCheckedLockingThrone throne2 = DoubleCheckedLockingThrone.getInstance();
        System.out.println("Это один и тот же трон? " + (throne1 == throne2 ? "Да" : "Нет"));

        throne1.sitOn("Король");
        throne2.sitOn("Королева"); // Не получится - трон занят!

        throne1.leaveThrone();
        throne2.sitOn("Королева"); // Теперь получится

        // Singleton через enum
        EnumThrone throne3 = EnumThrone.INSTANCE;
        throne3.sitOn("Король");

        // Singleton через Holder Idiom
        ThroneHolder throne4 = ThroneHolder.getInstance();
        ThroneHolder throne5 = ThroneHolder.getInstance();
        throne4.sitOn("Королева");
        throne5.sitOn("Король"); // Не получится - трон занят!
    }
}
