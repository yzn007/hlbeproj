package com.seaboxdata.hlbejk.api.controller;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.hlbejk.api.FeignClientConfig;
import com.seaboxdata.hlbejk.api.vo.HlbrNewsTypeVO;
import com.seaboxdata.hlbejk.api.vo.HlbrNewsVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 查询机构构结接口
 * @author 管理员
 * @param <OauthOrganizationCommonVO>
 *
 */
@Api(tags = {"公告机构接口调用表"})
@FeignClient(contextId = "hlbejkNewsInfo",
        name = FeignClientConfig.NAME, url = FeignClientConfig.URL, configuration = FeignClientsConfiguration.class)
public interface IHlbrNewsController {

    /**
     * 机构树列表
     */
    @ApiOperation(value = "机构树列表")
    @GetMapping("/hlbejk/news/organization")
    List organizationList();

    /**
     * 机构树列表
     */
    @ApiOperation(value = "类型机构树列表")
    @GetMapping("/hlbejk/news/type")
    List<HlbrNewsTypeVO> typeList();

    /**
     * 列表
     */
    @ApiOperation(value = "列表")
    @GetMapping("/hlbejk/news/list")
    PageUtils list(@RequestParam Map<String, Object> params);

    /**
     * 详细信息
     */
    @ApiOperation(value = "详细信息")
    @GetMapping("/hlbejk/news/info/{id}")
    HlbrNewsVO info(@PathVariable("id") String id);

    /**
     * 保存
     */
    @ApiOperation(value = "保存")
    @PostMapping("/hlbejk/news/save")
    Boolean save(@RequestBody HlbrNewsVO hlbrNewsVO);

    /**
     * 修改
     */
    @ApiOperation(value = "修改")
    @PostMapping("/hlbejk/news/update")
    Boolean update(@RequestBody HlbrNewsVO hlbrNewsVO);

    /**
     * 删除
     */
    @ApiOperation(value = "删除")
    @DeleteMapping("/hlbejk/news/delete")
    Boolean delete(@RequestBody String[] ids);

}
