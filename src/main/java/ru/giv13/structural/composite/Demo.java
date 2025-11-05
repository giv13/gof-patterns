package ru.giv13.structural.composite;

import ru.giv13.structural.smart_home.ClimateDevice;
import ru.giv13.structural.smart_home.LightDevice;

public class Demo {
    public static void main(String[] args) {
        RoomGroup room1 = new RoomGroup("Кухня-гостиная");
        RoomGroup room2 = new RoomGroup("Кухня");
        RoomGroup room3 = new RoomGroup("Гостиная");
        room1.add(room2);
        room1.add(room3);
        room2.add(new LightDevice("Основной свет"));
        room2.add(new ClimateDevice("Кондиционер"));
        room3.add(new LightDevice("Торшер"));
        room3.add(new ClimateDevice("Увлажнитель"));
        System.out.println(room1.getName());
        room1.turnOn();
        room1.turnOff();
    }
}
