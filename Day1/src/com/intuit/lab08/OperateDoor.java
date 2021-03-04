package com.intuit.lab08;

public class OperateDoor {
    public static void main(String[] args) {
        Door door = new Door();
        Alarm alarm = new SoundAlarm();
        door.setAlarm(alarm);
        door.openDoor();
        door.closeDoor();

        Door door2 = new Door();
        Alarm alarm2 = new VisualAlarm();
        door2.setAlarm(alarm2);
        door2.openDoor();
        door2.closeDoor();
    }
}
