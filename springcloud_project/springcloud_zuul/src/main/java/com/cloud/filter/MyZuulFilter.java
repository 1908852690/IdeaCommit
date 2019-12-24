package com.cloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
@Component
public class MyZuulFilter extends ZuulFilter {
    /**
     * 过滤类型
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 请求过滤顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否执行run
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //获取token参数
        RequestContext rc = RequestContext.getCurrentContext();
        HttpServletRequest request = rc.getRequest();

        String token = request.getParameter("token");
        if(token!=null){
            return null;
        }
        //表示不进行路由
        rc.setSendZuulResponse(false);
        rc.setResponseStatusCode(401);

        try {
            rc.getResponse().setContentType("text/html;charset=utf-8");
            rc.getResponse().getWriter().write("没有传递正确参数，请校验后重试~");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
