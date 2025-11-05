package ru.giv13.structural.decorator;

import ru.giv13.structural.smart_home.Device;
import ru.giv13.structural.smart_home.LightDevice;

public class Demo {
    public static void main(String[] args) {
        Device colorLight = new ColorDeviceDecorator(new LightDevice("Гостиная"), "теплый белый");
        colorLight.turnOn();
        System.out.println(colorLight.getName());
    }
}
