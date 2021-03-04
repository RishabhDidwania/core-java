package com.intuit.lab08;

public class Door {
    //this way door is compatible to have any alarm
    private Alarm alarm;

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public void openDoor(){
        alarm.activateAlarm();
    }

     public void closeDoor(){
        alarm.deactivateAlarm();
    }

}
