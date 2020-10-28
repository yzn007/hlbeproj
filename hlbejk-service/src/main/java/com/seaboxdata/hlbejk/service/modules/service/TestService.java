package com.seaboxdata.hlbejk.service.modules.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.hlbejk.service.modules.entity.Apiaccessinfo;

public interface TestService extends IService<Apiaccessinfo> {

	PageUtils list(Map<String, Object> params);

	List<Map> list2(Map<String, Object> params);

}
