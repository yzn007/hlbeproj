package com.seaboxdata.hlbejk.api.controller;

import java.util.Map;
import com.seaboxdata.hlbejk.api.FeignClientConfig;
import com.seaboxdata.hlbejk.api.vo.ResourcesApplyVO;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import com.seaboxdata.commons.core.util.api.PageUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 资源目录用户申请使用表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-10-25 15:00:44
 */
@Api(tags = {"资源目录用户申请使用表"})
@FeignClient(contextId = "hlbejkresourcesapply",
        name = FeignClientConfig.NAME, url = FeignClientConfig.URL, configuration = FeignClientsConfiguration.class)
public interface IResourcesApplyController {

    /**
     * 列表
     */
    @ApiOperation(value = "列表")
    @GetMapping("/hlbejk/resourcesapply/list")
    PageUtils list(@RequestParam Map<String, Object> params);


    /**
     * 详细信息
     */
    @ApiOperation(value = "详细信息")
    @GetMapping("/hlbejk/resourcesapply/info/{id}")
    ResourcesApplyVO info(@PathVariable("id") Long id);

    /**
     * 保存
     */
    @ApiOperation(value = "保存")
    @PostMapping("/hlbejk/resourcesapply/save")
    Boolean save(@RequestBody ResourcesApplyVO resourcesApplyVO);

    /**
     * 修改
     */
    @ApiOperation(value = "修改")
    @PostMapping("/hlbejk/resourcesapply/update")
    Boolean update(@RequestBody ResourcesApplyVO resourcesApplyVO);

    /**
     * 删除
     */
    @ApiOperation(value = "删除")
    @DeleteMapping("/hlbejk/resourcesapply/delete")
    Boolean delete(@RequestBody Long[] ids);

}
