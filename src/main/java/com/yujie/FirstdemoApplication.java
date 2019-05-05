package com.yujie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.yujie.mapper")
@SpringBootApplication
public class FirstdemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(FirstdemoApplication.class, args);
    }
}

