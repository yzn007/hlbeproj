package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.service.modules.dao.SystemAccessReportDao;
import com.seaboxdata.hlbejk.service.modules.entity.SystemAccess;
import com.seaboxdata.hlbejk.service.modules.service.SystemAccessReportService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;
import com.seaboxdata.hlbejk.service.modules.entity.SystemAccessReport;


@Service("systemAccessReportService")
@DS("corc")
public class SystemAccessReportServiceImpl extends ServiceImpl<SystemAccessReportDao, SystemAccessReport> implements SystemAccessReportService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
        String strNow = sp.format(new Date());
        QueryWrapper queryWrapper = new QueryWrapper();
        if(null!=params && null!=params.get("today")&&!StringUtils.isEmpty(params.get("today").toString())){

            if(params.get("today").toString().indexOf("-")<0)
                queryWrapper.between("DATE_FORMAT(log_date,'%Y-%m-%d %H:%i:%s')",strNow+" 00:00:00",strNow+" 23:59:59");
            else
                queryWrapper.between("DATE_FORMAT(log_date,'%Y-%m-%d %H:%i:%s')",params.get("today").toString()+" 00:00:00",params.get("today")+" 23:59:59");
        }
        if(null!=params && null!=params.get("yesterday")&&!StringUtils.isEmpty(params.get("yesterday").toString())){
            if(params.get("yesterday").toString().indexOf("-")<0) {
                GregorianCalendar gc = new GregorianCalendar();
                gc.setTime(new Date());
                gc.add(Calendar.DATE,-1);
                queryWrapper.between("DATE_FORMAT(log_date,'%Y-%m-%d %H:%i:%s')", sp.format(gc.getTime()) + " 00:00:00", sp.format(gc.getTime()) + " 23:59:59");
            }
            else
                queryWrapper.between("DATE_FORMAT(log_date,'%Y-%m-%d %H:%i:%s')",params.get("yesterday").toString()+" 00:00:00",params.get("yesterday")+" 23:59:59");
        }

        if(null!=params && null!=params.get("lastsevendays")&&!StringUtils.isEmpty(params.get("lastsevendays").toString())){
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(new Date());
            gc.add(Calendar.DATE,-7);
            queryWrapper.between("DATE_FORMAT(log_date,'%Y-%m-%d %H:%i:%s')",sp.format(gc.getTime()) +" 00:00:00",strNow +" 23:59:59");
        }
        if(null!=params && null!=params.get("beforemonth")&&!StringUtils.isEmpty(params.get("beforemonth").toString())){
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(new Date());
            gc.add(Calendar.DATE,-30);
            queryWrapper.between("DATE_FORMAT(log_date,'%Y-%m-%d %H:%i:%s')",sp.format(gc.getTime()) +" 00:00:00",strNow +" 23:59:59");
        }
        if(null!=params && null!=params.get("startdate")&&!StringUtils.isEmpty(params.get("startdate").toString())){
            if(null!=params && null!=params.get("enddate")&&!StringUtils.isEmpty(params.get("enddate").toString())){
                queryWrapper.between("DATE_FORMAT(log_date,'%Y-%m-%d %H:%i:%s')",params.get("startdate") +" 00:00:00",params.get("enddate") +" 23:59:59");
            }
        }
        IPage<SystemAccess> page = this.page(
                new Query<SystemAccessReport>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }

    @Override
    public SystemAccessReport queryById(Long id) {
        SystemAccessReport systemAccessReport = this.getById(id);
        return systemAccessReport;
    }

    @Override
    public Boolean insert(SystemAccessReport systemAccessReport) {
        this.save(systemAccessReport);
        return true;
    }

    @Override
    public Boolean update(SystemAccessReport systemAccessReport) {
        this.updateById(systemAccessReport);
        return true;
    }

}