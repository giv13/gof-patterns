package ru.giv13.creational.singleton;

public enum EnumThrone {
    INSTANCE;

    // Использование общей логики через композицию, т.к. enum не может extends
    private final Throne throne = new Throne();

    public void sitOn(String person) {
        throne.sitOn(person);
    }

    public void leaveThrone() {
        throne.leaveThrone();
    }
}
