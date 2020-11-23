package com.seaboxdata.hlbejk.service.modules.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.seaboxdata.hlbejk.service.modules.entity.ResourceAccessReport;
import com.seaboxdata.hlbejk.service.modules.entity.ResourceCallCount;

/**
 * 
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-20 13:10:58
 */
@Repository
@Mapper
public interface ResourceAnalysisReportDao extends BaseMapper<ResourceCallCount> {
	IPage<ResourceAccessReport> queryPage(IPage<ResourceCallCount> page, @Param("startDate") String startDate,
			@Param("endDate") String endDate, @Param("dateEnum") String dateEnum);
}
