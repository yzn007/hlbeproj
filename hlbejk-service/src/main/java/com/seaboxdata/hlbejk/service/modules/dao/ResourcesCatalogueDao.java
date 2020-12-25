package com.seaboxdata.hlbejk.service.modules.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seaboxdata.hlbejk.service.modules.entity.ResourcesCatalogue;

/**
 * 资源目录表
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-12-23 14:10:42
 */
@Repository
@Mapper
public interface ResourcesCatalogueDao extends BaseMapper<ResourcesCatalogue> {
	
}
