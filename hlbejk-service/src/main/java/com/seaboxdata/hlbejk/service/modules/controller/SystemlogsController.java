package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.ISystemlogsController;
import com.seaboxdata.hlbejk.api.vo.SystemlogsVO;
import com.seaboxdata.hlbejk.service.modules.entity.Systemlogs;
import com.seaboxdata.hlbejk.service.modules.service.SystemlogsService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 系统日志
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 17:35:51
 */
@RestController
public class SystemlogsController implements ISystemlogsController{

    @Autowired
    private SystemlogsService systemlogsService;

    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = systemlogsService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @Override
    public SystemlogsVO info(@PathVariable("id") String id){
        Systemlogs systemlogs = systemlogsService.queryById(id);
        SystemlogsVO systemlogsVO = new SystemlogsVO();
        BeanUtils.copyProperties(systemlogs, systemlogsVO);
        return systemlogsVO;
    }

    /**
     * 保存
     */
    @Override
    public Boolean save(@RequestBody SystemlogsVO systemlogsVO){
        Systemlogs systemlogs = new Systemlogs();
        BeanUtils.copyProperties(systemlogsVO, systemlogs);
        return systemlogsService.insert(systemlogs);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody SystemlogsVO systemlogsVO){
        Systemlogs systemlogs = new Systemlogs();
        BeanUtils.copyProperties(systemlogsVO, systemlogs);
        return systemlogsService.update(systemlogs);
    }

    /**
     * 删除
     */
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return systemlogsService.removeByIds(Arrays.asList(ids));
    }

}
