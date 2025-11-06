package ru.giv13.structural.bridge;

public class Demo {
    public static void main(String[] args) {
        SmartLight bluetoothLight = new SmartLight(new BluetoothImplementation("Люстра гостиной"));
        bluetoothLight.turnOn();
        bluetoothLight.operate();
        bluetoothLight.turnOff();

        SmartLock wifiLock = new SmartLock(new WiFiImplementation("Входная дверь"));
        System.out.println(wifiLock.getName());
        wifiLock.operate();
    }
}
