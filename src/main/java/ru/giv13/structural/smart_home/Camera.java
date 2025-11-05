package ru.giv13.structural.smart_home;

public interface Camera {
    void startRecording();
    void stopRecording();
    byte[] getLiveFeed();
    String getInfo();
}
