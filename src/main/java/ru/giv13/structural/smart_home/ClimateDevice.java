package ru.giv13.structural.smart_home;

public class ClimateDevice implements Device {
    private final String name;

    public ClimateDevice(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println("🌡️ " + name + ": Включен");
    }

    @Override
    public void turnOff() {
        System.out.println("🌡️ " + name + ": Выключен");
    }

    @Override
    public String getName() {
        return name;
    }

    public void setTemperature(int temp) {
        System.out.println("🌡️ Температура установлена на " + temp + "°C");
    }
}
