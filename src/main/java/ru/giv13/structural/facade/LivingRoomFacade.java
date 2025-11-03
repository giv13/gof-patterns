package ru.giv13.structural.facade;

import ru.giv13.structural.smart_home.ClimateDevice;
import ru.giv13.structural.smart_home.LightDevice;

public class LivingRoomFacade {
    private final LightDevice mainLight;
    private final LightDevice secondLight;
    private final ClimateDevice climate;

    public LivingRoomFacade() {
        this.mainLight = new LightDevice("Основной свет");
        this.secondLight = new LightDevice("Торшер");
        this.climate = new ClimateDevice("Кондиционер");
    }

    public void arriveHome() {
        System.out.println("🏠 Режим 'Дома' активирован:");
        mainLight.turnOn();
        mainLight.setBrightness(50);
        secondLight.turnOn();
        secondLight.setBrightness(25);
        climate.turnOn();
        climate.setTemperature(18);
    }

    public void leaveHome() {
        System.out.println("🚪 Режим 'Ушел' активирован:");
        mainLight.turnOff();
        secondLight.turnOff();
        climate.turnOff();
    }
}
