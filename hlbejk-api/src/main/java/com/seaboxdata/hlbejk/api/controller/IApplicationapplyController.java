package com.seaboxdata.hlbejk.api.controller;

import java.util.List;
import java.util.Map;
import com.seaboxdata.hlbejk.api.FeignClientConfig;
import com.seaboxdata.hlbejk.api.vo.ApplicationapplyVO;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import com.seaboxdata.commons.core.util.api.PageUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 应用申请表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-10-12 15:03:27
 */
@Api(tags = {"应用申请表"})
@FeignClient(contextId = "applicationapply",
        name = FeignClientConfig.NAME, url = FeignClientConfig.URL, configuration = FeignClientsConfiguration.class)
public interface IApplicationapplyController {

    /**
     * 列表
     */
    @ApiOperation(value = "列表")
    @GetMapping("/hlbejk/applicationapply/list")
    PageUtils list(@RequestParam Map<String, Object> params);


    /**
     * 详细信息
     */
    @ApiOperation(value = "详细信息")
    @GetMapping("/hlbejk/applicationapply/info/{id}")
    ApplicationapplyVO info(@PathVariable("id") String id);

    /**
     * 保存
     */
    @ApiOperation(value = "保存")
    @PostMapping("/hlbejk/applicationapply/save")
    Boolean save(@RequestBody ApplicationapplyVO applicationapplyVO);

    /**
     * 修改
     */
    @ApiOperation(value = "修改")
    @PostMapping("/hlbejk/applicationapply/update")
    Boolean update(@RequestBody ApplicationapplyVO applicationapplyVO);

    /**
     * 删除
     */
    @ApiOperation(value = "删除")
    @DeleteMapping("/hlbejk/applicationapply/delete")
    Boolean delete(@RequestBody String[] ids);

}
