package com.example.aop.semihshn.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class AfterAspect {

    @After("execution(* *.helloWorld(..))")
    public void callAfter(JoinPoint joinPoint) {
        System.out.println();
        try {
            System.out.println(
                    "AfterAspect: The method " + joinPoint.getSignature().getName() + "() with argument " + Arrays.toString(joinPoint.getArgs()));
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument " + Arrays.toString(joinPoint.getArgs()) + " in " + joinPoint.getSignature().getName() + "()");
            throw e;
        }
    }
}
