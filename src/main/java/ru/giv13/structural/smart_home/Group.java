package ru.giv13.structural.smart_home;

import java.util.List;

public interface Group extends Device {
    void add(Device device);
    void remove(Device device);
    List<Device> getChildren();
}
