package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.service.modules.dao.ApiaccessinfoDao;
import com.seaboxdata.hlbejk.service.modules.entity.Apiaccessinfo;
import com.seaboxdata.hlbejk.service.modules.service.ApiaccessinfoService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;


@Service("apiaccessinfoService")
public class ApiaccessinfoServiceImpl extends ServiceImpl<ApiaccessinfoDao, Apiaccessinfo> implements ApiaccessinfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Apiaccessinfo> page = this.page(
                new Query<Apiaccessinfo>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public Apiaccessinfo queryById(String id) {
        Apiaccessinfo apiaccessinfo = this.getById(id);
        return apiaccessinfo;
    }

    @Override
    public Boolean insert(Apiaccessinfo apiaccessinfo) {
        this.save(apiaccessinfo);
        return true;
    }

    @Override
    public Boolean update(Apiaccessinfo apiaccessinfo) {
        this.updateById(apiaccessinfo);
        return true;
    }

}