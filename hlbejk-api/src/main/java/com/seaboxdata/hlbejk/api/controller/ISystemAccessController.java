package com.seaboxdata.hlbejk.api.controller;

import java.util.Map;
import com.seaboxdata.hlbejk.api.FeignClientConfig;
import com.seaboxdata.hlbejk.api.vo.SystemAccessVO;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import com.seaboxdata.commons.core.util.api.PageUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 系统访问统计报表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-04 10:33:33
 */
@Api(tags = {"系统访问统计报表"})
@FeignClient(contextId = "hlbejksystemaccess",
        name = FeignClientConfig.NAME, url = FeignClientConfig.URL, configuration = FeignClientsConfiguration.class)
public interface ISystemAccessController {

    /**
     * 列表
     */
    @ApiOperation(value = "列表")
    @GetMapping("/hlbejk/systemaccess/list")
    PageUtils list(@RequestParam Map<String, Object> params);


    /**
     * 详细信息
     */
    @ApiOperation(value = "详细信息")
    @GetMapping("/hlbejk/systemaccess/info/{id}")
    SystemAccessVO info(@PathVariable("id") String id);

    /**
     * 保存
     */
    @ApiOperation(value = "保存")
    @PostMapping("/hlbejk/systemaccess/save")
    Boolean save(@RequestBody SystemAccessVO systemAccessVO);

    /**
     * 修改
     */
    @ApiOperation(value = "修改")
    @PostMapping("/hlbejk/systemaccess/update")
    Boolean update(@RequestBody SystemAccessVO systemAccessVO);

    /**
     * 删除
     */
    @ApiOperation(value = "删除")
    @DeleteMapping("/hlbejk/systemaccess/delete")
    Boolean delete(@RequestBody String[] ids);

}
