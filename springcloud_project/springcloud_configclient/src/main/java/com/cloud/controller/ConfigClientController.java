package com.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${user}")
    String user;


    @RequestMapping("/getConfig")
    public String getConfig(){
        return user;
    }
}
