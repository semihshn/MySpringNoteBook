package com.example.springevents.eventWithAnnotation;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AnnotationDrivenEventPublisher {

    private final ApplicationEventPublisher applicationEventPublisher;

    public void payAsync(final String userName) {
        System.out.println("Publishing pay async event. ");
        PayAsyncEvent payAsyncEvent = new PayAsyncEvent(userName);
        applicationEventPublisher.publishEvent(payAsyncEvent);
    }
}
