package com.cloud.service.impl;

import com.cloud.service.MemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberServiceImpl implements MemberService {
    @RequestMapping("/getMember")
    @Override
    public String getMember() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("================会员工程MemberService接口===================");
        return "members";
    }
}
