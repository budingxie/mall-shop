package com.mall.shopweb.client.fallback;

import com.mall.shopweb.client.NacosRegisterDemoServiceClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RemoteFallbackImpl implements NacosRegisterDemoServiceClient {

    private Throwable throwable;

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

    @Override
    public String helloNacos() {
        log.error("feign 查询信息失败:{}", ExceptionUtils.getStackTrace(throwable));
        return "call fail";
    }
}
