package ru.giv13.structural.flyweight;

import ru.giv13.structural.smart_home.Device;

public class SensorDevice implements Device {
    private final SensorType sensorType;
    private final String id;
    private final String location;

    public SensorDevice(String type, String manufacturer, String protocol, String id, String location) {
        this.sensorType = SensorTypeFactory.getSensorType(type, manufacturer, protocol);
        this.id = id;
        this.location = location;
    }

    @Override
    public void turnOn() {
        System.out.println("🔘 Сенсор " + id + ": Включен");
    }

    @Override
    public void turnOff() {
        System.out.println("🔘 Сенсор " + id + ": Выключен");
    }

    @Override
    public String getName() {
        return "Сенсор " + id + " | Местоположение: " + location + " | Тип сенсора: " + sensorType.getType()
                + " | Производитель: " + sensorType.getManufacturer()+ " | Протокол: " + sensorType.getProtocol();
    }
}
