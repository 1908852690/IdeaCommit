package com.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eureka-provider")
public interface IDoSomeService {
    @RequestMapping("/doSome")
    public String doSome();
}
