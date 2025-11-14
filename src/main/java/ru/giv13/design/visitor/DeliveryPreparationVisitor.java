package ru.giv13.design.visitor;

public class DeliveryPreparationVisitor implements OrderVisitor {
    @Override
    public void visit(FoodOrder order) {
        System.out.println("🍱 Подготовка доставки ЕДЫ:");
        System.out.println("   - Ресторан: " + order.getRestaurant());
        System.out.println("   - Время приготовления: " + order.getPreparationTime() + " мин");
        System.out.println("   - " + (order.isVegetarian() ? "🍃 Вегетарианское" : "🍖 С мясом"));
    }

    @Override
    public void visit(GroceryOrder order) {
        System.out.println("🛒 Подготовка доставки ПРОДУКТОВ:");
        System.out.println("   - Магазин: " + order.getStore());
        System.out.println("   - " + (order.isRequiresRefrigeration() ? "❄️ Требуется холодильник" : "✅ Обычная доставка"));
        System.out.println("   - Товары: " + order.getItems().size() + " позиций");
    }
}
