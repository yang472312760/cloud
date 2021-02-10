package com.yang.cloud.alibaba.seata.order.feign;

import com.yang.cloud.alibaba.seata.order.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>@ProjectName:cloud</p>
 * <p>@Package:com.yang.cloud.alibaba.seata.order.feign</p>
 * <p>@ClassName:StorageService</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2021/2/10 16:02</p>
 * <p>@Version:1.0</p>
 */

@FeignClient(value = "seata-storage-service")
public interface StorageService {
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
