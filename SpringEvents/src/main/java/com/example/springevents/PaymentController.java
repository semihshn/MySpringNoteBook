package com.example.springevents;

import com.example.springevents.eventWithAnnotation.AnnotationDrivenEventPublisher;
import com.example.springevents.synchronousEvent.CustomSpringEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
public class PaymentController {
    @Autowired
    private CustomSpringEventPublisher customSpringEventPublisher;

    @Autowired
    AnnotationDrivenEventPublisher annotationDrivenEventPublisher;

    @PostMapping("/sync")
    public void paySync(){
        customSpringEventPublisher.paySync("semihshn");
    }

    @PostMapping("/async")
    public void payAsync(){
        annotationDrivenEventPublisher.payAsync("sem");
    }
}
