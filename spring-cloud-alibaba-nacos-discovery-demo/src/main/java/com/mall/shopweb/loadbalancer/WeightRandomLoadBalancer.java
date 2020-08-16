package com.mall.shopweb.loadbalancer;


import org.springframework.cloud.client.ServiceInstance;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightRandomLoadBalancer implements ServerLoadBalancer {

    private Map<ServiceInstance, Integer> map = new HashMap<>();

    @Override
    public ServiceInstance getServiceInstance(List<ServiceInstance> serviceInstances) {
        serviceInstances.stream().forEach(ele -> map.put(ele, 1));
        return null;
    }

}
