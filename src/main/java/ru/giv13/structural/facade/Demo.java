package ru.giv13.structural.facade;

public class Demo {
    public static void main(String[] args) {
        LivingRoomFacade livingRoom = new LivingRoomFacade();
        livingRoom.arriveHome();
        livingRoom.leaveHome();
    }
}
