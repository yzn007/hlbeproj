package com.seaboxdata.hlbejk.service.modules.dao;

import com.seaboxdata.hlbejk.service.modules.entity.SystemAccess;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 系统访问统计报表
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-04 10:33:33
 */
@Repository
@Mapper
public interface SystemAccessDao extends BaseMapper<SystemAccess> {
	
}
