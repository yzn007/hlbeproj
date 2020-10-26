package com.seaboxdata.hlbejk.api.controller;

import java.util.List;
import java.util.Map;
import com.seaboxdata.hlbejk.api.FeignClientConfig;
import com.seaboxdata.hlbejk.api.vo.PrograminfoVO;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import com.seaboxdata.commons.core.util.api.PageUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 算法信息
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 17:35:51
 */
@Api(tags = {"算法信息"})
@FeignClient(contextId = "hlbejkprograminfo",
        name = FeignClientConfig.NAME, url = FeignClientConfig.URL, configuration = FeignClientsConfiguration.class)
public interface IPrograminfoController {

    /**
     * 列表
     */
    @ApiOperation(value = "列表")
    @GetMapping("/hlbejk/programinfo/list")
    PageUtils list(@RequestParam Map<String, Object> params);

    @ApiOperation(value = "算法下拉列表")
    @GetMapping("/hlbejk/programinfo/selectList")
    List<PrograminfoVO> selectList();


    /**
     * 详细信息
     */
    @ApiOperation(value = "详细信息")
    @GetMapping("/hlbejk/programinfo/info/{id}")
    PrograminfoVO info(@PathVariable("id") String id);

    /**
     * 保存
     */
    @ApiOperation(value = "保存")
    @PostMapping("/hlbejk/programinfo/save")
    Boolean save(@RequestBody PrograminfoVO programinfoVO);

    /**
     * 修改
     */
    @ApiOperation(value = "修改")
    @PostMapping("/hlbejk/programinfo/update")
    Boolean update(@RequestBody PrograminfoVO programinfoVO);

    /**
     * 删除
     */
    @ApiOperation(value = "删除")
    @DeleteMapping("/hlbejk/programinfo/delete")
    Boolean delete(@RequestBody String[] ids);

    /**
     * 算法名称接口
     * @return
     */
    @ApiOperation(value = "算法名称列表")
    @PostMapping("/hlbejk/programinfo/programnamelist")
    List<PrograminfoVO> programNmList();

    /**
     * 算法接口信息
     * @return
     */
    @ApiOperation(value = "算法信息")
    @PostMapping("/hlbejk/programinfo/programdetail")
    PrograminfoVO programDetail(@RequestParam Map<String, Object> param);

}
