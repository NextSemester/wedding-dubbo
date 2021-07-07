package com.whut.wedding;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class BootWeddingSpringwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootWeddingSpringwebApplication.class, args);
    }

}
