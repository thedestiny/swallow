package com.destiny.swallow.mapper;

import java.io.Serializable;

import com.destiny.swallow.model.RoleResource;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 *
 * RoleResource 表数据库控制层接口
 *
 */
public interface RoleResourceMapper extends BaseMapper<RoleResource> {

    @Select("SELECT e.id AS id FROM role r LEFT JOIN role_resource e ON r.id = e.role_id WHERE r.id = #{id}")
    Long selectIdListByRoleId(@Param("id") Long id);

    @Delete("DELETE FROM role_resource WHERE resource_id = #{resourceId}")
    int deleteByResourceId(@Param("resourceId") Serializable resourceId);

}