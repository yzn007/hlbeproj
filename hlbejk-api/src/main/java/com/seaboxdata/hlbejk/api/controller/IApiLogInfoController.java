package com.seaboxdata.hlbejk.api.controller;

import java.util.Map;
import com.seaboxdata.hlbejk.api.FeignClientConfig;
import com.seaboxdata.hlbejk.api.vo.ApiaccessinfoVO;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import com.seaboxdata.commons.core.util.api.PageUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @author zhaozm
 *
 */
@Api(tags = { "操作日志接口调用表" })
@FeignClient(contextId = "hlbejkapilog", name = FeignClientConfig.NAME, url = FeignClientConfig.URL, configuration = FeignClientsConfiguration.class)
public interface IApiLogInfoController {

	/**
	 * 操作日志列表列表
	 */
	@ApiOperation(value = "操作日志列表")
	@GetMapping("/hlbejk/log/operation")
	PageUtils operationLogList(@RequestParam Map<String, Object> params);

	/**
	 * 错误操作日志列表
	 */
	@ApiOperation(value = "错误操作日志列表")
	@GetMapping("/hlbejk/log/exception")
	PageUtils exceptionLogList(@RequestParam Map<String, Object> params);
}
