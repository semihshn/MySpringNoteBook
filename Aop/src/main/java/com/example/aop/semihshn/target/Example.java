package com.example.aop.semihshn.target;

import com.example.aop.semihshn.exception.CustomException;
import org.springframework.stereotype.Component;

@Component
public class Example {

    public void helloWorld() throws CustomException {
        System.out.println("Hello world");

        throw new CustomException("custom exception test");
    }
}
