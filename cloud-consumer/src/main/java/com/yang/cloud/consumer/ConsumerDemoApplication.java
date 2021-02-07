package com.yang.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

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
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.yang.cloud")
@EnableFeignClients
public class ConsumerDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConsumerDemoApplication.class, args);

    }

}
