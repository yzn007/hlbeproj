package com.seaboxdata.hlbejk.service.modules.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.seaboxdata.hlbejk.service.modules.entity.OperationLog;

/**
 * 操作日志
 * 
 * @author 管理员
 *
 */
@Repository
@Mapper
public interface OperationLogDao extends BaseMapper<OperationLog> {

	IPage<OperationLog> queryPage(IPage<OperationLog> page, @Param("operUserName") String operUserName,
			@Param("typeOrModul") String typeOrModul, @Param("startDate") String startDate,
			@Param("endDate") String endDate);

}
