package com.example.springevents.eventWithAnnotation;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AnnotationDrivenEventListener {

    @EventListener
    public void handleContextStart(PayAsyncEvent payAsyncEvent) {
        System.out.println("Received spring async pay event - " + payAsyncEvent.getUserName());
    }

    //USE ASYNC
//    @EventListener
//    @Async
//    public void handleContextStart(ContextStartedEvent cse) {
//        System.out.println("Handling context started event.");
//    }

//    Yalnızca başarılı eventler için çalışır
//    @EventListener(condition = "#event.success")
//    public void handleSuccessful(GenericSpringEvent<String> event) {
//        System.out.println("Handling generic event (conditional).");
//    }

//    @TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
//    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT )
//    @TransactionalEventListener(phase = TransactionPhase.AFTER_ROLLBACK )
//    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMPLETION)

}
