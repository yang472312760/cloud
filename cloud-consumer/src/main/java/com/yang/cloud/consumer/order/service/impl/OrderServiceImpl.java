package com.yang.cloud.consumer.order.service.impl;

import com.yang.cloud.base.service.impl.BaseServiceImpl;
import com.yang.cloud.consumer.order.mapper.OrderMapper;
import com.yang.cloud.consumer.order.model.Order;
import com.yang.cloud.consumer.order.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends BaseServiceImpl<OrderMapper, Order> implements OrderService {
}
