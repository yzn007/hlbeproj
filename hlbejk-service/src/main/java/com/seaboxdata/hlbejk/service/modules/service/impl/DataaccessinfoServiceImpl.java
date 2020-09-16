package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.service.modules.dao.DataaccessinfoDao;
import com.seaboxdata.hlbejk.service.modules.entity.Dataaccessinfo;
import com.seaboxdata.hlbejk.service.modules.service.DataaccessinfoService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;


@Service("dataaccessinfoService")
public class DataaccessinfoServiceImpl extends ServiceImpl<DataaccessinfoDao, Dataaccessinfo> implements DataaccessinfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Dataaccessinfo> page = this.page(
                new Query<Dataaccessinfo>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public Dataaccessinfo queryById(String id) {
        Dataaccessinfo dataaccessinfo = this.getById(id);
        return dataaccessinfo;
    }

    @Override
    public Boolean insert(Dataaccessinfo dataaccessinfo) {
        this.save(dataaccessinfo);
        return true;
    }

    @Override
    public Boolean update(Dataaccessinfo dataaccessinfo) {
        this.updateById(dataaccessinfo);
        return true;
    }

}