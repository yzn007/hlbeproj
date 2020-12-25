package com.seaboxdata.hlbejk.service.modules.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seaboxdata.hlbejk.service.modules.entity.ResourcesCatalogueItem;

/**
 * 资源目录-资源信息项表
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-12-23 14:12:08
 */
@Repository
@Mapper
public interface ResourcesCatalogueItemDao extends BaseMapper<ResourcesCatalogueItem> {
	
}
