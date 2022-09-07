package com.example.springevents.synchronousEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomSpringEventListener implements ApplicationListener<PaySyncEvent> {

    @Override
    public void onApplicationEvent(PaySyncEvent paySyncEvent) {
        System.out.println("Received spring sync pay event - " + paySyncEvent.getUserName());
    }
}
