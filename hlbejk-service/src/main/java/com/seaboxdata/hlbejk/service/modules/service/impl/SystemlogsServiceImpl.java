package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.api.vo.DaymonitorVO;
import com.seaboxdata.hlbejk.api.vo.SystemlogsVO;
import com.seaboxdata.hlbejk.service.modules.dao.SystemlogsDao;
import com.seaboxdata.hlbejk.service.modules.entity.Daymonitor;
import com.seaboxdata.hlbejk.service.modules.entity.Systemlogs;
import com.seaboxdata.hlbejk.service.modules.service.SystemlogsService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;


@Service("systemlogsService")
public class SystemlogsServiceImpl extends ServiceImpl<SystemlogsDao, Systemlogs> implements SystemlogsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        QueryWrapper queryWrapper = new QueryWrapper();

        if(null!=params && null!=params.get("key")&&!StringUtils.isEmpty(params.get("key").toString())){
            queryWrapper.like("model",params.get("key"));
        }
        IPage<Systemlogs> page = this.page(
                new Query<Systemlogs>().getPage(params),
                queryWrapper
        );


        return new PageUtils(page);
    }

    @Override
    public Systemlogs queryById(String id) {
        Systemlogs systemlogs = this.getById(id);
        return systemlogs;
    }

    @Override
    public Boolean insert(Systemlogs systemlogs) {
        this.save(systemlogs);
        return true;
    }

    @Override
    public Boolean update(Systemlogs systemlogs) {
        this.updateById(systemlogs);
        return true;
    }

}