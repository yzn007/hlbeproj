package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.api.vo.DaymonitorVO;
import com.seaboxdata.hlbejk.api.vo.UsermonitorVO;
import com.seaboxdata.hlbejk.service.modules.dao.DataaccessinfoDao;
import com.seaboxdata.hlbejk.service.modules.entity.Dataaccessinfo;
import com.seaboxdata.hlbejk.service.modules.entity.Daymonitor;
import com.seaboxdata.hlbejk.service.modules.entity.Usermonitor;
import com.seaboxdata.hlbejk.service.modules.service.DataaccessinfoService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import com.seaboxdata.hlbejk.service.modules.service.DaymonitorService;
import com.seaboxdata.hlbejk.service.modules.service.UsermonitorService;
import org.apache.tomcat.util.collections.CaseInsensitiveKeyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;


@Service("dataaccessinfoService")
public class DataaccessinfoServiceImpl extends ServiceImpl<DataaccessinfoDao, Dataaccessinfo> implements DataaccessinfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Dataaccessinfo> page = this.page(
                new Query<Dataaccessinfo>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public Dataaccessinfo queryById(String id) {
        Dataaccessinfo dataaccessinfo = this.getById(id);
        return dataaccessinfo;
    }

    @Autowired
    UsermonitorService usermonitorService;
    @Autowired
    DaymonitorService daymonitorService;

    @Override
    public Boolean insert(Dataaccessinfo dataaccessinfo) {
        //取得用户监控表主键
        Map map = new CaseInsensitiveKeyMap();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        map.put("day",sdf.format(dataaccessinfo.getApplydate()));
        map.put("userId",dataaccessinfo.getUserId());
        //uuid主键
        dataaccessinfo.setId(UUID.randomUUID().toString());
        List list = usermonitorService.queryByDateAndUser(map);
        if(list.size()>0){
            dataaccessinfo.setMonitorid(((UsermonitorVO)list.get(0)).getId());
        }else{
            Usermonitor usermonitor = new Usermonitor();
            usermonitor.setApplydate(dataaccessinfo.getApplydate());
            String key = UUID.randomUUID().toString();
            usermonitor.setId(key);
            usermonitor.setUserid(dataaccessinfo.getUserId());
            if(usermonitorService.insert(usermonitor))
                dataaccessinfo.setMonitorid(key);
        }
        //监控日表更新
        DaymonitorVO daymonitorVO = daymonitorService.queryByMonitorId(dataaccessinfo.getMonitorid());
        Daymonitor daymonitor = new Daymonitor();
        if(null != daymonitorVO){
            daymonitorVO.setAccnum(daymonitorVO.getAccnum()+Integer.parseInt(dataaccessinfo.getApplynum()));
            if(null!=dataaccessinfo.getUsedatas())
                daymonitorVO.setAccdatatraffic(dataaccessinfo.getUsedatas().add(
                        null==daymonitorVO.getAccdatatraffic()?new BigDecimal(0):daymonitorVO.getAccdatatraffic()));
            BeanUtils.copyProperties(daymonitorVO,daymonitor);
            daymonitorService.update(daymonitor);
        }else{
            daymonitorVO = new DaymonitorVO();
            daymonitorVO.setId(UUID.randomUUID().toString());
            daymonitorVO.setAccnum(Integer.parseInt(dataaccessinfo.getApplynum()));
            daymonitorVO.setDate(dataaccessinfo.getApplydate());
            daymonitorVO.setMonitorid(dataaccessinfo.getMonitorid());
            daymonitorVO.setAccmodeldata(dataaccessinfo.getUsedatas());
            daymonitorVO.setAccdatatraffic(dataaccessinfo.getUsedatas());
            BeanUtils.copyProperties(daymonitorVO,daymonitor);
            daymonitorService.save(daymonitor);
        }
        this.save(dataaccessinfo);
        return true;
    }

    @Override
    public Boolean update(Dataaccessinfo dataaccessinfo) {
        this.updateById(dataaccessinfo);
        return true;
    }

}