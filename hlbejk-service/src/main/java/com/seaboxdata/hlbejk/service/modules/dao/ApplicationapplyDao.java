package com.seaboxdata.hlbejk.service.modules.dao;

import com.seaboxdata.hlbejk.service.modules.entity.Applicationapply;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 应用申请表
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-10-12 15:03:27
 */
@Repository
@Mapper
public interface ApplicationapplyDao extends BaseMapper<Applicationapply> {
	
}
