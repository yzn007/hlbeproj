package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.IChargesetController;
import com.seaboxdata.hlbejk.api.vo.ChargesetVO;
import com.seaboxdata.hlbejk.common.utils.annotation.OperLog;
import com.seaboxdata.hlbejk.service.modules.entity.Chargeset;
import com.seaboxdata.hlbejk.service.modules.enums.OperateType;
import com.seaboxdata.hlbejk.service.modules.service.ChargesetService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 计费设置
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 18:18:06
 */
@RestController
public class ChargesetController implements IChargesetController{

    @Autowired
    private ChargesetService chargesetService;

    /**
     * 列表
     */
    @OperLog(operModul = "查询计费设置列表",operType = OperateType.QUERY,operDesc = "查询计费设置列表")
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = chargesetService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @OperLog(operModul = "查询计费设置信息",operType = OperateType.QUERY,operDesc = "根据id查询计费设置信息")
    @Override
    public ChargesetVO info(@PathVariable("id") String id){
        Chargeset chargeset = chargesetService.queryById(id);
        ChargesetVO chargesetVO = new ChargesetVO();
        BeanUtils.copyProperties(chargeset, chargesetVO);
        return chargesetVO;
    }

    /**
     * 保存
     */
    @OperLog(operModul = "新增计费设置信息",operType = OperateType.ADD,operDesc = "新增计费设置信息")
    @Override
    public Boolean save(@RequestBody ChargesetVO chargesetVO){
        Chargeset chargeset = new Chargeset();
        BeanUtils.copyProperties(chargesetVO, chargeset);
        return chargesetService.insert(chargeset);
    }

    /**
     * 修改
     */
    @OperLog(operModul = "修改计费设置信息",operType = OperateType.UPDATE,operDesc = "修改计费设置信息")
    @Override
    public Boolean update(@RequestBody ChargesetVO chargesetVO){
        Chargeset chargeset = new Chargeset();
        BeanUtils.copyProperties(chargesetVO, chargeset);
        return chargesetService.update(chargeset);
    }

    /**
     * 删除
     */
    @OperLog(operModul = "删除计费设置信息",operType = OperateType.DELETE,operDesc = "删除计费设置信息")
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return chargesetService.removeByIds(Arrays.asList(ids));
    }

}
