package com.cloud;

import com.cloud.service.MemberService;
import org.springframework.stereotype.Component;

/**
 * 本地服务
 */
@Component
public class MemberServiceFallBack implements MemberService {
    @Override
    public String getMember() {
        return "服务降级";
    }
}
