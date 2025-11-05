package ru.giv13.structural.proxy;

import ru.giv13.structural.smart_home.Camera;
import ru.giv13.structural.smart_home.SecurityCamera;

public class CameraVirtualProxy implements Camera {
    private final String cameraId;
    private final String location;
    private SecurityCamera camera;

    public CameraVirtualProxy(String cameraId, String location) {
        this.cameraId = cameraId;
        this.location = location;
        System.out.println("ℹ️ Proxy для камеры " + cameraId + " создан мгновенно");
    }

    private void initializeRealCamera() {
        if (camera == null) {
            System.out.println("ℹ️ Proxy: Инициализируем реальную камеру...");
            camera = new SecurityCamera(cameraId, location);
        }
    }

    @Override
    public void startRecording() {
        initializeRealCamera();
        camera.startRecording();
    }

    @Override
    public void stopRecording() {
        if (camera != null) {
            camera.stopRecording();
        } else {
            System.out.println("ℹ️ Proxy: Камера " + cameraId + " не была инициализирована");
        }
    }

    @Override
    public byte[] getLiveFeed() {
        initializeRealCamera();
        return camera.getLiveFeed();
    }

    @Override
    public String getInfo() {
        if (camera != null) {
            return camera.getInfo();
        } else {
            return "Камера " + cameraId + " | Местоположение: " + location + " | Статус: Не инициализирована";
        }
    }
}
