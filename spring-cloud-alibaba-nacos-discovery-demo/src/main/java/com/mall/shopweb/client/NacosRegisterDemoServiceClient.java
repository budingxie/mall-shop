package com.mall.shopweb.client;


import com.mall.shopweb.client.fallback.RemoteFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        //bean的id
        contextId = "nacosRegisterDemoServiceClient",
        //服务名称
        value = "spring-cloud-alibaba-nacos-register-demo",
        //远程调用失败，兜底的数据
        fallbackFactory = RemoteFallbackFactory.class)
public interface NacosRegisterDemoServiceClient {

    @GetMapping("/nacosRegisterDemoService/helloNacos")
    String helloNacos();
}
