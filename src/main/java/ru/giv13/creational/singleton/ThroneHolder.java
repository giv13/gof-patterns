package ru.giv13.creational.singleton;

public class ThroneHolder extends Throne {
    // Приватный конструктор — нельзя создать через new
    private ThroneHolder() {
    }

    // Вложенный статический класс для ленивого создания Singleton
    private static class Holder {
        // Единственный экземпляр создается при первой инициализации Holder
        private static final ThroneHolder INSTANCE = new ThroneHolder();
    }

    // Статический метод для получения единственного экземпляра
    public static ThroneHolder getInstance() {
        return Holder.INSTANCE;
    }
}
