package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.ChargetypeVO;
import com.seaboxdata.hlbejk.service.modules.entity.Chargetype;

/**
 * 费用类型
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 18:18:06
 */
public interface ChargetypeService extends IService<Chargetype> {

    PageUtils queryPage(Map<String, Object> params);

    Chargetype queryById(String id);

    Boolean insert(Chargetype chargetype);

    Boolean update(Chargetype chargetype);
}

