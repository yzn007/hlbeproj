package com.seaboxdata.hlbejk.api.controller;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.seaboxdata.hlbejk.api.FeignClientConfig;
import com.seaboxdata.hlbejk.api.vo.ApiOperateTypeVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @author 管理员
 *
 */
@Api(tags = {"操作类型下拉框"})
@FeignClient(contextId = "operTypeInfo",
        name = FeignClientConfig.NAME, url = FeignClientConfig.URL, configuration = FeignClientsConfiguration.class)
public interface IApiOperTypeController {

    /**
     * 列表
     */
    @ApiOperation(value = "操作类型列表")
    @GetMapping("/hlbejk/operType/select")
    List<ApiOperateTypeVO> select(@RequestParam Map<String, Object> params);

}
