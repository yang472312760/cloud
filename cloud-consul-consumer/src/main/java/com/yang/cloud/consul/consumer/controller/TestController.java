package com.yang.cloud.consul.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    @Value("${service-url.consul-consumer-service}")
    private String URL;

    @GetMapping("service")
    public String getService(){
        String template = restTemplate.getForObject(URL + "/test/name", String.class);
        return template;
    }

}
