package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.IChargedetailController;
import com.seaboxdata.hlbejk.api.vo.ChargedetailVO;
import com.seaboxdata.hlbejk.common.utils.annotation.OperLog;
import com.seaboxdata.hlbejk.service.modules.entity.Chargedetail;
import com.seaboxdata.hlbejk.service.modules.enums.OperateType;
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
    @OperLog(operModul = "根据日期和用户返回费用次数",operType = OperateType.QUERY,operDesc = "根据日期和用户返回费用次数")
    @Override
    public List queryTotal(String date, String userId) {
        return chargedetailService.queryTotal(date,userId);
    }

    /**
     * 列表
     */
    @OperLog(operModul = "查询费用详细信息列表",operType = OperateType.QUERY,operDesc = "查询费用详细信息列表")
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = chargedetailService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @OperLog(operModul = "查询费用详细信息",operType = OperateType.QUERY,operDesc = "根据id查询费用详细信息")
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
    @OperLog(operModul = "新增费用详细信息",operType = OperateType.ADD,operDesc = "新增费用详细信息")
    @Override
    public Boolean save(@RequestBody ChargedetailVO chargedetailVO){
        Chargedetail chargedetail = new Chargedetail();
        BeanUtils.copyProperties(chargedetailVO, chargedetail);
        return chargedetailService.insert(chargedetail);
    }

    /**
     * 修改
     */
    @OperLog(operModul = "修改费用详细信息",operType = OperateType.UPDATE,operDesc = "修改费用详细信息")
    @Override
    public Boolean update(@RequestBody ChargedetailVO chargedetailVO){
        Chargedetail chargedetail = new Chargedetail();
        BeanUtils.copyProperties(chargedetailVO, chargedetail);
        return chargedetailService.update(chargedetail);
    }

    /**
     * 删除
     */
    @OperLog(operModul = "删除费用详细信息",operType = OperateType.DELETE,operDesc = "删除费用详细信息")
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return chargedetailService.removeByIds(Arrays.asList(ids));
    }

}
