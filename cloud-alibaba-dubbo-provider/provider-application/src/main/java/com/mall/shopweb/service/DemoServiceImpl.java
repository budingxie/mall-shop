package com.mall.shopweb.service;

import com.mall.shopweb.api.DemoService;
import com.mall.shopweb.model.DemoData;
import org.apache.dubbo.config.annotation.Service;

@Service(timeout = 3000)
public class DemoServiceImpl implements DemoService {

    @Override
    public DemoData hello(Long id) {
        return DemoData.builder().id(id).age(18).name("张三").build();
    }
}
