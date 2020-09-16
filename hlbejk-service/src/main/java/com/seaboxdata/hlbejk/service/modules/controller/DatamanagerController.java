package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.IDatamanagerController;
import com.seaboxdata.hlbejk.api.vo.DatamanagerVO;
import com.seaboxdata.hlbejk.service.modules.entity.Datamanager;
import com.seaboxdata.hlbejk.service.modules.service.DatamanagerService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 数据管理
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 17:35:51
 */
@RestController
public class DatamanagerController implements IDatamanagerController{

    @Autowired
    private DatamanagerService datamanagerService;

    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = datamanagerService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @Override
    public DatamanagerVO info(@PathVariable("id") String id){
        Datamanager datamanager = datamanagerService.queryById(id);
        DatamanagerVO datamanagerVO = new DatamanagerVO();
        BeanUtils.copyProperties(datamanager, datamanagerVO);
        return datamanagerVO;
    }

    /**
     * 保存
     */
    @Override
    public Boolean save(@RequestBody DatamanagerVO datamanagerVO){
        Datamanager datamanager = new Datamanager();
        BeanUtils.copyProperties(datamanagerVO, datamanager);
        return datamanagerService.insert(datamanager);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody DatamanagerVO datamanagerVO){
        Datamanager datamanager = new Datamanager();
        BeanUtils.copyProperties(datamanagerVO, datamanager);
        return datamanagerService.update(datamanager);
    }

    /**
     * 删除
     */
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return datamanagerService.removeByIds(Arrays.asList(ids));
    }

}
