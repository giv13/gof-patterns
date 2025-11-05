package ru.giv13.structural.adapter;

import ru.giv13.structural.smart_home.Device;
import ru.giv13.structural.smart_home.SecurityCamera;

public class Demo {
    public static void main(String[] args) {
        Device camera = new CameraAdapter(new SecurityCamera("cam-001", "Улица"));
        System.out.println(camera.getName());
        camera.turnOn();
        camera.turnOff();
    }
}
