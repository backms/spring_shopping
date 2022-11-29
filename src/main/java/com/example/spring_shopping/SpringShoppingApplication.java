package com.example.spring_shopping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = {"com.example.spring_shopping.dao"})
@SpringBootApplication
public class SpringShoppingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringShoppingApplication.class, args);
    }

}
