package com.yang.cloud.config.nacos.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>@ProjectName:cloud</p>
 * <p>@Package:com.yang.cloud.config.nacos.client</p>
 * <p>@ClassName:NacosConfigClientMain</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2021/2/8 14:43</p>
 * <p>@Version:1.0</p>
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientMain {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientMain.class, args);
    }
}
