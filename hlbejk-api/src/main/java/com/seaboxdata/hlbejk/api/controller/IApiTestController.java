package com.seaboxdata.hlbejk.api.controller;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.hlbejk.api.FeignClientConfig;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 */
@Api(tags = { "测试表" })
@FeignClient(contextId = "hlbejkapitest", name = FeignClientConfig.NAME, url = FeignClientConfig.URL, configuration = FeignClientsConfiguration.class)
public interface IApiTestController {

	/**
	 * 列表
	 */
	@ApiOperation(value = "列表")
	@GetMapping("/hlbejk/test/list")
	PageUtils list(@RequestParam Map<String, Object> params);

	@ApiOperation(value = "列表")
	@GetMapping("/hlbejk/test/list2")
	List<Map> list2(@RequestParam Map<String, Object> params);

}
