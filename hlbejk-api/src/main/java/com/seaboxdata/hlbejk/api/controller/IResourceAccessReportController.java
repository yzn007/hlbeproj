package com.seaboxdata.hlbejk.api.controller;

import java.util.Map;
import com.seaboxdata.hlbejk.api.FeignClientConfig;
import com.seaboxdata.hlbejk.api.vo.ResourceAccessReportVO;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import com.seaboxdata.commons.core.util.api.PageUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 资源访问统计表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-06 15:45:22
 */
@Api(tags = {"资源访问统计表"})
@FeignClient(contextId = "hlbejkresourceaccessreport",
        name = FeignClientConfig.NAME, url = FeignClientConfig.URL, configuration = FeignClientsConfiguration.class)
public interface IResourceAccessReportController {

    /**
     * 列表
     */
    @ApiOperation(value = "列表")
    @GetMapping("/hlbejk/resourceaccessreport/list")
    PageUtils list(@RequestParam Map<String, Object> params);


    /**
     * 详细信息
     */
    @ApiOperation(value = "详细信息")
    @GetMapping("/hlbejk/resourceaccessreport/info/{id}")
    ResourceAccessReportVO info(@PathVariable("id") Long id);

    /**
     * 保存
     */
    @ApiOperation(value = "保存")
    @PostMapping("/hlbejk/resourceaccessreport/save")
    Boolean save(@RequestBody ResourceAccessReportVO resourceAccessReportVO);

    /**
     * 修改
     */
    @ApiOperation(value = "修改")
    @PostMapping("/hlbejk/resourceaccessreport/update")
    Boolean update(@RequestBody ResourceAccessReportVO resourceAccessReportVO);

    /**
     * 删除
     */
    @ApiOperation(value = "删除")
    @DeleteMapping("/hlbejk/resourceaccessreport/delete")
    Boolean delete(@RequestBody Long [] ids);

}
