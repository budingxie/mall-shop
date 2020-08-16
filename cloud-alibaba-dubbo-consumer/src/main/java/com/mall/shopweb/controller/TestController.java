package com.mall.shopweb.controller;


import com.mall.shopweb.model.DemoData;
import com.mall.shopweb.service.TestDemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private TestDemoService testDemoService;

    @GetMapping("/test")
    public DemoData getDemoData(Long id) {
        return testDemoService.getDemoData(id);
    }

}
