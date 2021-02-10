package com.yang.cloud.sentinel.consumer.service;

import com.yang.cloud.sentinel.consumer.entity.CommonResult;
import com.yang.cloud.sentinel.consumer.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>@ProjectName:cloud</p>
 * <p>@Package:com.yang.cloud.sentinel.consumer.service</p>
 * <p>@ClassName:PaymentService</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2021/2/10 13:38</p>
 * <p>@Version:1.0</p>
 */
@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)
public interface PaymentService {
    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult paymentSQL(@PathVariable("id") Long id);
}
