package com.yang.cloud.config.nacos.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>@ProjectName:cloud</p>
 * <p>@Package:com.yang.cloud.config.nacos.consumer</p>
 * <p>@ClassName:CloudConfigNacosConsumer</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2021/2/8 13:56</p>
 * <p>@Version:1.0</p>
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudConfigNacosConsumer {

    public static void main(String[] args) {

        SpringApplication.run(CloudConfigNacosConsumer.class, args);

    }
}
