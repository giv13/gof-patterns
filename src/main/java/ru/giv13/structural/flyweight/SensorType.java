package ru.giv13.structural.flyweight;

public class SensorType {
    private final String type;
    private final String manufacturer;
    private final String protocol;

    public SensorType(String type, String manufacturer, String protocol) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.protocol = protocol;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getProtocol() {
        return protocol;
    }
}
