package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.hlbejk.service.modules.entity.ResourceAccessReport;
import com.seaboxdata.commons.core.util.api.PageUtils;

import java.util.List;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.ResourceAccessReportVO;

/**
 * 资源访问统计表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-06 15:45:22
 */
public interface ResourceAccessReportService extends IService<ResourceAccessReport> {

    PageUtils queryPage(Map<String, Object> params);

    ResourceAccessReport queryById(Long id);

    Boolean insert(ResourceAccessReport resourceAccessReport);

    Boolean update(ResourceAccessReport resourceAccessReport);

    List<ResourceAccessReportVO> queryResourceAccessReport(Map<String, Object> param);

    Long queryResourceTotal(Map<String,Object>param);

}

