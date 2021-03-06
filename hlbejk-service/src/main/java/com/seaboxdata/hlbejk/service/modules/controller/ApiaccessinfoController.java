package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.IApiaccessinfoController;
import com.seaboxdata.hlbejk.api.vo.ApiaccessinfoVO;
import com.seaboxdata.hlbejk.common.utils.annotation.OperLog;
import com.seaboxdata.hlbejk.service.modules.entity.Apiaccessinfo;
import com.seaboxdata.hlbejk.service.modules.enums.OperateType;
import com.seaboxdata.hlbejk.service.modules.service.ApiaccessinfoService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 接口调用表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
@RestController
public class ApiaccessinfoController implements IApiaccessinfoController{

    @Autowired
    private ApiaccessinfoService apiaccessinfoService;

    /**
     * 列表
     */
    @OperLog(operModul = "接口调用管理",operType = OperateType.QUERY,operDesc = "接口调用管理")
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = apiaccessinfoService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @OperLog(operModul = "查询接口调用信息",operType = OperateType.QUERY,operDesc = "根据id查询接口调用信息")
    @Override
    public ApiaccessinfoVO info(@PathVariable("id") String id){
        Apiaccessinfo apiaccessinfo = apiaccessinfoService.queryById(id);
        ApiaccessinfoVO apiaccessinfoVO = new ApiaccessinfoVO();
        BeanUtils.copyProperties(apiaccessinfo, apiaccessinfoVO);
        return apiaccessinfoVO;
    }

    /**
     * 保存
     */
    @OperLog(operModul = "新增接口调用信息",operType = OperateType.ADD,operDesc = "新增接口调用信息")
    @Override
    public Boolean save(@RequestBody ApiaccessinfoVO apiaccessinfoVO){
        Apiaccessinfo apiaccessinfo = new Apiaccessinfo();
        BeanUtils.copyProperties(apiaccessinfoVO, apiaccessinfo);
        return apiaccessinfoService.insert(apiaccessinfo);
    }

    /**
     * 修改
     */
    @OperLog(operModul = "更新接口调用信息",operType = OperateType.UPDATE,operDesc = "更新接口调用信息")
    @Override
    public Boolean update(@RequestBody ApiaccessinfoVO apiaccessinfoVO){
        Apiaccessinfo apiaccessinfo = new Apiaccessinfo();
        BeanUtils.copyProperties(apiaccessinfoVO, apiaccessinfo);
        return apiaccessinfoService.update(apiaccessinfo);
    }

    /**
     * 删除
     */
    @OperLog(operModul = "删除接口调用信息",operType = OperateType.DELETE,operDesc = "删除接口调用信息")
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return apiaccessinfoService.removeByIds(Arrays.asList(ids));
    }

}
