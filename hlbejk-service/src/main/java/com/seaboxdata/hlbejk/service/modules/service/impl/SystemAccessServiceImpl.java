package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.service.modules.dao.SystemAccessDao;
import com.seaboxdata.hlbejk.service.modules.entity.Programinfo;
import com.seaboxdata.hlbejk.service.modules.service.SystemAccessService;
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
import com.seaboxdata.hlbejk.service.modules.entity.SystemAccess;


@Service("systemAccessService")
public class SystemAccessServiceImpl extends ServiceImpl<SystemAccessDao, SystemAccess> implements SystemAccessService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
        String strNow = sp.format(new Date());
        QueryWrapper queryWrapper = new QueryWrapper();
        if(null!=params && null!=params.get("today")&&!StringUtils.isEmpty(params.get("today").toString())){

            if(params.get("today").toString().indexOf("-")<0)
                queryWrapper.between("update_time",strNow+" 00:00:00",strNow+" 23:59:59");
            else
                queryWrapper.between("update_time",params.get("today").toString()+" 00:00:00",params.get("today")+" 23:59:59");
        }
        if(null!=params && null!=params.get("yesterday")&&!StringUtils.isEmpty(params.get("yesterday").toString())){
            if(params.get("yesterday").toString().indexOf("-")<0) {
                GregorianCalendar gc = new GregorianCalendar();
                gc.setTime(new Date());
                gc.add(Calendar.DATE,-1);
                queryWrapper.between("update_time", sp.format(gc.getTime()) + " 00:00:00", sp.format(gc.getTime()) + " 23:59:59");
            }
            else
                queryWrapper.between("update_time",params.get("yesterday").toString()+" 00:00:00",params.get("yesterday")+" 23:59:59");
        }

        if(null!=params && null!=params.get("lastsevendays")&&!StringUtils.isEmpty(params.get("lastsevendays").toString())){
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(new Date());
            gc.add(Calendar.DATE,-7);
            queryWrapper.between("update_time",sp.format(gc.getTime()) +" 00:00:00",strNow +" 23:59:59");
        }
        if(null!=params && null!=params.get("beforemonth")&&!StringUtils.isEmpty(params.get("beforemonth").toString())){
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(new Date());
            gc.add(Calendar.DATE,-30);
            queryWrapper.between("update_time",sp.format(gc.getTime()) +" 00:00:00",strNow +" 23:59:59");
        }
        if(null!=params && null!=params.get("startdate")&&!StringUtils.isEmpty(params.get("startdate").toString())){
            if(null!=params && null!=params.get("enddate")&&!StringUtils.isEmpty(params.get("enddate").toString())){
                queryWrapper.between("update_time",params.get("startdate") +" 00:00:00",params.get("enddate") +" 23:59:59");
            }
        }
        IPage<SystemAccess> page = this.page(
                new Query<SystemAccess>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }

    @Override
    public SystemAccess queryById(String id) {
        SystemAccess systemAccess = this.getById(id);
        return systemAccess;
    }

    @Override
    public Boolean insert(SystemAccess systemAccess) {
        this.save(systemAccess);
        return true;
    }

    @Override
    public Boolean update(SystemAccess systemAccess) {
        this.updateById(systemAccess);
        return true;
    }

}