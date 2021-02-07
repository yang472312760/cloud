/**
 * CacheService.java
 * Created at 2019-6-18
 * Created by yang
 * Copyright (C) 2019 SAIC VOLKSWAGEN, All rights reserved.
 */
package com.yang.cloud.base.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang.cloud.base.model.system.PageParam;
import java.util.List;

/**
 * <p>
 * ClassName: ICacheService
 * </p>
 * <p>
 * Description: 二级缓存接口类
 * </p>
 * <p>
 * Author: yang
 * </p>
 * <p>
 * Date: 2019年9月16日
 * </p>
 * @author yang
 */
public interface IBaseService<T> extends IService<T> {

    /**
     * 
     * <p>
     * Description: 分页查询(按照页码及分页大小分页)
     * </p>
     * 
     * @param pageParam 分页信息
     * @param t 实体类
     * @return List<T> 数据集合
     */
    List<T> queryPage(PageParam pageParam, T t);
    
    /**
     * 
     * <p>Description: 分页查询(按照起始下标及偏移量分页)</p>
     * @param pageParam 分页信息
     * @param t 实体类
     * @return List<T> 数据集合
     */
    List<T> offsetPage(PageParam pageParam, T t);


}
