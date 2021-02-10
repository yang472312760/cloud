package com.yang.cloud.alibaba.sentinel.controller.entity;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * <p>@ProjectName:cloud</p>
 * <p>@Package:com.yang.cloud.alibaba.sentinel.controller.entity</p>
 * <p>@ClassName:CustomerBlockHandler</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2021/2/10 12:38</p>
 * <p>@Version:1.0</p>
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler");

    }

}
