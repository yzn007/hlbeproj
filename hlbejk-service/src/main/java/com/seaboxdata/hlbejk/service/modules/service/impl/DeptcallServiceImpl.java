package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.service.modules.dao.DeptcallDao;
import com.seaboxdata.hlbejk.service.modules.entity.Deptcall;
import com.seaboxdata.hlbejk.service.modules.service.DeptcallService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;


@Service("deptcallService")
public class DeptcallServiceImpl extends ServiceImpl<DeptcallDao, Deptcall> implements DeptcallService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        QueryWrapper queryWrapper = new QueryWrapper();
        if(null!=params && null!=params.get("key")&&!StringUtils.isEmpty(params.get("key").toString())){
            queryWrapper.like("deptid",params.get("key"));
        }
        IPage<Deptcall> page = this.page(
                new Query<Deptcall>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }

    @Override
    public Deptcall queryById(String id) {
        Deptcall deptcall = this.getById(id);
        return deptcall;
    }

    @Override
    public Boolean insert(Deptcall deptcall) {
        this.save(deptcall);
        return true;
    }

    @Override
    public Boolean update(Deptcall deptcall) {
        this.updateById(deptcall);
        return true;
    }

}