package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.api.vo.TodosVO;
import com.seaboxdata.hlbejk.service.modules.dao.TodosDao;
import com.seaboxdata.hlbejk.service.modules.service.TodosService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;
import com.seaboxdata.hlbejk.service.modules.entity.Todos;


@Service("todosService")
public class TodosServiceImpl extends ServiceImpl<TodosDao, Todos> implements TodosService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Todos> page = this.page(
                new Query<Todos>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public Todos queryById(String id) {
        Todos todos = this.getById(id);
        return todos;
    }

    @Override
    public Boolean insert(Todos todos) {
        this.save(todos);
        return true;
    }

    @Override
    public Boolean update(Todos todos) {
        this.updateById(todos);
        return true;
    }

    @Override
    public List<TodosVO> getTodosList(Map<String, Object> params) {
        return super.baseMapper.getTodosList(params);
    }


}