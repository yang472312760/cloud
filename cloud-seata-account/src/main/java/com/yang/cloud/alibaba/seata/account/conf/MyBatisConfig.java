package com.yang.cloud.alibaba.seata.account.conf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>@ProjectName:cloud</p>
 * <p>@Package:com.yang.cloud.alibaba.seata.order.conf</p>
 * <p>@ClassName:MyBatisConfig</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2021/2/10 16:05</p>
 * <p>@Version:1.0</p>
 */

@Configuration
@MapperScan({"com.yang.cloud.alibaba.seata.account.mapper"})
public class MyBatisConfig {

}

