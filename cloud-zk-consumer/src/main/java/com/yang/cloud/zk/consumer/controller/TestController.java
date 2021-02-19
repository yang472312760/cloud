package com.yang.cloud.zk.consumer.controller;

import com.yang.cloud.zk.consumer.lb.LoadBalancer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>@ProjectName:cloud</p>
 * <p>@Package:com.yang.cloud.config.nacos.consumer.controller</p>
 * <p>@ClassName:TestController</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2021/2/8 13:59</p>
 * <p>@Version:1.0</p>
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${service-url.zk-consumer-service}")
    private String URL;

    @Resource
    private LoadBalancer loadBalancer;

    @Resource
    private DiscoveryClient discoveryClient;

    /**
     * 返回对象为响应体中数据转化成的对象，基本上可以理解json
     * @return
     */
    @GetMapping("service")
    public String getService(){
        String template = restTemplate.getForObject(URL + "/test/name", String.class);
        return template;
    }

    /**
     * 返回对象为ResponseEntity对象，包含了响应中的一些重要信息，比如响应头、响应状态码、响应体等
     * @return
     */
    @GetMapping("entity")
    public Map<String,Object> getResponseEntity(){
        Map map = new HashMap();
        ResponseEntity<String> forEntity = restTemplate.getForEntity(URL + "/test/name", String.class);
        map.put("status", forEntity.getStatusCode().toString());
        map.put("heads",forEntity.getHeaders().toString());
        map.put("body",forEntity.getBody());
        return map;
    }


    @GetMapping(value = "/my/lb")
    public String getMyLB(){
        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-provider");
        if (instances == null || instances.size() <= 0){
            return null;
        }
        ServiceInstance serviceInstance = loadBalancer.instances(instances);
        URI uri = serviceInstance.getUri();
        return restTemplate.getForObject(uri+"/test/name",String.class);
    }

}
