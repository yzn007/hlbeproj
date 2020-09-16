package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.service.modules.dao.ChargetypeDao;
import com.seaboxdata.hlbejk.service.modules.entity.Chargetype;
import com.seaboxdata.hlbejk.service.modules.service.ChargetypeService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;


@Service("chargetypeService")
public class ChargetypeServiceImpl extends ServiceImpl<ChargetypeDao, Chargetype> implements ChargetypeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Chargetype> page = this.page(
                new Query<Chargetype>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public Chargetype queryById(String id) {
        Chargetype chargetype = this.getById(id);
        return chargetype;
    }

    @Override
    public Boolean insert(Chargetype chargetype) {
        this.save(chargetype);
        return true;
    }

    @Override
    public Boolean update(Chargetype chargetype) {
        this.updateById(chargetype);
        return true;
    }

}