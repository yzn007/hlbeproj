package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.api.vo.DaymonitorVO;
import com.seaboxdata.hlbejk.api.vo.UsermonitorVO;
import com.seaboxdata.hlbejk.service.modules.dao.UsermonitorDao;
import com.seaboxdata.hlbejk.service.modules.entity.Usermonitor;
import com.seaboxdata.hlbejk.service.modules.service.UsermonitorService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;


@Service("usermonitorService")
public class UsermonitorServiceImpl extends ServiceImpl<UsermonitorDao, Usermonitor> implements UsermonitorService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Usermonitor> page = this.page(
                new Query<Usermonitor>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public Usermonitor queryById(String id) {
        Usermonitor usermonitor = this.getById(id);
        return usermonitor;
    }

    @Override
    public Boolean insert(Usermonitor usermonitor) {
        this.save(usermonitor);
        return true;
    }

    @Override
    public Boolean update(Usermonitor usermonitor) {
        this.updateById(usermonitor);
        return true;
    }

    @Override
    public List queryByDateAndUser(Map<String, Object> params) {
        return super.baseMapper.queryByDateAndUser(params);
    }
}