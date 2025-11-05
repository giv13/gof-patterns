package ru.giv13.structural.proxy;

import ru.giv13.structural.smart_home.Camera;
import ru.giv13.structural.smart_home.SecurityCamera;

public class CameraCachingProxy implements Camera {
    private final SecurityCamera camera;
    private byte[] cachedFeed;
    private long cacheTimestamp;
    private static final long CACHE_DURATION = 5000;

    public CameraCachingProxy(SecurityCamera camera) {
        this.camera = camera;
    }

    @Override
    public void startRecording() {
        camera.startRecording();
        invalidateCache(); // Сбрасываем кэш при начале записи
    }

    @Override
    public void stopRecording() {
        camera.stopRecording();
        invalidateCache(); // Сбрасываем кэш при остановке записи
    }

    @Override
    public byte[] getLiveFeed() {
        if (isCacheValid()) {
            System.out.println("💾 КЭШ: Возвращаем кэшированное видео с камеры " + camera.getId());
            return cachedFeed;
        }

        System.out.println("🔄 Получаем свежее видео с камеры " + camera.getId());
        cachedFeed = camera.getLiveFeed();
        cacheTimestamp = System.currentTimeMillis();

        return cachedFeed;
    }

    @Override
    public String getInfo() {
        return camera.getInfo() + " | Кэширование: " + (isCacheValid() ? "Активно" : "Неактивно");
    }

    private boolean isCacheValid() {
        return cachedFeed != null && (System.currentTimeMillis() - cacheTimestamp) < CACHE_DURATION;
    }

    private void invalidateCache() {
        cachedFeed = null;
        System.out.println("🗑️  Кэш для камеры " + camera.getId() + " очищен");
    }
}
