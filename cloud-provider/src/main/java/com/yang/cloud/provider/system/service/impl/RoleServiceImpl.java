/**
 * RoleServiceImpl.java
 * Created at 2020-03-27
 * Created by yang
 * Copyright (C) 2019 SAIC VOLKSWAGEN, All rights reserved.
 */
package com.yang.cloud.provider.system.service.impl;

import com.yang.cloud.base.service.impl.BaseServiceImpl;
import com.yang.cloud.provider.system.mapper.RoleMapper;
import com.yang.cloud.provider.system.model.Role;
import com.yang.cloud.provider.system.service.RoleService;
import org.springframework.stereotype.Service;

/**
 *
 * <p>
 * ClassName: RoleServiceImpl
 * </p>
 * <p>
 * Description: 角色 服务实现类
 * </p>
 * <p>
 * Author: yang
 * </p>
 * <p>
 * Date: 2020-03-27
 * </p>
 * @author Administrator
 */
@Service
public class RoleServiceImpl extends BaseServiceImpl<RoleMapper, Role> implements RoleService {


}
