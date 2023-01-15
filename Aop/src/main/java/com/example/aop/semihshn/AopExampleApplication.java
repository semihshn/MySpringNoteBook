package com.example.aop.semihshn;

import com.example.aop.semihshn.exception.CustomException;
import com.example.aop.semihshn.target.Example;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AopExampleApplication implements ApplicationRunner {

    private final Example example;

    public AopExampleApplication(Example example) {
        this.example = example;
    }

    public static void main(String[] args) {
        SpringApplication.run(AopExampleApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        try {
            example.helloWorld();
        } catch (CustomException e) {
            System.out.println("custom exception message: " + e.getMessage());
        }
    }
}
