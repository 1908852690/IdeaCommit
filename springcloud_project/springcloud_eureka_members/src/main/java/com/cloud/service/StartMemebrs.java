package com.cloud.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StartMemebrs {
    public static void main(String[] args) {
        SpringApplication.run(StartMemebrs.class,args);
    }
}
