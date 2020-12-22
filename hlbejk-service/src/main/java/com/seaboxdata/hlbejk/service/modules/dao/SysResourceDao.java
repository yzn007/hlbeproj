package com.seaboxdata.hlbejk.service.modules.dao;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seaboxdata.hlbejk.service.modules.entity.SysResource;

/**
 * 错误日志
 * 
 * @author 管理员
 *
 */
@Repository
@Mapper
public interface SysResourceDao extends BaseMapper<SysResource> {

	List<SysResource> queryResource(@Param("pcodes")Set<String> permissionCodes, @Param("systemCode")String systemCode);

}
