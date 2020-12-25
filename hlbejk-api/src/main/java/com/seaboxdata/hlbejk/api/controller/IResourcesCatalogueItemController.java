package com.seaboxdata.hlbejk.api.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.GetMapping;

import com.seaboxdata.hlbejk.api.FeignClientConfig;
import com.seaboxdata.hlbejk.api.vo.AccessRateVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 资源目录-资源信息项表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-12-23 14:12:08
 */
@Api(tags = {"首页-仪表盘信息"})
@FeignClient(contextId = "resourcescatalogueitem",
        name = FeignClientConfig.NAME, url = FeignClientConfig.URL, configuration = FeignClientsConfiguration.class)
public interface IResourcesCatalogueItemController {
    /**
         * 接入率和接入合格率
     */
    @ApiOperation(value = "接入率和接入合格率")
    @GetMapping("/template/resourcescatalogueitem/getresourcecataloguenum")
    AccessRateVO getResourceCatalogueNum();

}
