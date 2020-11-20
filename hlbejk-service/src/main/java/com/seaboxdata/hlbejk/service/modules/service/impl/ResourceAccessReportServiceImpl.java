package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.api.vo.ResourceAccessReportVO;
import com.seaboxdata.hlbejk.service.modules.dao.ResourceAccessReportDao;
import com.seaboxdata.hlbejk.service.modules.service.ResourceAccessReportService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;
import com.seaboxdata.hlbejk.service.modules.entity.ResourceAccessReport;


@Service("resourceAccessReportService")
@DS("corc")
public class ResourceAccessReportServiceImpl extends ServiceImpl<ResourceAccessReportDao, ResourceAccessReport> implements ResourceAccessReportService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
        String strNow = sp.format(new Date());
        QueryWrapper queryWrapper = new QueryWrapper();
        Map map = new HashMap();
        IPage<ResourceAccessReport> page = new Page<>();
        if(null!=params && null!=params.get("today")&&!StringUtils.isEmpty(params.get("today").toString())){

            if(params.get("today").toString().indexOf("-")<0) {
//                queryWrapper.between("log_date",strNow+" 00:00:00",strNow+" 23:59:59");
                map.put("startdate", strNow + " 00:00:00");
                map.put("enddate",strNow+" 23:59:59");
            }
            else{
//                queryWrapper.between("log_date",params.get("today").toString()+" 00:00:00",params.get("today")+" 23:59:59");
                map.put("startdate", params.get("today").toString() + " 00:00:00");
                map.put("enddate",params.get("today").toString()+" 23:59:59");
            }
        }
        if(null!=params && null!=params.get("yesterday")&&!StringUtils.isEmpty(params.get("yesterday").toString())){
            if(params.get("yesterday").toString().indexOf("-")<0) {
                GregorianCalendar gc = new GregorianCalendar();
                gc.setTime(new Date());
                gc.add(Calendar.DATE,-1);
//                queryWrapper.between("log_date", sp.format(gc.getTime()) + " 00:00:00", sp.format(gc.getTime()) + " 23:59:59");
                map.put("startdate", sp.format(gc.getTime()) + " 00:00:00");
                map.put("enddate",sp.format(gc.getTime())+" 23:59:59");
            }
            else {
//                queryWrapper.between("log_date", params.get("yesterday").toString() + " 00:00:00", params.get("yesterday") + " 23:59:59");
                map.put("startdate", params.get("yesterday").toString() + " 00:00:00");
                map.put("enddate",params.get("yesterday").toString()+" 23:59:59");
            }
        }

        if(null!=params && null!=params.get("lastsevendays")&&!StringUtils.isEmpty(params.get("lastsevendays").toString())){
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(new Date());
            gc.add(Calendar.DATE,-7);
//            queryWrapper.between("log_date",sp.format(gc.getTime()) +" 00:00:00",strNow +" 23:59:59");
            map.put("startdate", sp.format(gc.getTime()) + " 00:00:00");
            map.put("enddate",strNow +" 23:59:59");
        }
        if(null!=params && null!=params.get("beforemonth")&&!StringUtils.isEmpty(params.get("beforemonth").toString())){
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(new Date());
            gc.add(Calendar.DATE,-30);
//            queryWrapper.between("log_date",sp.format(gc.getTime()) +" 00:00:00",strNow +" 23:59:59");
            map.put("startdate", sp.format(gc.getTime()) + " 00:00:00");
            map.put("enddate",strNow +" 23:59:59");
        }
        if(null!=params && null!=params.get("startdate")&&!StringUtils.isEmpty(params.get("startdate").toString())){
            if(null!=params && null!=params.get("enddate")&&!StringUtils.isEmpty(params.get("enddate").toString())){
//                queryWrapper.between("log_date",params.get("startdate") +" 00:00:00",params.get("enddate") +" 23:59:59");
                map.put("startdate", params.get("startdate")  + " 00:00:00");
                map.put("enddate",params.get("enddate")  +" 23:59:59");
            }
        }

        if(null!=params && null != params.get("limit") && !StringUtils.isEmpty(params.get("limit").toString())){
            int limit = Integer.parseInt(params.get("limit").toString());
//            params.put("limit",limit);
            map.put("limit",limit);
        }else {
//            params.put("limit", 10);
            map.put("limit",10);
        }
        if(null!=params && null != params.get("page") && !StringUtils.isEmpty(params.get("page").toString())){
            int offset = Integer.parseInt(params.get("page").toString()) -1<0?0:Integer.parseInt(params.get("page").toString()) -1;
//            params.put("offset",offset);
            map.put("offset",offset*Integer.parseInt(map.get("limit").toString()));
            page.setCurrent(Integer.parseInt(params.get("page").toString()));
        }else{
//            params.put("offset",0);
            map.put("offset",0);
            page.setCurrent(1);
        }

        List<ResourceAccessReportVO> listVo = queryResourceAccessReport(map);
        List<ResourceAccessReport> listReport = new ArrayList<>();
        for(ResourceAccessReportVO vo :listVo){
            ResourceAccessReport rr = new ResourceAccessReport();
            BeanUtils.copyProperties(vo,rr);
            listReport.add(rr);
        }
        page.setRecords(listReport);

        page.setSize(Integer.parseInt(map.get("limit").toString()));
        page.setTotal(this.baseMapper.queryResourceTotal(map));

        return new PageUtils(page);
    }

    @Override
    public Long queryResourceTotal(Map<String, Object> param) {
        return this.baseMapper.queryResourceTotal(param);
    }

    @Override
    public List<ResourceAccessReportVO> queryResourceAccessReport(Map<String, Object> param) {
        return this.baseMapper.queryResourceAccessReport(param);
    }

    @Override
    public ResourceAccessReport queryById(Long id) {
        ResourceAccessReport resourceAccessReport = this.getById(id);
        return resourceAccessReport;
    }

    @Override
    public Boolean insert(ResourceAccessReport resourceAccessReport) {
        this.save(resourceAccessReport);
        return true;
    }

    @Override
    public Boolean update(ResourceAccessReport resourceAccessReport) {
        this.updateById(resourceAccessReport);
        return true;
    }

}