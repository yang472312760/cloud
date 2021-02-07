/**
 * BaseMapper.java
 * Created at 2019-6-18
 * Created by yang
 * Copyright (C) 2019 SAIC VOLKSWAGEN, All rights reserved.
 */
package com.yang.cloud.base.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;

import com.yang.cloud.base.model.system.PageParam;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * ClassName: IBaseMapper
 * </p>
 * <p>
 * Description: 分页基础Mapper
 * </p>
 * <p>
 * Author: yang
 * </p>
 * <p>
 * Date: 2019年9月16日
 * </p>
 * @author yang
 */
public interface IBaseMapper<T> extends BaseMapper<T> {

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
    List<T> queryPage(@Param("page") PageParam pageParam, @Param("et") T t);
    
    /**
     * 
     * <p>Description: 分页查询(按照起始下标及偏移量分页)</p>
     * @param pageParam 分页信息
     * @param t 实体类
     * @return List<T> 数据集合
     */
    List<T> offsetPage(@Param("page") PageParam pageParam, @Param("et") T t);

}
