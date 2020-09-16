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
import org.springframework.stereotype.Service;

import java.util.*;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;


@Service("daymonitorService")
public class DaymonitorServiceImpl extends ServiceImpl<DaymonitorDao, Daymonitor> implements DaymonitorService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Daymonitor> page = this.page(
                new Query<Daymonitor>().getPage(params),
                new QueryWrapper<>()
        );

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

        Map <String,Object> param = new CaseInsensitiveMap<>();
        param.put("day",day);

        List<DaymonitorVO> listVo = super.baseMapper.list(param);

//        Map<String, Object> params  = new HashMap<>();
//        IPage<Daymonitor> page = this.page(
//                new Query<Daymonitor>().getPage(params),
//                new QueryWrapper<>()
//        );
//        List<Daymonitor> listDays = new ArrayList<>();
//        for(DaymonitorVO vo:listVo){
//            listDays.add(Daymonitor.toEntity(vo));
//        }
//        page.setRecords(listDays);
        return listVo;
    }


}