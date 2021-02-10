package com.yang.cloud.alibaba.seata.order.controller;

import com.yang.cloud.alibaba.seata.order.entity.CommonResult;
import com.yang.cloud.alibaba.seata.order.entity.Order;
import com.yang.cloud.alibaba.seata.order.service.OrderService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>@ProjectName:cloud</p>
 * <p>@Package:com.yang.cloud.alibaba.seata.order.controller</p>
 * <p>@ClassName:OrderController</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2021/2/10 16:04</p>
 * <p>@Version:1.0</p>
 */
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}
