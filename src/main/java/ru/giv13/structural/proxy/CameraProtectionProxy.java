package ru.giv13.structural.proxy;

import ru.giv13.structural.smart_home.Camera;
import ru.giv13.structural.smart_home.SecurityCamera;

public class CameraProtectionProxy implements Camera {
    private final SecurityCamera camera;
    private final String userRole;
    private final String cameraId;

    public CameraProtectionProxy(String cameraId, String location, String userRole) {
        this.camera = new SecurityCamera(cameraId, location);
        this.userRole = userRole;
        this.cameraId = cameraId;
    }

    private boolean hasAccess() {
        return "ADMIN".equals(userRole) || "SECURITY".equals(userRole);
    }

    private boolean hasViewAccess() {
        return hasAccess() || "GUEST".equals(userRole);
    }

    @Override
    public void startRecording() {
        if (!hasAccess()) {
            System.out.println("🚫 ОШИБКА: Пользователь с ролью " + userRole + " не может запускать запись камеры " + cameraId);
            return;
        }
        camera.startRecording();
    }

    @Override
    public void stopRecording() {
        if (!hasAccess()) {
            System.out.println("🚫 ОШИБКА: Пользователь с ролью " + userRole + " не может останавливать запись камеры " + cameraId);
            return;
        }
        camera.stopRecording();
    }

    @Override
    public byte[] getLiveFeed() {
        if (!hasViewAccess()) {
            System.out.println("🚫 ОШИБКА: Пользователь с ролью " + userRole + " не может просматривать камеру " + cameraId);
            return new byte[0];
        }
        return camera.getLiveFeed();
    }

    @Override
    public String getInfo() {
        return camera.getInfo() + " | Доступ: " + userRole;
    }
}
