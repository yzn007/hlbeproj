package com.seaboxdata.hlbejk.service.modules.dao;

import com.seaboxdata.hlbejk.api.vo.ResourceAccessReportVO;
import com.seaboxdata.hlbejk.service.modules.entity.ResourceAccessReport;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * 资源访问统计表
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-06 15:45:22
 */
@Repository
@Mapper
public interface ResourceAccessReportDao extends BaseMapper<ResourceAccessReport> {
    List<ResourceAccessReportVO> queryResourceAccessReport(@Param("param")Map param);
    Long queryResourceTotal(@Param("param") Map param);
	
}
