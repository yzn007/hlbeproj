package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.IOperationlogsController;
import com.seaboxdata.hlbejk.api.vo.OperationlogsVO;
import com.seaboxdata.hlbejk.service.modules.entity.Operationlogs;
import com.seaboxdata.hlbejk.service.modules.service.OperationlogsService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 操作日志
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 17:35:51
 */
@RestController
public class OperationlogsController implements IOperationlogsController{

    @Autowired
    private OperationlogsService operationlogsService;

    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = operationlogsService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @Override
    public OperationlogsVO info(@PathVariable("id") String id){
        Operationlogs operationlogs = operationlogsService.queryById(id);
        OperationlogsVO operationlogsVO = new OperationlogsVO();
        BeanUtils.copyProperties(operationlogs, operationlogsVO);
        return operationlogsVO;
    }

    /**
     * 保存
     */
    @Override
    public Boolean save(@RequestBody OperationlogsVO operationlogsVO){
        Operationlogs operationlogs = new Operationlogs();
        BeanUtils.copyProperties(operationlogsVO, operationlogs);
        return operationlogsService.insert(operationlogs);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody OperationlogsVO operationlogsVO){
        Operationlogs operationlogs = new Operationlogs();
        BeanUtils.copyProperties(operationlogsVO, operationlogs);
        return operationlogsService.update(operationlogs);
    }

    /**
     * 删除
     */
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return operationlogsService.removeByIds(Arrays.asList(ids));
    }

}
