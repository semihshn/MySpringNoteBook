package com.example.aop.semihshn.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class BeforeAspect {

    @Before("execution(* *.helloWorld(..))")
    public void callBefore(JoinPoint joinPoint) {
        try {
            System.out.println("BeforeAspect: The method " + joinPoint.getSignature().getName() + "()");
        } catch (IllegalArgumentException e) {
            System.err.println("Illegal argument " + Arrays.toString(joinPoint.getArgs()) + " in " + joinPoint.getSignature().getName() + "()");
            throw e;
        }
        System.out.println();
    }

}
