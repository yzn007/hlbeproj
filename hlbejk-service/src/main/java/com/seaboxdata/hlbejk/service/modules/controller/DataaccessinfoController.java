package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.IDataaccessinfoController;
import com.seaboxdata.hlbejk.api.vo.DataaccessinfoVO;
import com.seaboxdata.hlbejk.service.modules.entity.Dataaccessinfo;
import com.seaboxdata.hlbejk.service.modules.service.DataaccessinfoService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 数据调用表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
@RestController
public class DataaccessinfoController implements IDataaccessinfoController{

    @Autowired
    private DataaccessinfoService dataaccessinfoService;

    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = dataaccessinfoService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @Override
    public DataaccessinfoVO info(@PathVariable("id") String id){
        Dataaccessinfo dataaccessinfo = dataaccessinfoService.queryById(id);
        DataaccessinfoVO dataaccessinfoVO = new DataaccessinfoVO();
        BeanUtils.copyProperties(dataaccessinfo, dataaccessinfoVO);
        return dataaccessinfoVO;
    }

    /**
     * 保存
     */
    @Override
    public Boolean save(@RequestBody DataaccessinfoVO dataaccessinfoVO){
        Dataaccessinfo dataaccessinfo = new Dataaccessinfo();
        BeanUtils.copyProperties(dataaccessinfoVO, dataaccessinfo);
        return dataaccessinfoService.insert(dataaccessinfo);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody DataaccessinfoVO dataaccessinfoVO){
        Dataaccessinfo dataaccessinfo = new Dataaccessinfo();
        BeanUtils.copyProperties(dataaccessinfoVO, dataaccessinfo);
        return dataaccessinfoService.update(dataaccessinfo);
    }

    /**
     * 删除
     */
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return dataaccessinfoService.removeByIds(Arrays.asList(ids));
    }

}
