package com.seaboxdata.hlbejk.service.modules.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import com.seaboxdata.hlbejk.service.modules.dao.OperationLogDao;
import com.seaboxdata.hlbejk.service.modules.entity.OperationLog;
import com.seaboxdata.hlbejk.service.modules.service.OperationLogService;

@Service("operationLogService")
public class OperationLogServiceImpl extends ServiceImpl<OperationLogDao, OperationLog> implements OperationLogService {

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		String operUserName = (String) params.get("operUserName");
		String typeOrModul = (String) params.get("typeOrModul");
		String startDate = (String) params.get("startDate");
		String endDate = (String) params.get("endDate");
		IPage<OperationLog> page = this.baseMapper.queryPage(new Query<OperationLog>().getPage(params), operUserName,
				typeOrModul, startDate, endDate);

		return new PageUtils(page);
	}

	@Override
	public OperationLog queryById(String id) {
		OperationLog operationlogs = this.getById(id);
		return operationlogs;
	}

	@Override
	public Boolean insert(OperationLog operationlogs) {
		this.save(operationlogs);
		return true;
	}

}