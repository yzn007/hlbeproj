package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.ISystemAccessController;
import com.seaboxdata.hlbejk.api.vo.SystemAccessVO;
import com.seaboxdata.hlbejk.service.modules.entity.SystemAccess;
import com.seaboxdata.hlbejk.service.modules.service.SystemAccessService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 系统访问统计报表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-04 10:33:33
 */
@RestController
public class SystemAccessController implements ISystemAccessController{

    @Autowired
    private SystemAccessService systemAccessService;

    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = systemAccessService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @Override
    public SystemAccessVO info(@PathVariable("id") String id){
        SystemAccess systemAccess = systemAccessService.queryById(id);
        SystemAccessVO systemAccessVO = new SystemAccessVO();
        BeanUtils.copyProperties(systemAccess, systemAccessVO);
        return systemAccessVO;
    }

    /**
     * 保存
     */
    @Override
    public Boolean save(@RequestBody SystemAccessVO systemAccessVO){
        SystemAccess systemAccess = new SystemAccess();
        BeanUtils.copyProperties(systemAccessVO, systemAccess);
        return systemAccessService.insert(systemAccess);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody SystemAccessVO systemAccessVO){
        SystemAccess systemAccess = new SystemAccess();
        BeanUtils.copyProperties(systemAccessVO, systemAccess);
        return systemAccessService.update(systemAccess);
    }

    /**
     * 删除
     */
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return systemAccessService.removeByIds(Arrays.asList(ids));
    }

}
