package ru.giv13.structural.bridge;

import ru.giv13.structural.smart_home.Device;

abstract class SmartDevice implements Device {
    private final DeviceImplementation impl;

    protected SmartDevice(DeviceImplementation implementation) {
        this.impl = implementation;
    }

    protected final boolean performImplAction(String action) {
        if (!impl.isConnected()) {
            System.out.println("❌ Ошибка: " + impl.getName() + " не подключен к " + impl.getProtocol());
            return false;
        }
        impl.performAction(action);
        return true;
    }

    protected final String getImplProtocol() {
        return impl.getProtocol();
    }

    @Override
    public final void turnOn() {
        impl.connect();
    }

    @Override
    public final void turnOff() {
        impl.disconnect();
    }

    @Override
    public final String getName() {
        return impl.getName();
    }

    public abstract void operate();
}
