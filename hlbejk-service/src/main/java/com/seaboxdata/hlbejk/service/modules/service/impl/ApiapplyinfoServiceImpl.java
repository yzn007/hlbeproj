package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.service.modules.dao.ApiapplyinfoDao;
import com.seaboxdata.hlbejk.service.modules.entity.Apiapplyinfo;
import com.seaboxdata.hlbejk.service.modules.service.ApiapplyinfoService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;


@Service("apiapplyinfoService")
public class ApiapplyinfoServiceImpl extends ServiceImpl<ApiapplyinfoDao, Apiapplyinfo> implements ApiapplyinfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Apiapplyinfo> page = this.page(
                new Query<Apiapplyinfo>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public Apiapplyinfo queryById(String id) {
        Apiapplyinfo apiapplyinfo = this.getById(id);
        return apiapplyinfo;
    }

    @Override
    public Boolean insert(Apiapplyinfo apiapplyinfo) {
        this.save(apiapplyinfo);
        return true;
    }

    @Override
    public Boolean update(Apiapplyinfo apiapplyinfo) {
        this.updateById(apiapplyinfo);
        return true;
    }

}