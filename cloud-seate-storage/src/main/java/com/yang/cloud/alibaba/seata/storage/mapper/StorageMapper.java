package com.yang.cloud.alibaba.seata.storage.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>@ProjectName:cloud</p>
 * <p>@Package:com.yang.cloud.alibaba.seata.storage.mapper</p>
 * <p>@ClassName:StorageMapper</p>
 * <p>@Description:${description}</p>
 * <p>@Author:yang</p>
 * <p>@Date:2021/2/10 16:27</p>
 * <p>@Version:1.0</p>
 */
@Mapper
public interface StorageMapper {
    /**
     * 扣减库存信息
     *
     * @param productId
     * @param count
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);

}
