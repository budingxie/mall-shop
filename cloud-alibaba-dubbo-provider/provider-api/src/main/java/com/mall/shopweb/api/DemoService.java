package com.mall.shopweb.api;


import com.mall.shopweb.model.DemoData;

public interface DemoService {


    /**
     * dubbo接口
     *
     * @param id
     * @return
     */
    DemoData hello(Long id);
}
