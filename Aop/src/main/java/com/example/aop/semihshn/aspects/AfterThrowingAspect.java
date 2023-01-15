package com.example.aop.semihshn.aspects;

import com.example.aop.semihshn.exception.CustomException;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterThrowingAspect {

    @AfterThrowing(pointcut = "execution(* *.helloWorld(..))", throwing = "ex")
    public void callAfterThrowingException(CustomException ex) throws Exception {
        System.out.println("Exception is thrown. It is " + ex);
    }
}
