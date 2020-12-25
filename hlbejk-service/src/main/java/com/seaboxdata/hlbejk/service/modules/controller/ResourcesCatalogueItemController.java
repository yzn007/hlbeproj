package com.seaboxdata.hlbejk.service.modules.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.seaboxdata.hlbejk.api.controller.IResourcesCatalogueItemController;
import com.seaboxdata.hlbejk.api.vo.AccessRateVO;
import com.seaboxdata.hlbejk.service.modules.service.ResourcesCatalogueItemService;


/**
 * 首页-仪表盘信息
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-12-23 14:12:08
 */
@RestController
public class ResourcesCatalogueItemController implements IResourcesCatalogueItemController{

    @Autowired
    private ResourcesCatalogueItemService resourcesCatalogueItemService;
	
	public AccessRateVO getResourceCatalogueNum() {
		return resourcesCatalogueItemService.getResourceCatalogueNum();
	}
   
}
