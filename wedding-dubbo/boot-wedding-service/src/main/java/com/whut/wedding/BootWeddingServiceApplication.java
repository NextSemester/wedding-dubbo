package com.whut.wedding;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableDubbo
@SpringBootApplication
@MapperScan("com.whut.wedding.dao")
public class BootWeddingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootWeddingServiceApplication.class, args);
    }

}
