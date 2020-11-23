package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.hlbejk.api.controller.IResourceAnalysisReportController;
import com.seaboxdata.hlbejk.service.modules.service.ResourceAnalysisReportService;


/**
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-20 13:10:58
 */
@RestController
public class ResourceAnalysisReportController implements IResourceAnalysisReportController{

    @Autowired
    private ResourceAnalysisReportService resourceAnalysisReportService;

    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = resourceAnalysisReportService.queryPage(params);
        return page;
    }


}
