package com.jizheping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.jizheping.mapper")
public class SpringBootEchartsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootEchartsApplication.class,args);
    }
}
