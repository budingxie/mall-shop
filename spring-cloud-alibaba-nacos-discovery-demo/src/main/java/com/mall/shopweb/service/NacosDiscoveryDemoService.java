package com.mall.shopweb.service;


import com.mall.shopweb.loadbalancer.ServerLoadBalancer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/nacosDiscoveryDemoService")
public class NacosDiscoveryDemoService {

    @Resource
    private DiscoveryClient discoveryClient;

    @Resource
    private ServerLoadBalancer serverLoadBalancer;

    @Resource
    private LoadBalancerClient loadBalancerClient;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/getHello")
    public String getHello() {
        //负载均衡
        //ServiceInstance serverInstance = loadBalancerClient.choose("spring-cloud-alibaba-nacos-register-demo");
        //String result = restTemplate.getForObject(serverInstance.getUri() + "/nacosRegisterDemoService/helloNacos", String.class);

        //1.根据服务名称，从注册中心获取服务列表
        List<ServiceInstance> server = discoveryClient.getInstances("spring-cloud-alibaba-nacos-register-demo");
        //2.采用策略模式来实现 负载算法：一致性hash、轮询、权重、随机
        ServiceInstance instance = serverLoadBalancer.getServiceInstance(server);
        String result = restTemplate.getForObject(instance.getUri() + "/nacosRegisterDemoService/helloNacos", String.class);
        return result + instance.getPort();
    }

}
