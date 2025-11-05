package ru.giv13.structural.decorator;

import ru.giv13.structural.smart_home.Device;

public class ColorDeviceDecorator extends DeviceDecorator {
    private final String color;

    public ColorDeviceDecorator(Device device, String color) {
        super(device);
        this.color = color;
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("🎨 Установлен цвет: " + color);
    }

    @Override
    public String getName() {
        return super.getName() + " с цветом " + color;
    }
}
