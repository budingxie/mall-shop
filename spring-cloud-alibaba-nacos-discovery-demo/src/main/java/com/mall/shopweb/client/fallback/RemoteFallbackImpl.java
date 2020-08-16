package com.mall.shopweb.client.fallback;

import com.mall.shopweb.client.NacosRegisterDemoServiceClient;

/**
 * @author pengyou@xiaomi.com
 * @date 2020/8/16
 */
public class RemoteFallbackImpl implements NacosRegisterDemoServiceClient {
    @Override
    public String helloNacos() {
        return "call fail";
    }
}
