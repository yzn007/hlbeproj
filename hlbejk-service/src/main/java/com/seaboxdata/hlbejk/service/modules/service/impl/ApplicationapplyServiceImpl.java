package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.service.modules.dao.ApplicationapplyDao;
import com.seaboxdata.hlbejk.service.modules.service.ApplicationapplyService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import com.seaboxdata.hlbejk.service.utils.DateToolsUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;
import com.seaboxdata.hlbejk.service.modules.entity.Applicationapply;


@Service("applicationapplyService")
public class ApplicationapplyServiceImpl extends ServiceImpl<ApplicationapplyDao, Applicationapply> implements ApplicationapplyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        QueryWrapper queryWrapper = new QueryWrapper();
        if(null!=params && null!=params.get("applyState")&&!StringUtils.isEmpty(params.get("applyState").toString())){
            if("0".equals(params.get("applyState"))){
                queryWrapper = (QueryWrapper) queryWrapper.eq("applyState", "0");
                queryWrapper = (QueryWrapper) queryWrapper.or();
                queryWrapper = (QueryWrapper) queryWrapper.eq("applyState","1");
            }else{
                queryWrapper.eq("applyState",params.get("applyState"));
            }
            queryWrapper.orderByDesc("applyTime","updateTimes");
        }

        IPage<Applicationapply> page = this.page(
                new Query<Applicationapply>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }

    @Override
    public Applicationapply queryById(String id) {
        Applicationapply applicationapply = this.getById(id);
        return applicationapply;
    }

    @Override
    public Boolean insert(Applicationapply applicationapply) {
        this.save(applicationapply);
        return true;
    }

    @Override
    public Boolean update(Applicationapply applicationapply) {
        this.updateById(applicationapply);
        return true;
    }

}