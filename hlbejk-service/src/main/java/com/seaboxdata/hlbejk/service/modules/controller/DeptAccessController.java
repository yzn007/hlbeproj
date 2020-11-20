package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.IDeptAccessController;
import com.seaboxdata.hlbejk.api.vo.DeptAccessVO;
import com.seaboxdata.hlbejk.service.modules.entity.DeptAccess;
import com.seaboxdata.hlbejk.service.modules.service.DeptAccessService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 部门资源调用统计次数
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-04 10:33:33
 */
@RestController
public class DeptAccessController implements IDeptAccessController{

    @Autowired
    private DeptAccessService deptAccessService;

    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = deptAccessService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @Override
    public DeptAccessVO info(@PathVariable("id") String id){
        DeptAccess deptAccess = deptAccessService.queryById(id);
        DeptAccessVO deptAccessVO = new DeptAccessVO();
        BeanUtils.copyProperties(deptAccess, deptAccessVO);
        return deptAccessVO;
    }

    /**
     * 保存
     */
    @Override
    public Boolean save(@RequestBody DeptAccessVO deptAccessVO){
        DeptAccess deptAccess = new DeptAccess();
        BeanUtils.copyProperties(deptAccessVO, deptAccess);
        return deptAccessService.insert(deptAccess);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody DeptAccessVO deptAccessVO){
        DeptAccess deptAccess = new DeptAccess();
        BeanUtils.copyProperties(deptAccessVO, deptAccess);
        return deptAccessService.update(deptAccess);
    }

    /**
     * 删除
     */
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return deptAccessService.removeByIds(Arrays.asList(ids));
    }

}
