package com.seaboxdata.hlbejk.service.modules.dao;

import com.seaboxdata.hlbejk.service.modules.entity.SystemAccessReport;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 系统访问统计
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-06 15:36:58
 */
@Repository
@Mapper
public interface SystemAccessReportDao extends BaseMapper<SystemAccessReport> {
	
}
