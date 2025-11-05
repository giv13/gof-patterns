package ru.giv13.structural.proxy;

import ru.giv13.structural.smart_home.Camera;
import ru.giv13.structural.smart_home.SecurityCamera;

public class CameraLoggingProxy implements Camera {
    private final SecurityCamera camera;

    public CameraLoggingProxy(SecurityCamera camera) {
        this.camera = camera;
    }

    @Override
    public void startRecording() {
        System.out.println("📝 [LOG] START_RECORDING вызван для камеры " + camera.getId());
        camera.startRecording();
    }

    @Override
    public void stopRecording() {
        System.out.println("📝 [LOG] STOP_RECORDING вызван для камеры " + camera.getId());
        camera.stopRecording();
    }

    @Override
    public byte[] getLiveFeed() {
        System.out.println("📝 [LOG] GET_LIVE_FEED вызван для камеры " + camera.getId());
        return camera.getLiveFeed();
    }

    @Override
    public String getInfo() {
        return camera.getInfo() + " | Логирование: Включено";
    }
}
