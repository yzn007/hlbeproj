package com.seaboxdata.hlbejk.service.modules.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.hlbejk.service.modules.entity.ResourceCallCount;

/**
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-20 13:10:58
 */
public interface ResourceAnalysisReportService extends IService<ResourceCallCount> {

    PageUtils queryPage(Map<String, Object> params);
}

