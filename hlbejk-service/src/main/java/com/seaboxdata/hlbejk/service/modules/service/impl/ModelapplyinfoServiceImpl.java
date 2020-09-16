package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.service.modules.dao.ModelapplyinfoDao;
import com.seaboxdata.hlbejk.service.modules.entity.Modelapplyinfo;
import com.seaboxdata.hlbejk.service.modules.service.ModelapplyinfoService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;


@Service("modelapplyinfoService")
public class ModelapplyinfoServiceImpl extends ServiceImpl<ModelapplyinfoDao, Modelapplyinfo> implements ModelapplyinfoService {

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
        this.save(modelapplyinfo);
        return true;
    }

    @Override
    public Boolean update(Modelapplyinfo modelapplyinfo) {
        this.updateById(modelapplyinfo);
        return true;
    }

}