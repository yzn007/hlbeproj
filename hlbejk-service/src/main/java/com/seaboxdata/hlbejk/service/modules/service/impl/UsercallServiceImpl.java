package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.service.modules.dao.UsercallDao;
import com.seaboxdata.hlbejk.service.modules.entity.Usercall;
import com.seaboxdata.hlbejk.service.modules.service.UsercallService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;


@Service("usercallService")
public class UsercallServiceImpl extends ServiceImpl<UsercallDao, Usercall> implements UsercallService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        QueryWrapper queryWrapper = new QueryWrapper();
        if(null!=params && null!=params.get("key")&&!StringUtils.isEmpty(params.get("key").toString())){
            queryWrapper.like("userid",params.get("key"));
        }
        IPage<Usercall> page = this.page(
                new Query<Usercall>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }

    @Override
    public Usercall queryById(String id) {
        Usercall usercall = this.getById(id);
        return usercall;
    }

    @Override
    public Boolean insert(Usercall usercall) {
        this.save(usercall);
        return true;
    }

    @Override
    public Boolean update(Usercall usercall) {
        this.updateById(usercall);
        return true;
    }

}