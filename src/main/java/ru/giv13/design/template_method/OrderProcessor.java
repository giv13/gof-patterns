package ru.giv13.design.template_method;

import ru.giv13.design.delievery.Order;

public abstract class OrderProcessor {
    public final void processOrder(Order order) {
        prepareOrder(order);
        if (needSpecialPreparation()) {
            performSpecialPreparation(order);
        }
        cookOrder(order);
        packageOrder(order);
        deliverOrder(order);
        completeOrder(order);
    }

    // Общие шаги с реализацией по умолчанию
    protected void prepareOrder(Order order) {
        System.out.println("📋 ПОДГОТОВКА ЗАКАЗА:");
        System.out.println("   - Формируем задание для кухни");
        System.out.println("   - Резервируем ингредиенты");
        System.out.println("   - Назначаем ответственного повара");
    }

    protected void completeOrder(Order order) {
        System.out.println("📊 ЗАВЕРШЕНИЕ ЗАКАЗА:");
        System.out.println("   - Обновляем статус в системе");
        System.out.println("   - Отправляем финальное уведомление клиенту");
        System.out.println("   - Сохраняем статистику");
    }

    // Абстрактные методы - должны быть реализованы в подклассах
    protected abstract void cookOrder(Order order);
    protected abstract void packageOrder(Order order);
    protected abstract void deliverOrder(Order order);

    // Хук-методы - необязательные для переопределения
    protected boolean needSpecialPreparation() {
        return false;
    }

    protected void performSpecialPreparation(Order order) {}
}
