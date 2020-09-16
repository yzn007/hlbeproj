package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.IModelapplyinfoController;
import com.seaboxdata.hlbejk.api.vo.ModelapplyinfoVO;
import com.seaboxdata.hlbejk.service.modules.entity.Modelapplyinfo;
import com.seaboxdata.hlbejk.service.modules.service.ModelapplyinfoService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 模型申请表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
@RestController
public class ModelapplyinfoController implements IModelapplyinfoController{

    @Autowired
    private ModelapplyinfoService modelapplyinfoService;

    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = modelapplyinfoService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @Override
    public ModelapplyinfoVO info(@PathVariable("id") String id){
        Modelapplyinfo modelapplyinfo = modelapplyinfoService.queryById(id);
        ModelapplyinfoVO modelapplyinfoVO = new ModelapplyinfoVO();
        BeanUtils.copyProperties(modelapplyinfo, modelapplyinfoVO);
        return modelapplyinfoVO;
    }

    /**
     * 保存
     */
    @Override
    public Boolean save(@RequestBody ModelapplyinfoVO modelapplyinfoVO){
        Modelapplyinfo modelapplyinfo = new Modelapplyinfo();
        BeanUtils.copyProperties(modelapplyinfoVO, modelapplyinfo);
        return modelapplyinfoService.insert(modelapplyinfo);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody ModelapplyinfoVO modelapplyinfoVO){
        Modelapplyinfo modelapplyinfo = new Modelapplyinfo();
        BeanUtils.copyProperties(modelapplyinfoVO, modelapplyinfo);
        return modelapplyinfoService.update(modelapplyinfo);
    }

    /**
     * 删除
     */
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return modelapplyinfoService.removeByIds(Arrays.asList(ids));
    }

}
