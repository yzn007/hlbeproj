package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.hlbejk.service.modules.entity.SystemAccessReport;
import com.seaboxdata.commons.core.util.api.PageUtils;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.SystemAccessReportVO;

/**
 * 系统访问统计
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-06 15:36:58
 */
public interface SystemAccessReportService extends IService<SystemAccessReport> {

    PageUtils queryPage(Map<String, Object> params);

    SystemAccessReport queryById(Long id);

    Boolean insert(SystemAccessReport systemAccessReport);

    Boolean update(SystemAccessReport systemAccessReport);
}

