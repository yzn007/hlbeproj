package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.api.vo.DaymonitorVO;
import com.seaboxdata.hlbejk.api.vo.UsermonitorVO;
import com.seaboxdata.hlbejk.service.modules.dao.ModelapplyinfoDao;
import com.seaboxdata.hlbejk.service.modules.entity.Daymonitor;
import com.seaboxdata.hlbejk.service.modules.entity.Modelapplyinfo;
import com.seaboxdata.hlbejk.service.modules.entity.Usermonitor;
import com.seaboxdata.hlbejk.service.modules.service.DaymonitorService;
import com.seaboxdata.hlbejk.service.modules.service.ModelapplyinfoService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import com.seaboxdata.hlbejk.service.modules.service.UsermonitorService;
import org.apache.tomcat.util.collections.CaseInsensitiveKeyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;


@Service("modelapplyinfoService")
public class ModelapplyinfoServiceImpl extends ServiceImpl<ModelapplyinfoDao, Modelapplyinfo> implements ModelapplyinfoService {

    @Autowired
    UsermonitorService usermonitorService;
    @Autowired
    DaymonitorService daymonitorService;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Modelapplyinfo> page = this.page(
                new Query<Modelapplyinfo>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public Modelapplyinfo queryById(String id) {
        Modelapplyinfo modelapplyinfo = this.getById(id);
        return modelapplyinfo;
    }

    @Override
    public Boolean insert(Modelapplyinfo modelapplyinfo) {
        //取得用户监控表主键
        Map map = new CaseInsensitiveKeyMap();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        map.put("day",sdf.format(modelapplyinfo.getApplydate()));
        map.put("userId",modelapplyinfo.getUserId());
        //uuid主键
        modelapplyinfo.setId(UUID.randomUUID().toString());
        List list = usermonitorService.queryByDateAndUser(map);
        if(list.size()>0){
            modelapplyinfo.setMonitorid(((UsermonitorVO)list.get(0)).getId());
        }else{
            Usermonitor usermonitor = new Usermonitor();
            usermonitor.setApplydate(modelapplyinfo.getApplydate());
            String key = UUID.randomUUID().toString();
            usermonitor.setId(key);
            usermonitor.setUserid(modelapplyinfo.getUserId());
            if(usermonitorService.insert(usermonitor))
                modelapplyinfo.setMonitorid(key);
        }
        //监控日表更新
        DaymonitorVO daymonitorVO = daymonitorService.queryByMonitorId(modelapplyinfo.getMonitorid());
        Daymonitor daymonitor = new Daymonitor();
        if(null != daymonitorVO){
            daymonitorVO.setApplynum(daymonitorVO.getApplynum()+1);
            BeanUtils.copyProperties(daymonitorVO,daymonitor);
            daymonitorService.update(daymonitor);
        }else{
            daymonitorVO = new DaymonitorVO();
            daymonitorVO.setId(UUID.randomUUID().toString());
            daymonitorVO.setApplynum(1);
            daymonitorVO.setDate(modelapplyinfo.getApplydate());
            daymonitorVO.setMonitorid(modelapplyinfo.getMonitorid());
            BeanUtils.copyProperties(daymonitorVO,daymonitor);
            daymonitorService.save(daymonitor);
        }

        //设置用户id为空否则数据库报错
//        modelapplyinfo.setUserId(null);
        this.save(modelapplyinfo);
        return true;
    }

    @Override
    public Boolean update(Modelapplyinfo modelapplyinfo) {
        this.updateById(modelapplyinfo);
        return true;
    }

}