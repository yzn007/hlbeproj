package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.ModelaccessinfoVO;
import com.seaboxdata.hlbejk.service.modules.entity.Modelaccessinfo;


/**
 * 模型调用表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
public interface ModelaccessinfoService extends IService<Modelaccessinfo> {

    PageUtils queryPage(Map<String, Object> params);

    Modelaccessinfo queryById(String id);

    Boolean insert(Modelaccessinfo modelaccessinfo);

    Boolean update(Modelaccessinfo modelaccessinfo);
}

