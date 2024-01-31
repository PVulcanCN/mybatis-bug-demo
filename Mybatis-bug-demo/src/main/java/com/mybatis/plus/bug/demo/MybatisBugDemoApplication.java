package com.mybatis.plus.bug.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mybatis.plus")
public class MybatisBugDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisBugDemoApplication.class, args);
    }

}
