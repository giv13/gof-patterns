package ru.giv13.structural.proxy;

import ru.giv13.structural.smart_home.Camera;
import ru.giv13.structural.smart_home.SecurityCamera;

public class Demo {
    public static void main(String[] args) {
        // Ленивая инициализация (Virtual Proxy)
        Camera camera1 = new CameraVirtualProxy("CAM-001", "Гостиная");
        System.out.println(camera1.getInfo());
        camera1.startRecording(); // Реальная камера инициализируется здесь!
        camera1.stopRecording();

        // Защита доступа (Protection Proxy)
        Camera camera2 = new CameraProtectionProxy("CAM-002", "Кухня", "GUEST");
        System.out.println(camera2.getInfo());
        camera2.startRecording();
        camera2.stopRecording();

        // Логирование запросов (Logging Proxy)
        Camera camera3 = new CameraLoggingProxy(new SecurityCamera("CAM-003", "Спальня"));
        System.out.println(camera3.getInfo());
        camera3.startRecording();
        camera3.stopRecording();

        // Кеширование объектов (Caching Proxy)
        Camera camera4 = new CameraCachingProxy(new SecurityCamera("CAM-004", "Улица"));
        System.out.println(camera4.getInfo());
        camera4.getLiveFeed();
        camera4.getLiveFeed();
        try { Thread.sleep(5000); } catch (InterruptedException ignored) {}
        camera4.getLiveFeed();
    }
}
