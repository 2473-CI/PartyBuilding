package com.ru.springboot3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.ResponseBody;

@ServletComponentScan(basePackages = "com.ru.springboot3")
@MapperScan(basePackages = "com.ru.springboot3.mapper")
@SpringBootApplication
public class SpringBoot3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot3Application.class, args);
    }

}
