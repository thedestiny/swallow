package com.destiny.swallow.service.impl;

import com.destiny.swallow.mapper.UserRoleMapper;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.destiny.swallow.model.UserRole;
import com.destiny.swallow.service.UserRoleService;

/**
 *
 * UserRole 表数据服务层接口实现类
 *
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}