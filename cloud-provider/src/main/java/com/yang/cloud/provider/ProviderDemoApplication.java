package com.yang.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>@ProjectName:spring-boot-stady-demo-consumer</p>
 * <p>@Package:com.yang.springboot.stady.demo.consumer</p>
 * <p>@ClassName:ConsumerDemoApplication</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2020/5/12 10:54</p>
 * <p>@Version:1.0</p>
 */
@EnableEurekaClient
@SpringBootApplication(scanBasePackages = "com.yang.cloud")
@EnableDiscoveryClient
public class ProviderDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProviderDemoApplication.class, args);

    }

}
