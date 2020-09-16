package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.ChargesetVO;
import com.seaboxdata.hlbejk.service.modules.entity.Chargeset;

/**
 * 计费设置
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 18:18:06
 */
public interface ChargesetService extends IService<Chargeset> {

    PageUtils queryPage(Map<String, Object> params);

    Chargeset queryById(String id);

    Boolean insert(Chargeset chargeset);

    Boolean update(Chargeset chargeset);
}

