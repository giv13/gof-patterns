package ru.giv13.structural.smart_home;

public class SecurityCamera implements Camera {
    private final String id;
    private final String location;

    public SecurityCamera(String id, String location) {
        this.id = id;
        this.location = location;
    }

    @Override
    public void startRecording() {
        System.out.println("🎥 Камера " + id + " начала запись в " + location);
    }

    @Override
    public void stopRecording() {
        System.out.println("🎥 Камера " + id + " остановила запись");
    }

    @Override
    public byte[] getLiveFeed() {
        System.out.println("📺 Трансляция с камеры " + id + " в " + location);
        return new byte[1024];
    }

    @Override
    public String getInfo() {
        return "Камера " + id + " | Местоположение: " + location;
    }
}
