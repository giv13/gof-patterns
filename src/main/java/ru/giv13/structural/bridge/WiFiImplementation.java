package ru.giv13.structural.bridge;

public class WiFiImplementation implements DeviceImplementation {
    private final String name;
    private boolean isConnected;

    public WiFiImplementation(String name) {
        this.name = name;
        this.isConnected = false;
    }

    @Override
    public void connect() {
        System.out.println("📡 Подключаем " + name + " через WiFi...");
        // Имитация подключения
        try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
        isConnected = true;
        System.out.println("✅ " + name + " подключен через WiFi");
    }

    @Override
    public void disconnect() {
        System.out.println("📡 Отключаем " + name + " от WiFi...");
        // Имитация отключения
        try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
        isConnected = false;
        System.out.println("✅ " + name + " отключен от WiFi");
    }

    @Override
    public void performAction(String action) {
        System.out.println("📡 WiFi: " + name + " выполняет " + action);
    }

    @Override
    public String getName() {
        return "📡 WiFi устройство: " + name;
    }

    @Override
    public String getProtocol() {
        return "WiFi";
    }

    @Override
    public boolean isConnected() {
        return isConnected;
    }
}
