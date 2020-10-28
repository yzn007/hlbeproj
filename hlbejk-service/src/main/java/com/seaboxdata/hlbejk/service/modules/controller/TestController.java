package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.hlbejk.api.controller.IApiTestController;
import com.seaboxdata.hlbejk.common.utils.annotation.OperLog;
import com.seaboxdata.hlbejk.service.modules.service.TestService;

@RestController
public class TestController implements IApiTestController {

	@Autowired
	private TestService testService;

	/**
	 * 列表
	 */
	@OperLog(operModul = "测试管理", operType = "test", operDesc = "测试日志注解")
	@Override
	public PageUtils list(@RequestParam Map<String, Object> params) {
		PageUtils page = testService.list(params);
		return page;
	}

	/**
	 * 列表
	 */
	@Override
	public List<Map> list2(@RequestParam Map<String, Object> params) {
		List<Map> page = testService.list2(params);
		return page;
	}

}
