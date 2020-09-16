package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.IModelaccessinfoController;
import com.seaboxdata.hlbejk.api.vo.ModelaccessinfoVO;
import com.seaboxdata.hlbejk.service.modules.entity.Modelaccessinfo;
import com.seaboxdata.hlbejk.service.modules.service.ModelaccessinfoService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 模型调用表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
@RestController
public class ModelaccessinfoController implements IModelaccessinfoController{

    @Autowired
    private ModelaccessinfoService modelaccessinfoService;

    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = modelaccessinfoService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @Override
    public ModelaccessinfoVO info(@PathVariable("id") String id){
        Modelaccessinfo modelaccessinfo = modelaccessinfoService.queryById(id);
        ModelaccessinfoVO modelaccessinfoVO = new ModelaccessinfoVO();
        BeanUtils.copyProperties(modelaccessinfo, modelaccessinfoVO);
        return modelaccessinfoVO;
    }

    /**
     * 保存
     */
    @Override
    public Boolean save(@RequestBody ModelaccessinfoVO modelaccessinfoVO){
        Modelaccessinfo modelaccessinfo = new Modelaccessinfo();
        BeanUtils.copyProperties(modelaccessinfoVO, modelaccessinfo);
        return modelaccessinfoService.insert(modelaccessinfo);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody ModelaccessinfoVO modelaccessinfoVO){
        Modelaccessinfo modelaccessinfo = new Modelaccessinfo();
        BeanUtils.copyProperties(modelaccessinfoVO, modelaccessinfo);
        return modelaccessinfoService.update(modelaccessinfo);
    }

    /**
     * 删除
     */
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return modelaccessinfoService.removeByIds(Arrays.asList(ids));
    }

}
