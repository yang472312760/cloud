package com.yang.cloud.config.nacos.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>@ProjectName:cloud</p>
 * <p>@Package:com.yang.cloud.config.nacos.client.controller</p>
 * <p>@ClassName:TestController</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2021/2/8 14:45</p>
 * <p>@Version:1.0</p>
 */
@RestController
@RefreshScope
@RequestMapping
public class TestController {


    @Value("${user.name}")
    private String name;

    @GetMapping("name")
    public String name(){
        return name;
    }

}
