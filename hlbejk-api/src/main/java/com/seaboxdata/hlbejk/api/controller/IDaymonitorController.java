package com.seaboxdata.hlbejk.api.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;
import com.seaboxdata.hlbejk.api.FeignClientConfig;
import com.seaboxdata.hlbejk.api.vo.DaymonitorVO;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import com.seaboxdata.commons.core.util.api.PageUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 用户监控日表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 14:22:28
 */
@Api(tags = {"用户监控日信息"})
@FeignClient(contextId = "hlbejkdaymonitor",
        name = FeignClientConfig.NAME, url = FeignClientConfig.URL, configuration = FeignClientsConfiguration.class)
public interface IDaymonitorController {

    /**
     * 列表
     */
    @ApiOperation(value = "列表")
    @GetMapping("/hlbejk/daymonitor/list")
    PageUtils list(@RequestParam Map<String, Object> params);




    /**
     * 详细信息
     */
    @ApiOperation(value = "详细信息")
    @GetMapping("/hlbejk/daymonitor/info/{id}")
    DaymonitorVO info(@PathVariable("id") String id);

    /**
     * 保存
     */
    @ApiOperation(value = "保存")
    @PostMapping("/hlbejk/daymonitor/save")
    Boolean save(@RequestBody DaymonitorVO daymonitorVO);

    /**
     * 修改
     */
    @ApiOperation(value = "修改")
    @PostMapping("/hlbejk/daymonitor/update")
    Boolean update(@RequestBody DaymonitorVO daymonitorVO);

    /**
     * 删除
     */
    @ApiOperation(value = "删除")
    @DeleteMapping("/hlbejk/daymonitor/delete")
    Boolean delete(@RequestBody String[] ids);


    /**
     * 返回指定日期的列表
     */
    @ApiOperation(value = "指定日期查询")
    @GetMapping("/hlbejk/daymonitor/list1")
    List<DaymonitorVO> listQ(@RequestParam String day);
}
