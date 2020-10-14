package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.api.vo.DaymonitorVO;
import com.seaboxdata.hlbejk.api.vo.UsermonitorVO;
import com.seaboxdata.hlbejk.service.modules.dao.DataapplyinfoDao;
import com.seaboxdata.hlbejk.service.modules.entity.Dataapplyinfo;
import com.seaboxdata.hlbejk.service.modules.entity.Daymonitor;
import com.seaboxdata.hlbejk.service.modules.entity.Usermonitor;
import com.seaboxdata.hlbejk.service.modules.service.DataapplyinfoService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import com.seaboxdata.hlbejk.service.modules.service.DaymonitorService;
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

@Service("dataapplyinfoService")
public class DataapplyinfoServiceImpl extends ServiceImpl<DataapplyinfoDao, Dataapplyinfo> implements DataapplyinfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        QueryWrapper queryWrapper = new QueryWrapper<>();
        if(null != params.get("key") && !"".equals(params.get("key"))){
            queryWrapper.eq("id", params.get("key"));
       }
        IPage<Dataapplyinfo> page = this.page(
                new Query<Dataapplyinfo>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }

    @Override
    public Dataapplyinfo queryById(String id) {
        Dataapplyinfo dataapplyinfo = this.getById(id);
        return dataapplyinfo;
    }
    
    @Autowired
    DaymonitorService daymonitorService;
    @Autowired
    UsermonitorService usermonitorService;

    @Override
    public Boolean insert(Dataapplyinfo dataapplyinfo) {
        //取得用户监控表主键
        Map map = new CaseInsensitiveKeyMap();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        map.put("day",sdf.format(dataapplyinfo.getApplydate()));
        map.put("userId",dataapplyinfo.getUserId());
        //uuid主键
        dataapplyinfo.setId(UUID.randomUUID().toString());
        List list = usermonitorService.queryByDateAndUser(map);
        if(list.size()>0){
            dataapplyinfo.setMonitorid(((UsermonitorVO)list.get(0)).getId());
        }else{
            Usermonitor usermonitor = new Usermonitor();
            usermonitor.setApplydate(dataapplyinfo.getApplydate());
            String key = UUID.randomUUID().toString();
            usermonitor.setId(key);
            usermonitor.setUserid(dataapplyinfo.getUserId());
            if(usermonitorService.insert(usermonitor))
                dataapplyinfo.setMonitorid(key);
        }
        //监控日表更新
        DaymonitorVO daymonitorVO = daymonitorService.queryByMonitorId(dataapplyinfo.getMonitorid());
        Daymonitor daymonitor = new Daymonitor();
        if(null != daymonitorVO){
            daymonitorVO.setApplynum(daymonitorVO.getApplynum()+1);
            BeanUtils.copyProperties(daymonitorVO,daymonitor);
            daymonitorService.update(daymonitor);
        }else{
            daymonitorVO = new DaymonitorVO();
            daymonitorVO.setId(UUID.randomUUID().toString());
            daymonitorVO.setApplynum(1);
            daymonitorVO.setDate(dataapplyinfo.getApplydate());
            daymonitorVO.setMonitorid(dataapplyinfo.getMonitorid());
            BeanUtils.copyProperties(daymonitorVO,daymonitor);
            daymonitorService.save(daymonitor);
        }
        this.save(dataapplyinfo);
        return true;
    }

    @Override
    public Boolean update(Dataapplyinfo dataapplyinfo) {
        this.updateById(dataapplyinfo);
        return true;
    }

}