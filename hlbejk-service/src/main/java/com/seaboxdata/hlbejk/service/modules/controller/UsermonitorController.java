package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.IUsermonitorController;
import com.seaboxdata.hlbejk.api.vo.UsermonitorVO;
import com.seaboxdata.hlbejk.service.modules.entity.Usermonitor;
import com.seaboxdata.hlbejk.service.modules.service.UsermonitorService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 用户监控
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
@RestController
public class UsermonitorController implements IUsermonitorController{

    @Autowired
    private UsermonitorService usermonitorService;

    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = usermonitorService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @Override
    public UsermonitorVO info(@PathVariable("id") String id){
        Usermonitor usermonitor = usermonitorService.queryById(id);
        UsermonitorVO usermonitorVO = new UsermonitorVO();
        BeanUtils.copyProperties(usermonitor, usermonitorVO);
        return usermonitorVO;
    }

    /**
     * 保存
     */
    @Override
    public Boolean save(@RequestBody UsermonitorVO usermonitorVO){
        Usermonitor usermonitor = new Usermonitor();
        BeanUtils.copyProperties(usermonitorVO, usermonitor);
        return usermonitorService.insert(usermonitor);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody UsermonitorVO usermonitorVO){
        Usermonitor usermonitor = new Usermonitor();
        BeanUtils.copyProperties(usermonitorVO, usermonitor);
        return usermonitorService.update(usermonitor);
    }

    /**
     * 删除
     */
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return usermonitorService.removeByIds(Arrays.asList(ids));
    }

}
