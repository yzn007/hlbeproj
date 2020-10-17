package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.seaboxdata.hlbejk.api.vo.DaymonitorVO;
import com.seaboxdata.hlbejk.service.modules.entity.Daymonitor;

/**
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 14:22:28
 */
public interface DaymonitorService extends IService<Daymonitor> {

    PageUtils queryPage(Map<String, Object> params);

    Daymonitor queryById(String id);

    Boolean insert(Daymonitor daymonitor);

    Boolean update(Daymonitor daymonitor);

    List<DaymonitorVO> list(String day);

    List<DaymonitorVO> listByDate(String dayMonth);

    List<DaymonitorVO> listDistictData(String isOrder);

    DaymonitorVO queryByMonitorId(String monitorId);
}

