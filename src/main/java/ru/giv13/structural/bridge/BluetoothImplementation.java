package ru.giv13.structural.bridge;

public class BluetoothImplementation implements DeviceImplementation {
    private final String name;
    private boolean isConnected;

    public BluetoothImplementation(String name) {
        this.name = name;
        this.isConnected = false;
    }

    @Override
    public void connect() {
        System.out.println("📱 Подключаем " + name + " через Bluetooth...");
        // Имитация подключения
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        isConnected = true;
        System.out.println("✅ " + name + " подключен через Bluetooth");
    }

    @Override
    public void disconnect() {
        System.out.println("📱 Отключаем " + name + " от Bluetooth...");
        // Имитация отключения
        try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
        isConnected = false;
        System.out.println("✅ " + name + " отключен от Bluetooth");
    }

    @Override
    public void performAction(String action) {
        System.out.println("📱 Bluetooth: " + name + " выполняет " + action);
    }

    @Override
    public String getName() {
        return "📱 Bluetooth устройство: " + name;
    }

    @Override
    public String getProtocol() {
        return "Bluetooth";
    }

    @Override
    public boolean isConnected() {
        return isConnected;
    }
}
