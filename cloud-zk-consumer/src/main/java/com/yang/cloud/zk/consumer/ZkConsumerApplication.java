package com.yang.cloud.zk.consumer;

import com.yang.myrole.MySelfRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
//@RibbonClient(name = "cloud-provider",configuration = MySelfRule.class)
public class ZkConsumerApplication {


    public static void main(String[] args) {

        SpringApplication.run(ZkConsumerApplication.class, args);

    }

}
