package com.yang.cloud.alibaba.seata.storage.service;

/**
 * <p>@ProjectName:cloud</p>
 * <p>@Package:com.yang.cloud.alibaba.seata.storage.service</p>
 * <p>@ClassName:StorageService</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2021/2/10 16:30</p>
 * <p>@Version:1.0</p>
 */
public interface StorageService {

    // 扣减库存
    void decrease(Long productId, Integer count);
}
