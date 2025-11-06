package ru.giv13.structural.bridge;

public class SmartLight extends SmartDevice {
    public SmartLight(DeviceImplementation impl) {
        super(impl);
    }

    @Override
    public void operate() {
        if (performImplAction("включить свет")) {
            System.out.println("💡 Свет включен через " + getImplProtocol());
        }
    }
}
