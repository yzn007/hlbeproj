package com.seaboxdata.hlbejk.service.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seaboxdata.hlbejk.api.vo.ResourcesApplyVO;
import com.seaboxdata.hlbejk.service.modules.entity.ResourcesApply;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 资源目录用户申请使用表
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-10-25 15:00:44
 */
@Repository
@Mapper
public interface ResourcesApplyDao extends BaseMapper<ResourcesApply> {
    List<ResourcesApplyVO> queryResource(@Param("param")Map param);
}
