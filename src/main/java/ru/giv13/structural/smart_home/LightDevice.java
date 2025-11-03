package ru.giv13.structural.smart_home;

public class LightDevice implements Device {
    private final String name;

    public LightDevice(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println("💡 " + name + ": Включен");
    }

    @Override
    public void turnOff() {
        System.out.println("💡 " + name + ": Выключен");
    }

    @Override
    public String getName() {
        return name;
    }

    public void setBrightness(int percent) {
        System.out.println("💡 " + name + ": Яркость установлена на " + percent + "%");
    }
}
