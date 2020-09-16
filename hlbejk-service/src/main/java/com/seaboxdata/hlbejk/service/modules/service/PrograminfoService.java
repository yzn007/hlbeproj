package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.PrograminfoVO;
import com.seaboxdata.hlbejk.service.modules.entity.Programinfo;

/**
 * 算法信息
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 17:35:51
 */
public interface PrograminfoService extends IService<Programinfo> {

    PageUtils queryPage(Map<String, Object> params);

    Programinfo queryById(String id);

    Boolean insert(Programinfo programinfo);

    Boolean update(Programinfo programinfo);
}

