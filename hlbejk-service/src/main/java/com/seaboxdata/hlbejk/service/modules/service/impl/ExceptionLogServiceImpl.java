package com.seaboxdata.hlbejk.service.modules.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import com.seaboxdata.hlbejk.service.modules.dao.ExceptionLogDao;
import com.seaboxdata.hlbejk.service.modules.entity.ExceptionLog;
import com.seaboxdata.hlbejk.service.modules.entity.OperationLog;
import com.seaboxdata.hlbejk.service.modules.service.ExceptionLogService;

@Service("exceptionLogService")
public class ExceptionLogServiceImpl extends ServiceImpl<ExceptionLogDao, ExceptionLog> implements ExceptionLogService {

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		String operUserName = (String) params.get("operUserName");
		String startDate = (String) params.get("startDate");
		String endDate = (String) params.get("endDate");
		IPage<ExceptionLog> page = this.baseMapper.queryPage(new Query<ExceptionLog>().getPage(params), operUserName,
				startDate, endDate);
		return new PageUtils(page);
	}

	@Override
	public ExceptionLog queryById(String id) {
		ExceptionLog operationlogs = this.getById(id);
		return operationlogs;
	}

	@Override
	public Boolean insert(ExceptionLog operationlogs) {
		this.save(operationlogs);
		return true;
	}

}