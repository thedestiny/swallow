package com.destiny.swallow.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.destiny.swallow.commons.result.Tree;
import com.destiny.swallow.commons.shiro.ShiroUser;
import com.destiny.swallow.model.Resource;

/**
 *
 * Resource 表数据服务层接口
 *
 */
public interface ResourceService extends IService<Resource> {

    List<Resource> selectAll();

    List<Tree> selectAllMenu();

    List<Tree> selectAllTree();

    List<Tree> selectTree(ShiroUser shiroUser);

}