package com.seaboxdata.hlbejk.service.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seaboxdata.hlbejk.service.modules.entity.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 通知公告
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-16 10:21:25
 */
@Repository
@Mapper
public interface NoticeDao extends BaseMapper<Notice> {
	
}
