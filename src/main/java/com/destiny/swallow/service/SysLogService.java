package com.destiny.swallow.service;

import com.baomidou.mybatisplus.service.IService;
import com.destiny.swallow.commons.result.PageInfo;
import com.destiny.swallow.model.SysLog;

/**
 *
 * SysLog 表数据服务层接口
 *
 */
public interface SysLogService extends IService<SysLog> {

    void selectDataGrid(PageInfo pageInfo);

}