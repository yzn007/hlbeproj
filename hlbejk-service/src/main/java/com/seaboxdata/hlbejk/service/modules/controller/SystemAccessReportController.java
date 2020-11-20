package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.ISystemAccessReportController;
import com.seaboxdata.hlbejk.api.vo.SystemAccessReportVO;
import com.seaboxdata.hlbejk.service.modules.entity.SystemAccessReport;
import com.seaboxdata.hlbejk.service.modules.service.SystemAccessReportService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 系统访问统计
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-06 15:36:58
 */
@RestController
public class SystemAccessReportController implements ISystemAccessReportController{

    @Autowired
    private SystemAccessReportService systemAccessReportService;

    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = systemAccessReportService.queryPage(params);
        return page;
    }



    /**
     * 保存
     */
    @Override
    public Boolean save(@RequestBody SystemAccessReportVO systemAccessReportVO){
        SystemAccessReport systemAccessReport = new SystemAccessReport();
        BeanUtils.copyProperties(systemAccessReportVO, systemAccessReport);
        return systemAccessReportService.insert(systemAccessReport);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody SystemAccessReportVO systemAccessReportVO){
        SystemAccessReport systemAccessReport = new SystemAccessReport();
        BeanUtils.copyProperties(systemAccessReportVO, systemAccessReport);
        return systemAccessReportService.update(systemAccessReport);
    }


}
