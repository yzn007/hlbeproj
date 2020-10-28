package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.hlbejk.api.controller.IApiLogInfoController;
import com.seaboxdata.hlbejk.service.modules.service.ExceptionLogService;
import com.seaboxdata.hlbejk.service.modules.service.OperationLogService;

/**
 * 操作日志
 * 
 * @author
 *
 */
@RestController
public class LogInfoController implements IApiLogInfoController {

	@Autowired
	private OperationLogService operationLogService;

	@Autowired
	private ExceptionLogService exceptionLogService;

	/**
	 * 操作日志
	 */
	@Override
	public PageUtils operationLogList(Map<String, Object> params) {
		PageUtils page = operationLogService.queryPage(params);
		return page;
	}

	/**
	 * 错误日志
	 */
	@Override
	public PageUtils exceptionLogList(Map<String, Object> params) {
		PageUtils page = exceptionLogService.queryPage(params);
		return page;
	}

}
