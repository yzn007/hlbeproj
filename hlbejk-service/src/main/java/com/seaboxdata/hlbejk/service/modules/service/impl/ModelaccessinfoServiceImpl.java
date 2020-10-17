package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.api.vo.DaymonitorVO;
import com.seaboxdata.hlbejk.api.vo.UsermonitorVO;
import com.seaboxdata.hlbejk.service.modules.dao.ModelaccessinfoDao;
import com.seaboxdata.hlbejk.service.modules.entity.Daymonitor;
import com.seaboxdata.hlbejk.service.modules.entity.Modelaccessinfo;
import com.seaboxdata.hlbejk.service.modules.entity.Usermonitor;
import com.seaboxdata.hlbejk.service.modules.service.DaymonitorService;
import com.seaboxdata.hlbejk.service.modules.service.ModelaccessinfoService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import com.seaboxdata.hlbejk.service.modules.service.UsermonitorService;
import org.apache.tomcat.util.collections.CaseInsensitiveKeyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;


@Service("modelaccessinfoService")
public class ModelaccessinfoServiceImpl extends ServiceImpl<ModelaccessinfoDao, Modelaccessinfo> implements ModelaccessinfoService {

    @Autowired
    UsermonitorService usermonitorService;
    @Autowired
    DaymonitorService daymonitorService;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Modelaccessinfo> page = this.page(
                new Query<Modelaccessinfo>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public Modelaccessinfo queryById(String id) {
        Modelaccessinfo modelaccessinfo = this.getById(id);
        return modelaccessinfo;
    }

    @Override
    public Boolean insert(Modelaccessinfo modelaccessinfo) {
        //取得用户监控表主键
        Map map = new CaseInsensitiveKeyMap();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        map.put("day",sdf.format(modelaccessinfo.getApplydate()));
        map.put("userId",modelaccessinfo.getUserId());
        //uuid主键
        modelaccessinfo.setId(UUID.randomUUID().toString());
        List list = usermonitorService.queryByDateAndUser(map);
        if(list.size()>0){
            modelaccessinfo.setMonitorid(((UsermonitorVO)list.get(0)).getId());
        }else{
            Usermonitor usermonitor = new Usermonitor();
            usermonitor.setApplydate(modelaccessinfo.getApplydate());
            String key = UUID.randomUUID().toString();
            usermonitor.setId(key);
            usermonitor.setUserid(modelaccessinfo.getUserId());
            if(usermonitorService.insert(usermonitor))
                modelaccessinfo.setMonitorid(key);
        }
        //监控日表更新
        DaymonitorVO daymonitorVO = daymonitorService.queryByMonitorId(modelaccessinfo.getMonitorid());
        Daymonitor daymonitor = new Daymonitor();
        if(null != daymonitorVO){
            daymonitorVO.setAccnum(daymonitorVO.getAccnum()+Integer.parseInt(modelaccessinfo.getApplynum()));
            if(null!=modelaccessinfo.getUsedatas())
                daymonitorVO.setAccmodeldata(modelaccessinfo.getUsedatas().add
                        (null==daymonitorVO.getAccmodeldata()?new BigDecimal(0):daymonitorVO.getAccmodeldata()));
            BeanUtils.copyProperties(daymonitorVO,daymonitor);
            daymonitorService.update(daymonitor);
        }else{
            daymonitorVO = new DaymonitorVO();
            daymonitorVO.setId(UUID.randomUUID().toString());
            daymonitorVO.setAccnum(Integer.parseInt(modelaccessinfo.getApplynum()));
            daymonitorVO.setDate(modelaccessinfo.getApplydate());
            daymonitorVO.setMonitorid(modelaccessinfo.getMonitorid());
            daymonitorVO.setAccmodeldata(modelaccessinfo.getUsedatas());
            BeanUtils.copyProperties(daymonitorVO,daymonitor);
            daymonitorService.save(daymonitor);
        }

        this.save(modelaccessinfo);
        return true;
    }

    @Override
    public Boolean update(Modelaccessinfo modelaccessinfo) {
        this.updateById(modelaccessinfo);
        return true;
    }



}