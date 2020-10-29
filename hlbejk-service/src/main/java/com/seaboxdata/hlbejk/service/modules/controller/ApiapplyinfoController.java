package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.IApiapplyinfoController;
import com.seaboxdata.hlbejk.api.vo.ApiapplyinfoVO;
import com.seaboxdata.hlbejk.common.utils.annotation.OperLog;
import com.seaboxdata.hlbejk.service.modules.entity.Apiapplyinfo;
import com.seaboxdata.hlbejk.service.modules.enums.OperateType;
import com.seaboxdata.hlbejk.service.modules.service.ApiapplyinfoService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 接口申请表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
@RestController
public class ApiapplyinfoController implements IApiapplyinfoController{

    @Autowired
    private ApiapplyinfoService apiapplyinfoService;

    /**
     * 列表
     */
    @OperLog(operModul = "查询接口申请信息",operType = OperateType.QUERY,operDesc = "查询接口申请信息")
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = apiapplyinfoService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @OperLog(operModul = "查询接口申请信息",operType = OperateType.QUERY,operDesc = "根据id查询接口申请信息")
    @Override
    public ApiapplyinfoVO info(@PathVariable("id") String id){
        Apiapplyinfo apiapplyinfo = apiapplyinfoService.queryById(id);
        ApiapplyinfoVO apiapplyinfoVO = new ApiapplyinfoVO();
        BeanUtils.copyProperties(apiapplyinfo, apiapplyinfoVO);
        return apiapplyinfoVO;
    }

    /**
     * 保存
     */
    @OperLog(operModul = "新增接口申请信息",operType = OperateType.ADD,operDesc = "新增接口申请信息")
    @Override
    public Boolean save(@RequestBody ApiapplyinfoVO apiapplyinfoVO){
        Apiapplyinfo apiapplyinfo = new Apiapplyinfo();
        BeanUtils.copyProperties(apiapplyinfoVO, apiapplyinfo);
        return apiapplyinfoService.insert(apiapplyinfo);
    }

    /**
     * 修改
     */
    @OperLog(operModul = "更新接口申请信息",operType = OperateType.UPDATE,operDesc = "更新接口申请信息")
    @Override
    public Boolean update(@RequestBody ApiapplyinfoVO apiapplyinfoVO){
        Apiapplyinfo apiapplyinfo = new Apiapplyinfo();
        BeanUtils.copyProperties(apiapplyinfoVO, apiapplyinfo);
        return apiapplyinfoService.update(apiapplyinfo);
    }

    /**
     * 删除
     */
    @OperLog(operModul = "删除接口申请信息",operType = OperateType.DELETE,operDesc = "删除接口申请信息")
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return apiapplyinfoService.removeByIds(Arrays.asList(ids));
    }

}
