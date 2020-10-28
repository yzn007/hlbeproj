package com.seaboxdata.hlbejk.service.modules.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.seaboxdata.hlbejk.service.modules.entity.ExceptionLog;

/**
 * 错误日志
 * 
 * @author 管理员
 *
 */
@Repository
@Mapper
public interface ExceptionLogDao extends BaseMapper<ExceptionLog> {

	IPage<ExceptionLog> queryPage(IPage<ExceptionLog> page, @Param("operUserName") String operUserName,
			@Param("startDate") String startDate, @Param("endDate") String endDate);

}
