package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.OperationlogsVO;
import com.seaboxdata.hlbejk.service.modules.entity.Operationlogs;

/**
 * 操作日志
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 17:35:51
 */
public interface OperationlogsService extends IService<Operationlogs> {

    PageUtils queryPage(Map<String, Object> params);

    Operationlogs queryById(String id);

    Boolean insert(Operationlogs operationlogs);

    Boolean update(Operationlogs operationlogs);
}

