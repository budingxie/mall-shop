package com.mall.shopweb.controller;

import com.mall.shopweb.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo")
@Slf4j
public class DemoController {

    @Resource
    private DemoService demoService;

    @GetMapping("/test")
    public String testDemo() {
        log.info("act=testDemo, desc=demoService: {}", demoService.serviceTest());
        return "ok";
    }

}
