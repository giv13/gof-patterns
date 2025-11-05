package ru.giv13.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SensorTypeFactory {
    private static Map<String, SensorType> sensorTypes = new HashMap<>();

    public static SensorType getSensorType(String type, String manufacturer, String protocol) {
        String key = type + "-" + manufacturer;
        if (!sensorTypes.containsKey(key)) {
            sensorTypes.put(key, new SensorType(type, manufacturer, protocol));
            System.out.println("🆕 Создан новый тип устройства: " + key);
        } else {
            System.out.println("♻️ Переиспользован тип устройства: " + key);
        }
        return sensorTypes.get(key);
    }
}
