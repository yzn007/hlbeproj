package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.hlbejk.api.vo.AccessRateVO;
import com.seaboxdata.hlbejk.service.modules.entity.ResourcesCatalogueItem;

/**
 * 资源目录-资源信息项表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-12-23 14:12:08
 */
public interface ResourcesCatalogueItemService extends IService<ResourcesCatalogueItem> {
	AccessRateVO getResourceCatalogueNum();
}

