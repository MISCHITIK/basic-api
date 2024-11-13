package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Demo3Application extends SpringBootServletInitializer implements CommandLineRunner {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        //return super.configure(builder);
        return builder.sources(Demo3Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo3Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("服务启动完成!");
    }



}
