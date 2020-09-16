package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.service.modules.dao.ChargesetDao;
import com.seaboxdata.hlbejk.service.modules.entity.Chargeset;
import com.seaboxdata.hlbejk.service.modules.service.ChargesetService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;


@Service("chargesetService")
public class ChargesetServiceImpl extends ServiceImpl<ChargesetDao, Chargeset> implements ChargesetService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Chargeset> page = this.page(
                new Query<Chargeset>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public Chargeset queryById(String id) {
        Chargeset chargeset = this.getById(id);
        return chargeset;
    }

    @Override
    public Boolean insert(Chargeset chargeset) {
        this.save(chargeset);
        return true;
    }

    @Override
    public Boolean update(Chargeset chargeset) {
        this.updateById(chargeset);
        return true;
    }

}