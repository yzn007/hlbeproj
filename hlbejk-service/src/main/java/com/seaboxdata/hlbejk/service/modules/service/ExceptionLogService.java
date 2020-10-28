package com.seaboxdata.hlbejk.service.modules.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.hlbejk.service.modules.entity.ExceptionLog;

public interface ExceptionLogService extends IService<ExceptionLog> {
	PageUtils queryPage(Map<String, Object> params);

	ExceptionLog queryById(String id);

	Boolean insert(ExceptionLog operationlogs);

}
