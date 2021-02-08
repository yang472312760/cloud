package com.yang.cloud.alibaba.nacos.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>@ProjectName:cloud</p>
 * <p>@Package:com.yang.cloud.alibaba.nacos.provider</p>
 * <p>@ClassName:CloudAlibabaProviderApplication</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2021/2/8 11:50</p>
 * <p>@Version:1.0</p>
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.yang.cloud")
public class CloudAlibabaProviderApplication {

    public static void main(String[] args) {

        SpringApplication.run(CloudAlibabaProviderApplication.class, args);

    }

}
