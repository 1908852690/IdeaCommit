package com.cloud.service;

import com.cloud.MemberServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * fallback服务降级执行得本地类
 */
/*@FeignClient(value = "memeber-service",fallback = MemberServiceFallBack.class)*/
public interface MemberService {
    /**
     * 获取会员信息
     * @return
     */
    @RequestMapping("/getMember")
    public String getMember();
}
