package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.ITodosController;
import com.seaboxdata.hlbejk.api.vo.TodosVO;
import com.seaboxdata.hlbejk.service.modules.entity.Todos;
import com.seaboxdata.hlbejk.service.modules.service.TodosService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 待办事项
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-16 10:21:25
 */
@RestController
public class TodosController implements ITodosController{

    @Autowired
    private TodosService todosService;

    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = todosService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @Override
    public TodosVO info(@PathVariable("id") String id){
        Todos todos = todosService.queryById(id);
        TodosVO todosVO = new TodosVO();
        BeanUtils.copyProperties(todos, todosVO);
        return todosVO;
    }

    /**
     * 保存
     */
    @Override
    public Boolean save(@RequestBody TodosVO todosVO){
        Todos todos = new Todos();
        BeanUtils.copyProperties(todosVO, todos);
        return todosService.insert(todos);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody TodosVO todosVO){
        Todos todos = new Todos();
        BeanUtils.copyProperties(todosVO, todos);
        return todosService.update(todos);
    }

    /**
     * 删除
     */
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return todosService.removeByIds(Arrays.asList(ids));
    }

}
