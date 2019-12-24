package com.cloud.controller;

import com.cloud.service.IDoSomeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DoSomeController {
    @Resource
    private IDoSomeService iDoSomeService;


    @RequestMapping("/getDoSome")
    public String getDoSome(){
        return iDoSomeService.doSome();
    }
}
