package com.seaboxdata.hlbejk.service.modules.service.impl;

import cn.hutool.core.map.CaseInsensitiveMap;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.api.vo.DaymonitorVO;
import com.seaboxdata.hlbejk.service.modules.dao.DaymonitorDao;
import com.seaboxdata.hlbejk.service.modules.entity.Daymonitor;
import com.seaboxdata.hlbejk.service.modules.service.DaymonitorService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import jdk.nashorn.internal.objects.annotations.Where;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.util.Strings;
import org.apache.tomcat.util.collections.CaseInsensitiveKeyMap;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;


@Service("daymonitorService")
public class DaymonitorServiceImpl extends ServiceImpl<DaymonitorDao, Daymonitor> implements DaymonitorService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        QueryWrapper queryWrapper = new QueryWrapper();
        if (null != params && null != params.get("key") && !StringUtils.isEmpty(params.get("key").toString())) {
            queryWrapper.eq("id", params.get("key"));
        }
        IPage<Daymonitor> page = this.page(
                new Query<Daymonitor>().getPage(params),
                queryWrapper
        );

        if (null != params && null != params.get("key") && !StringUtils.isEmpty(params.get("key").toString())) {
            List<DaymonitorVO> listDayVo = list(params.get("key").toString());
            List<Daymonitor> listDay = new ArrayList<>();
            for (DaymonitorVO dv : listDayVo) {
                listDay.add(Daymonitor.toEntity(dv));
            }
            page.setRecords(listDay);
        }


        return new PageUtils(page);
    }

    @Override
    public Daymonitor queryById(String id) {
        Daymonitor daymonitor = this.getById(id);
        return daymonitor;
    }

//    @Override
//    public Daymonitor queryById(Long id) {
//        Daymonitor daymonitor = this.getById(id);
//        return daymonitor;
//    }

    @Override
    public Boolean insert(Daymonitor daymonitor) {
        this.save(daymonitor);
        return true;
    }

    @Override
    public Boolean update(Daymonitor daymonitor) {
        this.updateById(daymonitor);
        return true;
    }

    @Override
    public List<DaymonitorVO> list(String day) {

        Map<String, Object> param = new CaseInsensitiveMap<>();
        param.put("day", day);

        List<DaymonitorVO> listVo = super.baseMapper.list(param);
        DaymonitorVO daymonitorVO = new DaymonitorVO();
        daymonitorVO.setAccmodeldata(new BigDecimal(0));
        daymonitorVO.setAccapidata(new BigDecimal(0));
        daymonitorVO.setAccdatatraffic(new BigDecimal(0));

        for (DaymonitorVO dy : listVo) {
            if (null != dy.getAccmodeldata())
                daymonitorVO.setAccmodeldata(daymonitorVO.getAccmodeldata().add(dy.getAccmodeldata()));
            if (dy.getAccapidata() != null)
                daymonitorVO.setAccapidata(daymonitorVO.getAccapidata().add(dy.getAccapidata()));
            if (dy.getAccdatatraffic() != null)
                daymonitorVO.setAccdatatraffic(daymonitorVO.getAccdatatraffic().add(dy.getAccdatatraffic()));
            if (Strings.isEmpty(daymonitorVO.getDistrictcode()))
                daymonitorVO.setDistrictcode(dy.getDistrictcode());
            daymonitorVO.setApplynum(daymonitorVO.getApplynum() + dy.getApplynum());
            daymonitorVO.setAccnum(daymonitorVO.getAccnum() + dy.getAccnum());
            if (null == daymonitorVO.getDate())
                daymonitorVO.setDate(dy.getDate());
        }

        listVo.clear();
        listVo.add(daymonitorVO);
        return listVo;
    }

    @Override
    public List<DaymonitorVO> listByDate(String yearMonth) {
        Map<String, Object> param = new CaseInsensitiveMap<>();
        param.put("yearMonth", yearMonth);
        List<DaymonitorVO> listVo = super.baseMapper.listByDate(param);
        return listVo;
    }

    @Override
    public List<DaymonitorVO> listDistictData(String isOrder) {
        Map<String, Object> param = new CaseInsensitiveMap<>();
        param.put("isOrder", isOrder);
        List<DaymonitorVO> listVo = super.baseMapper.listDistictData(param);
        return listVo;
    }

    @Override
    public DaymonitorVO queryByMonitorId(String monitorId) {
        Map<String, Object> params = new CaseInsensitiveKeyMap<>();
        params.put("monitorId", monitorId);
        return super.baseMapper.queryByMonitorId(params);
    }
}