package ru.giv13.structural.bridge;

public interface DeviceImplementation {
    void connect();
    void disconnect();
    void performAction(String action);
    String getName();
    String getProtocol();
    boolean isConnected();
}
