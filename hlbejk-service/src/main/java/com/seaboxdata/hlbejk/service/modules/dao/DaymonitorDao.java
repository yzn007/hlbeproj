package com.seaboxdata.hlbejk.service.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seaboxdata.hlbejk.api.vo.DaymonitorVO;
import com.seaboxdata.hlbejk.service.modules.entity.Daymonitor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 14:22:28
 */
@Repository
@Mapper
public interface DaymonitorDao extends BaseMapper<Daymonitor> {
    List<DaymonitorVO> list(@Param("param")Map param);
    List<DaymonitorVO> listByDate(@Param("param")Map param);
    List<DaymonitorVO> listDistictData(@Param("param")Map param);
}
