package com.destiny.swallow.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.destiny.swallow.model.Organization;
import com.destiny.swallow.commons.result.Tree;

/**
 *
 * Organization 表数据服务层接口
 *
 */
public interface OrganizationService extends IService<Organization> {

    List<Tree> selectTree();

    List<Organization> selectTreeGrid();

}