package com.mall.shopweb.client;


import com.mall.shopweb.client.fallback.RemoteFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        //bean的id
        contextId = "nacosRegisterDemoServiceClient",
        //服务名称
        value = "spring-cloud-alibaba-nacos-register-demo",
        //远程调用失败回调
        fallbackFactory = RemoteFallbackImpl.class)
public interface NacosRegisterDemoServiceClient {

    @GetMapping("/nacosRegisterDemoService/helloNacos")
    String helloNacos();
}
