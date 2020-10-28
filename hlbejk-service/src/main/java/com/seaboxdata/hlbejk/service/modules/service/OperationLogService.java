package com.seaboxdata.hlbejk.service.modules.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.hlbejk.service.modules.entity.OperationLog;

public interface OperationLogService extends IService<OperationLog>{
	PageUtils queryPage(Map<String, Object> params);

	OperationLog queryById(String id);

    Boolean insert(OperationLog operationlogs);

}
