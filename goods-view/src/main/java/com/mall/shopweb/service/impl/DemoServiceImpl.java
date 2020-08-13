package com.mall.shopweb.service.impl;

import com.mall.shopweb.mapper.DemoMapper;
import com.mall.shopweb.po.DemoPo;
import com.mall.shopweb.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoMapper demoMapper;


    @Override
    public String serviceTest() {
        DemoPo demoPo = demoMapper.selectOne(null);
        log.info("act=serviceTest, desc=demoCommon: {} ", demoPo);
        return "ok";
    }
}
