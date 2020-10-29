package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.IChargetypeController;
import com.seaboxdata.hlbejk.api.vo.ChargetypeVO;
import com.seaboxdata.hlbejk.common.utils.annotation.OperLog;
import com.seaboxdata.hlbejk.service.modules.entity.Chargetype;
import com.seaboxdata.hlbejk.service.modules.enums.OperateType;
import com.seaboxdata.hlbejk.service.modules.service.ChargetypeService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 费用类型
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 18:18:06
 */
@RestController
public class ChargetypeController implements IChargetypeController{

    @Autowired
    private ChargetypeService chargetypeService;

    /**
     * 列表
     */
    @OperLog(operModul = "查询费用类型列表",operType = OperateType.QUERY,operDesc = "查询费用类型列表")
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = chargetypeService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @OperLog(operModul = "查询费用类型信息",operType = OperateType.QUERY,operDesc = "根据id费用类型信息")
    @Override
    public ChargetypeVO info(@PathVariable("id") String id){
        Chargetype chargetype = chargetypeService.queryById(id);
        ChargetypeVO chargetypeVO = new ChargetypeVO();
        BeanUtils.copyProperties(chargetype, chargetypeVO);
        return chargetypeVO;
    }

    /**
     * 保存
     */
    @OperLog(operModul = "新增费用类型信息",operType = OperateType.ADD,operDesc = "新增费用类型信息")
    @Override
    public Boolean save(@RequestBody ChargetypeVO chargetypeVO){
        Chargetype chargetype = new Chargetype();
        BeanUtils.copyProperties(chargetypeVO, chargetype);
        return chargetypeService.insert(chargetype);
    }

    /**
     * 修改
     */
    @OperLog(operModul = "更新费用类型信息",operType = OperateType.UPDATE,operDesc = "更新费用类型信息")
    @Override
    public Boolean update(@RequestBody ChargetypeVO chargetypeVO){
        Chargetype chargetype = new Chargetype();
        BeanUtils.copyProperties(chargetypeVO, chargetype);
        return chargetypeService.update(chargetype);
    }

    /**
     * 删除
     */
    @OperLog(operModul = "删除费用类型信息",operType = OperateType.DELETE,operDesc = "删除费用类型信息")
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return chargetypeService.removeByIds(Arrays.asList(ids));
    }

}
