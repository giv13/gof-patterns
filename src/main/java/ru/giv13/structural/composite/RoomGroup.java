package ru.giv13.structural.composite;


import ru.giv13.structural.smart_home.Device;
import ru.giv13.structural.smart_home.Group;

import java.util.ArrayList;
import java.util.List;

public class RoomGroup implements Group {
    private final String name;
    private final List<Device> devices = new ArrayList<>();

    public RoomGroup(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        System.out.println("🚪 Комната " + name + ": Включаем все устройства");
        for (Device device : devices) {
            device.turnOn();
        }
    }

    @Override
    public void turnOff() {
        System.out.println("🚪 Комната " + name + ": Выключаем все устройства");
        for (Device device : devices) {
            device.turnOff();
        }
    }

    @Override
    public String getName() {
        return "Комната: " + name + " (устройств: " + devices.size() + ")";
    }

    @Override
    public void add(Device device) {
        devices.add(device);
    }

    @Override
    public void remove(Device device) {
        devices.remove(device);
    }

    @Override
    public List<Device> getChildren() {
        return new ArrayList<>(devices);
    }
}
