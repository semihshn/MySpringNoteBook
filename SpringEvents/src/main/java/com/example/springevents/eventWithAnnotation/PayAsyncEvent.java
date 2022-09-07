package com.example.springevents.eventWithAnnotation;

public class PayAsyncEvent {

    String userName;

    public PayAsyncEvent(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
