package com.seaboxdata.hlbejk.api.controller;

import java.util.Map;
import com.seaboxdata.hlbejk.api.FeignClientConfig;
import com.seaboxdata.hlbejk.api.vo.ModelapplyinfoVO;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import com.seaboxdata.commons.core.util.api.PageUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 模型申请表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
@Api(tags = {"模型申请表"})
@FeignClient(contextId = "hlbejkmodelapplyinfo",
        name = FeignClientConfig.NAME, url = FeignClientConfig.URL, configuration = FeignClientsConfiguration.class)
public interface IModelapplyinfoController {

    /**
     * 列表
     */
    @ApiOperation(value = "列表")
    @GetMapping("/hlbejk/modelapplyinfo/list")
    PageUtils list(@RequestParam Map<String, Object> params);


    /**
     * 详细信息
     */
    @ApiOperation(value = "详细信息")
    @GetMapping("/hlbejk/modelapplyinfo/info/{id}")
    ModelapplyinfoVO info(@PathVariable("id") String id);

    /**
     * 保存
     */
    @ApiOperation(value = "保存")
    @PostMapping("/hlbejk/modelapplyinfo/save")
    Boolean save(@RequestBody ModelapplyinfoVO modelapplyinfoVO);

    /**
     * 修改
     */
    @ApiOperation(value = "修改")
    @PostMapping("/hlbejk/modelapplyinfo/update")
    Boolean update(@RequestBody ModelapplyinfoVO modelapplyinfoVO);

    /**
     * 删除
     */
    @ApiOperation(value = "删除")
    @DeleteMapping("/hlbejk/modelapplyinfo/delete")
    Boolean delete(@RequestBody String[] ids);

}
