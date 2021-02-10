package com.yang.cloud.sentinel.consumer.service;

import com.yang.cloud.sentinel.consumer.entity.CommonResult;
import com.yang.cloud.sentinel.consumer.entity.Payment;
import org.springframework.stereotype.Component;

/**
 * <p>@ProjectName:cloud</p>
 * <p>@Package:com.yang.cloud.sentinel.consumer.service</p>
 * <p>@ClassName:PaymentFallbackService</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2021/2/10 13:38</p>
 * <p>@Version:1.0</p>
 */

@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult paymentSQL(Long id) {
        return new CommonResult(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
