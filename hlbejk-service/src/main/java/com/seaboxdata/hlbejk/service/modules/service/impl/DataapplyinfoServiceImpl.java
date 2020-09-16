package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.service.modules.dao.DataapplyinfoDao;
import com.seaboxdata.hlbejk.service.modules.entity.Dataapplyinfo;
import com.seaboxdata.hlbejk.service.modules.service.DataapplyinfoService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;

@Service("dataapplyinfoService")
public class DataapplyinfoServiceImpl extends ServiceImpl<DataapplyinfoDao, Dataapplyinfo> implements DataapplyinfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Dataapplyinfo> page = this.page(
                new Query<Dataapplyinfo>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public Dataapplyinfo queryById(String id) {
        Dataapplyinfo dataapplyinfo = this.getById(id);
        return dataapplyinfo;
    }

    @Override
    public Boolean insert(Dataapplyinfo dataapplyinfo) {
        this.save(dataapplyinfo);
        return true;
    }

    @Override
    public Boolean update(Dataapplyinfo dataapplyinfo) {
        this.updateById(dataapplyinfo);
        return true;
    }

}