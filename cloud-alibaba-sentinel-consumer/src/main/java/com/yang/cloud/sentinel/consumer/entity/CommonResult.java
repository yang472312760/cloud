package com.yang.cloud.sentinel.consumer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>@ProjectName:cloud</p>
 * <p>@Package:com.yang.cloud.alibaba.sentinel.controller.entity</p>
 * <p>@ClassName:CommonResult</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2021/2/10 11:43</p>
 * <p>@Version:1.0</p>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CommonResult {

    private Integer code;

    private String message;

    private Object object;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
