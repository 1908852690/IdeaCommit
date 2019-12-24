package com.cloud.service.impl;

import com.cloud.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderServiceImpl implements OrderService {
    @RequestMapping("/getOrder")
    @Override
    public String getOrder() {
        System.out.println("===============订单工程OrderService接口================");
        return "orders";
    }
}
