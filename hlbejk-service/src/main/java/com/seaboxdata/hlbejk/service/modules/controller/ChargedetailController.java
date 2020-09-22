package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.IChargedetailController;
import com.seaboxdata.hlbejk.api.vo.ChargedetailVO;
import com.seaboxdata.hlbejk.service.modules.entity.Chargedetail;
import com.seaboxdata.hlbejk.service.modules.service.ChargedetailService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 费用详细
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 18:18:06
 */
@RestController
public class ChargedetailController implements IChargedetailController{

    @Autowired
    private ChargedetailService chargedetailService;

    /**
     * 根据日期和用户返回费用次数
     * @param date
     * @param userId
     * @return
     */
    @Override
    public List queryTotal(String date, String userId) {
        return chargedetailService.queryTotal(date,userId);
    }

    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = chargedetailService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @Override
    public ChargedetailVO info(@PathVariable("id") String id){
        Chargedetail chargedetail = chargedetailService.queryById(id);
        ChargedetailVO chargedetailVO = new ChargedetailVO();
        BeanUtils.copyProperties(chargedetail, chargedetailVO);
        return chargedetailVO;
    }

    /**
     * 保存
     */
    @Override
    public Boolean save(@RequestBody ChargedetailVO chargedetailVO){
        Chargedetail chargedetail = new Chargedetail();
        BeanUtils.copyProperties(chargedetailVO, chargedetail);
        return chargedetailService.insert(chargedetail);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody ChargedetailVO chargedetailVO){
        Chargedetail chargedetail = new Chargedetail();
        BeanUtils.copyProperties(chargedetailVO, chargedetail);
        return chargedetailService.update(chargedetail);
    }

    /**
     * 删除
     */
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return chargedetailService.removeByIds(Arrays.asList(ids));
    }

}
