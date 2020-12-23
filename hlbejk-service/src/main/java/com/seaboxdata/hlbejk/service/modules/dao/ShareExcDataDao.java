package com.seaboxdata.hlbejk.service.modules.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seaboxdata.hlbejk.service.modules.entity.ShareExcData;

/**
 * 数据管理
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 17:35:51
 */
@Repository
@Mapper
public interface ShareExcDataDao extends BaseMapper<ShareExcData> {
	
}
