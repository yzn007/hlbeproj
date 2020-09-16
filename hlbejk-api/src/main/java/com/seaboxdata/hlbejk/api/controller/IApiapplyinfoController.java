package com.seaboxdata.hlbejk.api.controller;

import java.util.Map;
import com.seaboxdata.hlbejk.api.FeignClientConfig;
import com.seaboxdata.hlbejk.api.vo.ApiapplyinfoVO;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import com.seaboxdata.commons.core.util.api.PageUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 接口申请表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
@Api(tags = {"接口申请表"})
@FeignClient(contextId = "hlbejkapiapplyinfo",
        name = FeignClientConfig.NAME, url = FeignClientConfig.URL, configuration = FeignClientsConfiguration.class)
public interface IApiapplyinfoController {

    /**
     * 列表
     */
    @ApiOperation(value = "列表")
    @GetMapping("/hlbejk/apiapplyinfo/list")
    PageUtils list(@RequestParam Map<String, Object> params);


    /**
     * 详细信息
     */
    @ApiOperation(value = "详细信息")
    @GetMapping("/hlbejk/apiapplyinfo/info/{id}")
    ApiapplyinfoVO info(@PathVariable("id") String id);

    /**
     * 保存
     */
    @ApiOperation(value = "保存")
    @PostMapping("/hlbejk/apiapplyinfo/save")
    Boolean save(@RequestBody ApiapplyinfoVO apiapplyinfoVO);

    /**
     * 修改
     */
    @ApiOperation(value = "修改")
    @PostMapping("/hlbejk/apiapplyinfo/update")
    Boolean update(@RequestBody ApiapplyinfoVO apiapplyinfoVO);

    /**
     * 删除
     */
    @ApiOperation(value = "删除")
    @DeleteMapping("/hlbejk/apiapplyinfo/delete")
    Boolean delete(@RequestBody String[] ids);

}
