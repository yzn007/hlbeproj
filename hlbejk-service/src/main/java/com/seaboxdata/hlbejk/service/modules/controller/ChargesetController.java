package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.IChargesetController;
import com.seaboxdata.hlbejk.api.vo.ChargesetVO;
import com.seaboxdata.hlbejk.service.modules.entity.Chargeset;
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
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = chargesetService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
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
    @Override
    public Boolean save(@RequestBody ChargesetVO chargesetVO){
        Chargeset chargeset = new Chargeset();
        BeanUtils.copyProperties(chargesetVO, chargeset);
        return chargesetService.insert(chargeset);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody ChargesetVO chargesetVO){
        Chargeset chargeset = new Chargeset();
        BeanUtils.copyProperties(chargesetVO, chargeset);
        return chargesetService.update(chargeset);
    }

    /**
     * 删除
     */
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return chargesetService.removeByIds(Arrays.asList(ids));
    }

}
