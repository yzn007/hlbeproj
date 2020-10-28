package com.seaboxdata.hlbejk.service.modules.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seaboxdata.hlbejk.service.modules.entity.Apiaccessinfo;

/**
 */
@Repository
@Mapper
public interface TestDao extends BaseMapper<Apiaccessinfo> {
	
	List<Map> listTest(@Param("param") Map param);

}
