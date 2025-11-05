package ru.giv13.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<SensorDevice> sensors = new ArrayList<>();
        sensors.add(new SensorDevice("Температура", "Philips", "Zigbee", "TEMP_001", "Гостиная"));
        sensors.add(new SensorDevice("Температура", "Philips", "Zigbee", "TEMP_002", "Спальня"));
        sensors.add(new SensorDevice("Влажность", "Xiaomi", "WiFi", "HUM_001", "Гостиная"));
        sensors.add(new SensorDevice("Влажность", "Xiaomi", "WiFi", "HUM_002", "Ванная"));

        for (SensorDevice sensor : sensors) {
            System.out.println(sensor.getName());
            sensor.turnOn();
            sensor.turnOff();
        }
    }
}
