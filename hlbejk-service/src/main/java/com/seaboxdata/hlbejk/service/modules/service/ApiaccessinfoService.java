package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.ApiaccessinfoVO;
import com.seaboxdata.hlbejk.service.modules.entity.Apiaccessinfo;

/**
 * 接口调用表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
public interface ApiaccessinfoService extends IService<Apiaccessinfo> {

    PageUtils queryPage(Map<String, Object> params);

    Apiaccessinfo queryById(String id);

    Boolean insert(Apiaccessinfo apiaccessinfo);

    Boolean update(Apiaccessinfo apiaccessinfo);
}

