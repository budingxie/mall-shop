package com.mall.shopweb.client.fallback;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class RemoteFallbackFactory implements FallbackFactory<RemoteFallbackImpl> {

    @Override
    public RemoteFallbackImpl create(Throwable throwable) {
        RemoteFallbackImpl remoteFallback = new RemoteFallbackImpl();
        remoteFallback.setThrowable(throwable);
        return remoteFallback;
    }
}
