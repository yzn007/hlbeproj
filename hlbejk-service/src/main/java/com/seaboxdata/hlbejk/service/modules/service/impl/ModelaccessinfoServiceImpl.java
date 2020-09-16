package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.service.modules.dao.ModelaccessinfoDao;
import com.seaboxdata.hlbejk.service.modules.entity.Modelaccessinfo;
import com.seaboxdata.hlbejk.service.modules.service.ModelaccessinfoService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;


@Service("modelaccessinfoService")
public class ModelaccessinfoServiceImpl extends ServiceImpl<ModelaccessinfoDao, Modelaccessinfo> implements ModelaccessinfoService {

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
        this.save(modelaccessinfo);
        return true;
    }

    @Override
    public Boolean update(Modelaccessinfo modelaccessinfo) {
        this.updateById(modelaccessinfo);
        return true;
    }

}