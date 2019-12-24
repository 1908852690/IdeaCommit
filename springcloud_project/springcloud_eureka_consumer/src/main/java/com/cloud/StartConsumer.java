package com.cloud;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class StartConsumer {
    public static void main(String[] args) {
        SpringApplication.run(StartConsumer.class,args);
    }


    /*@Bean
    @LoadBalanced       //rest方式实现负载均衡
    RestTemplate restTemplate(){
        return  new RestTemplate();
    }*/

    /**
     * 指定负载均衡策略
     */
    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }
}
