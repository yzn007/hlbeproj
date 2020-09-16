package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.DeptcallVO;
import com.seaboxdata.hlbejk.service.modules.entity.Deptcall;

/**
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 16:07:22
 */
public interface DeptcallService extends IService<Deptcall> {

    PageUtils queryPage(Map<String, Object> params);

    Deptcall queryById(String id);

    Boolean insert(Deptcall deptcall);

    Boolean update(Deptcall deptcall);
}

