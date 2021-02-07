package com.yang.cloud.consumer.order.mapper;

import com.yang.cloud.base.mapper.IBaseMapper;
import com.yang.cloud.consumer.order.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface OrderMapper extends IBaseMapper<Order> {
}
