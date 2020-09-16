package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.service.modules.dao.OperationlogsDao;
import com.seaboxdata.hlbejk.service.modules.entity.Operationlogs;
import com.seaboxdata.hlbejk.service.modules.service.OperationlogsService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;


@Service("operationlogsService")
public class OperationlogsServiceImpl extends ServiceImpl<OperationlogsDao, Operationlogs> implements OperationlogsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Operationlogs> page = this.page(
                new Query<Operationlogs>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public Operationlogs queryById(String id) {
        Operationlogs operationlogs = this.getById(id);
        return operationlogs;
    }

    @Override
    public Boolean insert(Operationlogs operationlogs) {
        this.save(operationlogs);
        return true;
    }

    @Override
    public Boolean update(Operationlogs operationlogs) {
        this.updateById(operationlogs);
        return true;
    }

}