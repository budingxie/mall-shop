package com.mall.shopweb.service;

import com.mall.shopweb.api.DemoService;
import com.mall.shopweb.model.DemoData;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class TestDemoService {

    @Reference(timeout = 3000, check = false)
    private DemoService demoService;

    public DemoData getDemoData(Long id) {
        return demoService.hello(id);
    }
}
