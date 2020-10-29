package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.authuc.api.service.AuthUserInService;
import com.seaboxdata.hlbejk.service.modules.dao.PrograminfoDao;
import com.seaboxdata.hlbejk.service.modules.entity.Programinfo;
import com.seaboxdata.hlbejk.service.modules.service.PrograminfoService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Console;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;


@Service("programinfoService")
public class PrograminfoServiceImpl extends ServiceImpl<PrograminfoDao, Programinfo> implements PrograminfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        QueryWrapper queryWrapper = new QueryWrapper();
        if(null!=params && null!=params.get("key")&&!StringUtils.isEmpty(params.get("key").toString())){
            queryWrapper.like("programname",params.get("key"));
        }
        IPage<Programinfo> page = this.page(
                new Query<Programinfo>().getPage(params),
                queryWrapper
        );

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));

        List<Programinfo> list = page.getRecords();
        for(Programinfo p:list){
            try {
                p.setUpdatetime(sdf.parse(sdf.format(p.getUpdatetime())));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        try{
            System.out.println(authUserInService.getLoginUser().getName());
            System.out.println(authUserInService.getUserByParamsByTenantId(authUserInService.getLoginUser().getTenantId()).toString());
        }catch (Exception ex){
        }
        return new PageUtils(page);
    }

    @Override
    public Programinfo queryById(String id) {
        Programinfo programinfo = this.getById(id);
        return programinfo;
    }

    @Override
    public Boolean insert(Programinfo programinfo) {
        this.save(programinfo);
        return true;
    }

    @Override
    public Boolean update(Programinfo programinfo) {
        this.updateById(programinfo);
        return true;
    }
    @Autowired
    AuthUserInService authUserInService;

}