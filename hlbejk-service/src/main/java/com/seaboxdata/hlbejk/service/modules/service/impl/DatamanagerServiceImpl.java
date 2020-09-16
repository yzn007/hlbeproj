package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.service.modules.dao.DatamanagerDao;
import com.seaboxdata.hlbejk.service.modules.entity.Datamanager;
import com.seaboxdata.hlbejk.service.modules.service.DatamanagerService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;


@Service("datamanagerService")
public class DatamanagerServiceImpl extends ServiceImpl<DatamanagerDao, Datamanager> implements DatamanagerService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Datamanager> page = this.page(
                new Query<Datamanager>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public Datamanager queryById(String id) {
        Datamanager datamanager = this.getById(id);
        return datamanager;
    }

    @Override
    public Boolean insert(Datamanager datamanager) {
        this.save(datamanager);
        return true;
    }

    @Override
    public Boolean update(Datamanager datamanager) {
        this.updateById(datamanager);
        return true;
    }

}