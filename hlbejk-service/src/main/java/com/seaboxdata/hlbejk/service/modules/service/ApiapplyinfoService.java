package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import java.util.Map;
import com.seaboxdata.hlbejk.service.modules.entity.Apiapplyinfo;

/**
 * 接口申请表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
public interface ApiapplyinfoService extends IService<Apiapplyinfo> {

    PageUtils queryPage(Map<String, Object> params);

    Apiapplyinfo queryById(String id);

    Boolean insert(Apiapplyinfo apiapplyinfo);

    Boolean update(Apiapplyinfo apiapplyinfo);
}

