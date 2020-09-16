package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.IDataapplyinfoController;
import com.seaboxdata.hlbejk.api.vo.DataapplyinfoVO;
import com.seaboxdata.hlbejk.service.modules.entity.Dataapplyinfo;
import com.seaboxdata.hlbejk.service.modules.service.DataapplyinfoService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 数据申请表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
@RestController
public class DataapplyinfoController implements IDataapplyinfoController{

    @Autowired
    private DataapplyinfoService dataapplyinfoService;

    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = dataapplyinfoService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @Override
    public DataapplyinfoVO info(@PathVariable("id") String id){
        Dataapplyinfo dataapplyinfo = dataapplyinfoService.queryById(id);
        DataapplyinfoVO dataapplyinfoVO = new DataapplyinfoVO();
        BeanUtils.copyProperties(dataapplyinfo, dataapplyinfoVO);
        return dataapplyinfoVO;
    }

    /**
     * 保存
     */
    @Override
    public Boolean save(@RequestBody DataapplyinfoVO dataapplyinfoVO){
        Dataapplyinfo dataapplyinfo = new Dataapplyinfo();
        BeanUtils.copyProperties(dataapplyinfoVO, dataapplyinfo);
        return dataapplyinfoService.insert(dataapplyinfo);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody DataapplyinfoVO dataapplyinfoVO){
        Dataapplyinfo dataapplyinfo = new Dataapplyinfo();
        BeanUtils.copyProperties(dataapplyinfoVO, dataapplyinfo);
        return dataapplyinfoService.update(dataapplyinfo);
    }

    /**
     * 删除
     */
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return dataapplyinfoService.removeByIds(Arrays.asList(ids));
    }

}
