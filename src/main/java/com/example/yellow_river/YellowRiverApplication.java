package com.example.yellow_river;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example.yellow_river.mapper")
@SpringBootApplication
public class YellowRiverApplication {

    public static void main(String[] args) {
        SpringApplication.run(YellowRiverApplication.class, args);
    }

}
