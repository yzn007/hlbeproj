package com.seaboxdata.hlbejk.service.modules.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seaboxdata.hlbejk.api.vo.HlbrNewsTypeVO;
import com.seaboxdata.hlbejk.service.modules.entity.HlbrNews;

/**
 * HLBR_NEWS【公告/新闻管理】
 * 
 * @author 管理员
 *
 */
@Repository
@Mapper
public interface HlbrNewsDao extends BaseMapper<HlbrNews> {

	List<HlbrNewsTypeVO> selectTypeList();
	
}
