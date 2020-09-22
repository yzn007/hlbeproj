package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;

import java.util.List;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.ChargedetailVO;
import com.seaboxdata.hlbejk.service.modules.entity.Chargedetail;
import org.apache.ibatis.annotations.Param;

/**
 * 费用详细
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 18:18:06
 */
public interface ChargedetailService extends IService<Chargedetail> {

    PageUtils queryPage(Map<String, Object> params);

    Chargedetail queryById(String id);

    Boolean insert(Chargedetail chargedetail);

    Boolean update(Chargedetail chargedetail);

    List<ChargedetailVO> queryTotal(String date,String userId);
}

