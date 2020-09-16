package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.IUsercallController;
import com.seaboxdata.hlbejk.api.vo.UsercallVO;
import com.seaboxdata.hlbejk.service.modules.entity.Usercall;
import com.seaboxdata.hlbejk.service.modules.service.UsercallService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 个人调用
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 18:18:06
 */
@RestController
public class UsercallController implements IUsercallController{

    @Autowired
    private UsercallService usercallService;

    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = usercallService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @Override
    public UsercallVO info(@PathVariable("id") String id){
        Usercall usercall = usercallService.queryById(id);
        UsercallVO usercallVO = new UsercallVO();
        BeanUtils.copyProperties(usercall, usercallVO);
        return usercallVO;
    }

    /**
     * 保存
     */
    @Override
    public Boolean save(@RequestBody UsercallVO usercallVO){
        Usercall usercall = new Usercall();
        BeanUtils.copyProperties(usercallVO, usercall);
        return usercallService.insert(usercall);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody UsercallVO usercallVO){
        Usercall usercall = new Usercall();
        BeanUtils.copyProperties(usercallVO, usercall);
        return usercallService.update(usercall);
    }

    /**
     * 删除
     */
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return usercallService.removeByIds(Arrays.asList(ids));
    }

}
