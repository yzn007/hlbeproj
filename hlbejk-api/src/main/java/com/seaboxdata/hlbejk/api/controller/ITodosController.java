package com.seaboxdata.hlbejk.api.controller;

import java.util.List;
import java.util.Map;
import com.seaboxdata.hlbejk.api.FeignClientConfig;
import com.seaboxdata.hlbejk.api.vo.NoticeVO;
import com.seaboxdata.hlbejk.api.vo.TodosVO;
import org.springframework.web.bind.annotation.*;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import com.seaboxdata.commons.core.util.api.PageUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 待办事项
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-16 10:21:25
 */
@Api(tags = {"待办事项"})
@FeignClient(contextId = "hlbejktodos",
        name = FeignClientConfig.NAME, url = FeignClientConfig.URL, configuration = FeignClientsConfiguration.class)
public interface ITodosController {

    /**
     * 列表
     */
    @ApiOperation(value = "列表")
    @GetMapping("/hlbejk/todos/list")
    PageUtils list(@RequestParam Map<String, Object> params);


    /**
     * 查询通知公告信息
     * @param params
     * @return
     */
    @ApiOperation(value = "查询待办事项信息")
    @GetMapping("/hlbejk/todos/getTodosList")
    List<TodosVO> getTodosList(@RequestParam Map<String, Object> params);

    /**
     * 详细信息
     */
    @ApiOperation(value = "详细信息")
    @GetMapping("/hlbejk/todos/info/{id}")
    TodosVO info(@PathVariable("id") String id);

    /**
     * 保存
     */
    @ApiOperation(value = "保存")
    @PostMapping("/hlbejk/todos/save")
    Boolean save(@RequestBody TodosVO todosVO);

    /**
     * 修改
     */
    @ApiOperation(value = "修改")
    @PostMapping("/hlbejk/todos/update")
    Boolean update(@RequestBody TodosVO todosVO);

    /**
     * 删除
     */
    @ApiOperation(value = "删除")
    @DeleteMapping("/hlbejk/todos/delete")
    Boolean delete(@RequestBody String[] ids);

}
