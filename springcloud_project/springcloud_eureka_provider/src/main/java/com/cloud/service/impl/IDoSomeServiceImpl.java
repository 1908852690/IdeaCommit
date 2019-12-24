package com.cloud.service.impl;

import com.cloud.service.IDoSomeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IDoSomeServiceImpl implements IDoSomeService {
    @RequestMapping("/doSome")
    @Override
    public String doSome() {
        System.out.println("服务提供者");
        return "eureka";
    }
}
