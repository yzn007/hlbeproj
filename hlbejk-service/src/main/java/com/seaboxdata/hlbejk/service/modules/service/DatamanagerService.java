package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.DatamanagerVO;
import com.seaboxdata.hlbejk.service.modules.entity.Datamanager;

/**
 * 数据管理
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 17:35:51
 */
public interface DatamanagerService extends IService<Datamanager> {

    PageUtils queryPage(Map<String, Object> params);

    Datamanager queryById(String id);

    Boolean insert(Datamanager datamanager);

    Boolean update(Datamanager datamanager);
}

