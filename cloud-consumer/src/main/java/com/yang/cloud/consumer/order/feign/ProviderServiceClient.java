package com.yang.cloud.consumer.order.feign;

import com.yang.cloud.base.model.system.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(value = "CLOUD-PROVIDER", fallback = ProviderServiceClientFallBack.class)
public interface ProviderServiceClient {

    @GetMapping("/system/role/page")
    public CommonResult getList();

}
