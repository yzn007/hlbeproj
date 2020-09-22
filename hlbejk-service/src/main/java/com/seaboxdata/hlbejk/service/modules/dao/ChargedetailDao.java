package com.seaboxdata.hlbejk.service.modules.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seaboxdata.hlbejk.api.vo.ChargedetailVO;
import com.seaboxdata.hlbejk.api.vo.DaymonitorVO;
import com.seaboxdata.hlbejk.service.modules.entity.Chargedetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * 费用详细
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 18:18:06
 */
@Repository
@Mapper
public interface ChargedetailDao extends BaseMapper<Chargedetail> {
    List<ChargedetailVO> queryTotal(@Param("param")Map param);
}
