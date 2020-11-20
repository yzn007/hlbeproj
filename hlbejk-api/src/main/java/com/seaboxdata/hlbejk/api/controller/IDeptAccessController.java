package com.seaboxdata.hlbejk.api.controller;

import java.util.Map;
import com.seaboxdata.hlbejk.api.FeignClientConfig;
import com.seaboxdata.hlbejk.api.vo.DeptAccessVO;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import com.seaboxdata.commons.core.util.api.PageUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 部门资源调用统计次数
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-04 10:33:33
 */
@Api(tags = {"部门资源调用统计次数"})
@FeignClient(contextId = "hlbejkdeptaccess",
        name = FeignClientConfig.NAME, url = FeignClientConfig.URL, configuration = FeignClientsConfiguration.class)
public interface IDeptAccessController {

    /**
     * 列表
     */
    @ApiOperation(value = "列表")
    @GetMapping("/hlbejk/deptaccess/list")
    PageUtils list(@RequestParam Map<String, Object> params);


    /**
     * 详细信息
     */
    @ApiOperation(value = "详细信息")
    @GetMapping("/hlbejk/deptaccess/info/{id}")
    DeptAccessVO info(@PathVariable("id") String id);

    /**
     * 保存
     */
    @ApiOperation(value = "保存")
    @PostMapping("/hlbejk/deptaccess/save")
    Boolean save(@RequestBody DeptAccessVO deptAccessVO);

    /**
     * 修改
     */
    @ApiOperation(value = "修改")
    @PostMapping("/hlbejk/deptaccess/update")
    Boolean update(@RequestBody DeptAccessVO deptAccessVO);

    /**
     * 删除
     */
    @ApiOperation(value = "删除")
    @DeleteMapping("/hlbejk/deptaccess/delete")
    Boolean delete(@RequestBody String[] ids);

}
