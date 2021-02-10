package com.yang.cloud.alibaba.seata.order.service;

import com.yang.cloud.alibaba.seata.order.entity.Order;

/**
 * <p>@ProjectName:cloud</p>
 * <p>@Package:com.yang.cloud.alibaba.seata.order.service</p>
 * <p>@ClassName:OrderService</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2021/2/10 16:00</p>
 * <p>@Version:1.0</p>
 */
public interface OrderService {

    void create(Order order);

}
