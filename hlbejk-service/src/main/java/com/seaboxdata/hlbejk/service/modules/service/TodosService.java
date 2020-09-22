package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;

import java.util.List;
import java.util.Map;

import com.seaboxdata.hlbejk.api.vo.NoticeVO;
import com.seaboxdata.hlbejk.api.vo.TodosVO;
import com.seaboxdata.hlbejk.service.modules.entity.Todos;

/**
 * 待办事项
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-16 10:21:25
 */
public interface TodosService extends IService<Todos> {

    PageUtils queryPage(Map<String, Object> params);

    Todos queryById(String id);

    Boolean insert(Todos todos);

    Boolean update(Todos todos);

    List<TodosVO> getTodosList(Map<String, Object> params);
}

