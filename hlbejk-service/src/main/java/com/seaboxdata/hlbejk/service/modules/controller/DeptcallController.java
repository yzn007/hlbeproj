package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.IDeptcallController;
import com.seaboxdata.hlbejk.api.vo.DeptcallVO;
import com.seaboxdata.hlbejk.service.modules.entity.Deptcall;
import com.seaboxdata.hlbejk.service.modules.service.DeptcallService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 16:07:22
 */
@RestController
public class DeptcallController implements IDeptcallController{

    @Autowired
    private DeptcallService deptcallService;

    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = deptcallService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @Override
    public DeptcallVO info(@PathVariable("id") String id){
        Deptcall deptcall = deptcallService.queryById(id);
        DeptcallVO deptcallVO = new DeptcallVO();
        BeanUtils.copyProperties(deptcall, deptcallVO);
        return deptcallVO;
    }

    /**
     * 保存
     */
    @Override
    public Boolean save(@RequestBody DeptcallVO deptcallVO){
        Deptcall deptcall = new Deptcall();
        BeanUtils.copyProperties(deptcallVO, deptcall);
        return deptcallService.insert(deptcall);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody DeptcallVO deptcallVO){
        Deptcall deptcall = new Deptcall();
        BeanUtils.copyProperties(deptcallVO, deptcall);
        return deptcallService.update(deptcall);
    }

    /**
     * 删除
     */
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return deptcallService.removeByIds(Arrays.asList(ids));
    }

}
