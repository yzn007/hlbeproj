package com.seaboxdata.hlbejk.service.modules.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seaboxdata.hlbejk.api.vo.ApiOperateTypeVO;
import com.seaboxdata.hlbejk.service.modules.entity.ApiOperType;

/**
 * 
 * @author 管理员
 *
 */
@Repository
@Mapper
public interface ApiOperTypeDao extends BaseMapper<ApiOperType> {

	List<ApiOperateTypeVO> queryList(Map<String, Object> params);

}
