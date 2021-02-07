package com.yang.cloud.consumer.order.feign;

import com.yang.cloud.base.model.system.CommonResult;
import org.springframework.stereotype.Component;

@Component
public class ProviderServiceClientFallBack implements ProviderServiceClient{
    @Override
    public CommonResult getList() {
        return new CommonResult().setError("messages.operation.error");
    }
}
