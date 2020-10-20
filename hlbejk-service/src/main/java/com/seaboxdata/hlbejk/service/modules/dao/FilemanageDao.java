package com.seaboxdata.hlbejk.service.modules.dao;

import com.seaboxdata.hlbejk.service.modules.entity.Filemanage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 文件管理表
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-10-13 09:30:13
 */
@Repository
@Mapper
public interface FilemanageDao extends BaseMapper<Filemanage> {
	
}
