package com.example.springevents.synchronousEvent;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomSpringEventPublisher {

    private final ApplicationEventPublisher applicationEventPublisher;

    public void paySync(final String userName) {
        System.out.println("Publishing sync pay event. ");
        PaySyncEvent paySyncEvent = new PaySyncEvent(this, userName);
        applicationEventPublisher.publishEvent(paySyncEvent);
    }
}
