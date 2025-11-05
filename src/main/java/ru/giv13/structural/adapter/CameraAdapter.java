package ru.giv13.structural.adapter;

import ru.giv13.structural.smart_home.Camera;
import ru.giv13.structural.smart_home.Device;

public class CameraAdapter implements Device {
    private final Camera camera;

    public CameraAdapter(Camera camera) {
        this.camera = camera;
    }

    @Override
    public void turnOn() {
        camera.startRecording();
    }

    @Override
    public void turnOff() {
        camera.stopRecording();
    }

    @Override
    public String getName() {
        return camera.getInfo();
    }
}
