package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.List;
import java.util.Map;

import com.seaboxdata.hlbejk.common.utils.annotation.OperLog;
import com.seaboxdata.hlbejk.service.modules.enums.OperateType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seaboxdata.hlbejk.api.controller.IApiOperTypeController;
import com.seaboxdata.hlbejk.api.vo.ApiOperateTypeVO;
import com.seaboxdata.hlbejk.service.modules.service.ApiOperTypeService;

/**
 * 
 * @author 管理员
 *
 */
@RestController
public class ApiOperTypeController implements IApiOperTypeController {

	@Autowired
	private ApiOperTypeService apiOperTypeService;

	/**
	 * 下拉框
	 */
	@OperLog(operModul = "查询日志信息下拉选",operType = OperateType.QUERY,operDesc = "查询日志信息下拉选")
	@Override
	public List<ApiOperateTypeVO> select(@RequestParam Map<String, Object> params) {
		List<ApiOperateTypeVO> list = apiOperTypeService.queryList(params);
		return list;
	}

}
