package com.seaboxdata.hlbejk.service.modules.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.seaboxdata.hlbejk.service.modules.entity.ResourceApplyListInfo;

/**
 * 资源目录用户申请使用表
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-17 14:37:23
 */
@Repository
@Mapper
public interface ResourceApplyInfoDao extends BaseMapper<ResourceApplyListInfo> {
	IPage<ResourceApplyListInfo> queryResource(IPage<ResourceApplyListInfo> page, @Param(value = "apply") Map<String, Object> params);
}
