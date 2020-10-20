package com.seaboxdata.hlbejk.api.controller;

import java.util.List;
import java.util.Map;
import com.seaboxdata.hlbejk.api.FeignClientConfig;
import com.seaboxdata.hlbejk.api.vo.ApplicationapplyVO;
import com.seaboxdata.hlbejk.api.vo.FilemanageVO;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import com.seaboxdata.commons.core.util.api.PageUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件管理表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-10-13 09:30:13
 */
@Api(tags = {"文件管理表"})
@FeignClient(contextId = "filemanage",
        name = FeignClientConfig.NAME, url = FeignClientConfig.URL, configuration = FeignClientsConfiguration.class)
public interface IFilemanageController {

    /**
     * 列表
     */
    @ApiOperation(value = "列表")
    @GetMapping("/hlbejk/filemanage/list")
    PageUtils list(@RequestParam Map<String, Object> params);

    @ApiOperation(value = "文件表")
    @GetMapping("/hlbejk/filemanage/filelist")
    List<FilemanageVO> getFileList(@RequestParam Map<String, Object> params);

    /**
     * 详细信息
     */
    @ApiOperation(value = "详细信息")
    @GetMapping("/hlbejk/filemanage/info/{id}")
    FilemanageVO info(@PathVariable("id") String id);

    /**
     * 保存
     */
    @ApiOperation(value = "保存")
    @PostMapping("/hlbejk/filemanage/save")
    Boolean save(@RequestBody FilemanageVO filemanageVO);

    /**
     * 修改
     */
    @ApiOperation(value = "修改")
    @PostMapping("/hlbejk/filemanage/update")
    Boolean update(@RequestBody FilemanageVO filemanageVO);

    /**
     * 删除
     */
    @ApiOperation(value = "删除")
    @DeleteMapping("/hlbejk/filemanage/delete")
    Boolean delete(@RequestBody String[] ids);

    @ApiOperation(value = "文件上传")
    @PostMapping(value = "/hlbejk/filemanage/upload", consumes = "multipart/*", headers = "content-type=multipart/form-data")
    public String upload(@ApiParam(value = "医院图片", required = true) MultipartFile file);
}
