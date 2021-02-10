package com.yang.cloud.alibaba.seata.order.mapper;

import com.yang.cloud.alibaba.seata.order.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>@ProjectName:cloud</p>
 * <p>@Package:com.yang.cloud.alibaba.seata.order.dao</p>
 * <p>@ClassName:OrderDao</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2021/2/10 15:56</p>
 * <p>@Version:1.0</p>
 */
@Mapper
public interface OrderMapper {
    //新建订单
    void create(Order order);

    //修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
