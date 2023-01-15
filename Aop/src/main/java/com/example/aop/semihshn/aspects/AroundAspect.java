package com.example.aop.semihshn.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class AroundAspect {

    @Around("execution(* *.helloWorld(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("\nAroundAspect: The method " + joinPoint.getSignature().getName() + "() with argument " + Arrays.toString(joinPoint.getArgs()));
        try {
            Object result = joinPoint.proceed();
            System.out.println("AroundAspect: The method " + joinPoint.getSignature().getName() + "() ends with [" + result + "]");
            return result;
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument " + Arrays.toString(joinPoint.getArgs()) + " in " + joinPoint.getSignature().getName() + "()");
            throw e;
        }
    }
}
