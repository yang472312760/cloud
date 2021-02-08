package com.yang.cloud.alibaba.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>@ProjectName:cloud</p>
 * <p>@Package:com.yang.cloud.alibaba.nacos.provider.controller</p>
 * <p>@ClassName:TestController</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2021/2/8 12:56</p>
 * <p>@Version:1.0</p>
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private String port;

    @GetMapping("name")
    public String appName(){
        return applicationName + port;
    }

}
