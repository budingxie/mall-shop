package com.mall.shopweb.service;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nacosRegisterDemoService")
public class NacosRegisterDemoService {

    @GetMapping("/helloNacos")
    public String helloNacos() {
        return "hello nacos";
    }

}
