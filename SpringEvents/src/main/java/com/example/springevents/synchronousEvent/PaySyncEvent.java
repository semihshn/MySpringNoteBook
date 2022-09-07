package com.example.springevents.synchronousEvent;

import org.springframework.context.ApplicationEvent;

public class PaySyncEvent extends ApplicationEvent {

    String userName;

    public PaySyncEvent(Object source, String userName) {
        super(source);
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
