package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.ModelapplyinfoVO;
import com.seaboxdata.hlbejk.service.modules.entity.Modelapplyinfo;

/**
 * 模型申请表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
public interface ModelapplyinfoService extends IService<Modelapplyinfo> {

    PageUtils queryPage(Map<String, Object> params);

    Modelapplyinfo queryById(String id);

    Boolean insert(Modelapplyinfo modelapplyinfo);

    Boolean update(Modelapplyinfo modelapplyinfo);
}

