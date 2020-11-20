package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.hlbejk.service.modules.entity.DeptAccess;
import com.seaboxdata.commons.core.util.api.PageUtils;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.DeptAccessVO;

/**
 * 部门资源调用统计次数
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-04 10:33:33
 */
public interface DeptAccessService extends IService<DeptAccess> {

    PageUtils queryPage(Map<String, Object> params);

    DeptAccess queryById(String id);

    Boolean insert(DeptAccess deptAccess);

    Boolean update(DeptAccess deptAccess);
}

