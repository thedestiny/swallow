package com.destiny.swallow.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.destiny.swallow.commons.result.PageInfo;
import com.destiny.swallow.model.vo.UserVo;
import com.destiny.swallow.model.User;

/**
 *
 * User 表数据服务层接口
 *
 */
public interface UserService extends IService<User> {

    List<User> selectByLoginName(UserVo userVo);

    void insertByVo(UserVo userVo);

    UserVo selectVoById(Long id);

    void updateByVo(UserVo userVo);

    void updatePwdByUserId(Long userId, String md5Hex);

    void selectDataGrid(PageInfo pageInfo);

    void deleteUserById(Long id);
}