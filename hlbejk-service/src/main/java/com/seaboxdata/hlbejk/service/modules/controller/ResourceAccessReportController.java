package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.IResourceAccessReportController;
import com.seaboxdata.hlbejk.api.vo.ResourceAccessReportVO;
import com.seaboxdata.hlbejk.service.modules.entity.ResourceAccessReport;
import com.seaboxdata.hlbejk.service.modules.service.ResourceAccessReportService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 资源访问统计表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-06 15:45:22
 */
@RestController
public class ResourceAccessReportController implements IResourceAccessReportController{

    @Autowired
    private ResourceAccessReportService resourceAccessReportService;

    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = resourceAccessReportService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @Override
    public ResourceAccessReportVO info(@PathVariable("id") Long id){
        ResourceAccessReport resourceAccessReport = resourceAccessReportService.queryById(id);
        ResourceAccessReportVO resourceAccessReportVO = new ResourceAccessReportVO();
        BeanUtils.copyProperties(resourceAccessReport, resourceAccessReportVO);
        return resourceAccessReportVO;
    }

    /**
     * 保存
     */
    @Override
    public Boolean save(@RequestBody ResourceAccessReportVO resourceAccessReportVO){
        ResourceAccessReport resourceAccessReport = new ResourceAccessReport();
        BeanUtils.copyProperties(resourceAccessReportVO, resourceAccessReport);
        return resourceAccessReportService.insert(resourceAccessReport);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody ResourceAccessReportVO resourceAccessReportVO){
        ResourceAccessReport resourceAccessReport = new ResourceAccessReport();
        BeanUtils.copyProperties(resourceAccessReportVO, resourceAccessReport);
        return resourceAccessReportService.update(resourceAccessReport);
    }

    /**
     * 删除
     */
    @Override
    public Boolean delete(@RequestBody Long[] ids){
        return resourceAccessReportService.removeByIds(Arrays.asList(ids));

    }

}
