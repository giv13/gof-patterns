package ru.giv13.structural.bridge;

public class SmartLock extends SmartDevice {
    public SmartLock(DeviceImplementation impl) {
        super(impl);
    }

    @Override
    public void operate() {
        if (performImplAction("заблокировать дверь")) {
            System.out.println("🔒 Дверь заблокирована через " + getImplProtocol());
        }
    }
}
