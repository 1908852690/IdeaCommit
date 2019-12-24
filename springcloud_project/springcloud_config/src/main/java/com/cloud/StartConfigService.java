package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableConfigServer
public class StartConfigService
{
    public static void main( String[] args )
    {
        SpringApplication.run(StartConfigService.class,args);
    }
}
