package com.mall.shopweb.controller;


import com.mall.shopweb.model.DemoData;
import com.mall.shopweb.service.TestDemoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RefreshScope//启动 动态感知配置的修改
public class TestController {

    /**
     * 启动错误，需要在nacos的配置界面，配置config.test的yaml。参考配置中心.png
     */
    @Value("${config.test}")
    private String configTest;

    @Resource
    private TestDemoService testDemoService;

    @GetMapping("/test")
    public DemoData getDemoData(Long id) {
        System.out.println("---------configTest: " + configTest);
        return testDemoService.getDemoData(id);
    }

}
