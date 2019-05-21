package com.example.springbootswaggerdemo;

import com.battcn.swagger.annotation.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger2Doc
public class SpringBootSwaggerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSwaggerDemoApplication.class, args);
    }

}
