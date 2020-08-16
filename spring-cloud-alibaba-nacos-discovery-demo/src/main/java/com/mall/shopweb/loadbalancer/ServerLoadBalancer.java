package com.mall.shopweb.loadbalancer;


import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * 采用策略模式进行负载均衡
 */
public interface ServerLoadBalancer {

    /**
     * 获取服务对象
     *
     * @param serviceInstances
     * @return
     */
    ServiceInstance getServiceInstance(List<ServiceInstance> serviceInstances);

}
