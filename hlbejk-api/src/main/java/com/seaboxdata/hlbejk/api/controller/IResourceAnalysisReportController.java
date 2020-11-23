package com.seaboxdata.hlbejk.api.controller;

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
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-20 13:10:58
 */
@Api(tags = {"资源分析"})
@FeignClient(contextId = "resourceanalysisreport",
        name = FeignClientConfig.NAME, url = FeignClientConfig.URL, configuration = FeignClientsConfiguration.class)
public interface IResourceAnalysisReportController {

    /**
     * 列表
     */
    @ApiOperation(value = "列表")
    @GetMapping("/hlbr/resourceanalysisreport/list")
    PageUtils list(@RequestParam Map<String, Object> params);

}
