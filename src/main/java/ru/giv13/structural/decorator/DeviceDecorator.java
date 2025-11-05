package ru.giv13.structural.decorator;

import ru.giv13.structural.smart_home.Device;

public abstract class DeviceDecorator implements Device {
    private final Device decoratedDevice;

    public DeviceDecorator(Device device) {
        this.decoratedDevice = device;
    }

    @Override
    public void turnOn() {
        decoratedDevice.turnOn();
    }

    @Override
    public void turnOff() {
        decoratedDevice.turnOff();
    }

    @Override
    public String getName() {
        return decoratedDevice.getName();
    }
}
