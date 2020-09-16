package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.service.modules.dao.ChargedetailDao;
import com.seaboxdata.hlbejk.service.modules.entity.Chargedetail;
import com.seaboxdata.hlbejk.service.modules.service.ChargedetailService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;


@Service("chargedetailService")
public class ChargedetailServiceImpl extends ServiceImpl<ChargedetailDao, Chargedetail> implements ChargedetailService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Chargedetail> page = this.page(
                new Query<Chargedetail>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public Chargedetail queryById(String id) {
        Chargedetail chargedetail = this.getById(id);
        return chargedetail;
    }

    @Override
    public Boolean insert(Chargedetail chargedetail) {
        this.save(chargedetail);
        return true;
    }

    @Override
    public Boolean update(Chargedetail chargedetail) {
        this.updateById(chargedetail);
        return true;
    }

}