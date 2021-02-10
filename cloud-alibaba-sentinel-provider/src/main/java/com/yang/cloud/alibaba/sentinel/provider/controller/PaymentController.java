package com.yang.cloud.alibaba.sentinel.provider.controller;

import com.yang.cloud.alibaba.sentinel.provider.entity.CommonResult;
import com.yang.cloud.alibaba.sentinel.provider.entity.Payment;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>@ProjectName:cloud</p>
 * <p>@Package:com.yang.cloud.alibaba.sentinel.provider.controller</p>
 * <p>@ClassName:PaymentController</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2021/2/10 12:56</p>
 * <p>@Version:1.0</p>
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long, Payment> hashMap = new HashMap<>();
    static{
        hashMap.put(1L,new Payment(1L,"28a8c1e3bc2742d8848569891fb42181"));
        hashMap.put(2L,new Payment(2L,"bba8c1e3bc2742d8848569891ac32182"));
        hashMap.put(3L,new Payment(3L,"6ua8c1e3bc2742d8848569891xt92183"));
    }

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult paymentSQL(@PathVariable("id") Long id){
        Payment payment = hashMap.get(id);
        CommonResult result = new CommonResult(200,"from mysql,serverPort:  "+serverPort,payment);
        return result;
    }
}
