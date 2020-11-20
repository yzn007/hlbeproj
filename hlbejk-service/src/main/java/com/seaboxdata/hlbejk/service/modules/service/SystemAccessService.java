package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.hlbejk.service.modules.entity.SystemAccess;
import com.seaboxdata.commons.core.util.api.PageUtils;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.SystemAccessVO;

/**
 * 系统访问统计报表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-04 10:33:33
 */
public interface SystemAccessService extends IService<SystemAccess> {

    PageUtils queryPage(Map<String, Object> params);

    SystemAccess queryById(String id);

    Boolean insert(SystemAccess systemAccess);

    Boolean update(SystemAccess systemAccess);
}

