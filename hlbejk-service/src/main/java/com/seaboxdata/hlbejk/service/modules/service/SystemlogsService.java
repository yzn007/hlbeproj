package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.SystemlogsVO;
import com.seaboxdata.hlbejk.service.modules.entity.Systemlogs;

/**
 * 系统日志
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 17:35:51
 */
public interface SystemlogsService extends IService<Systemlogs> {

    PageUtils queryPage(Map<String, Object> params);

    Systemlogs queryById(String id);

    Boolean insert(Systemlogs systemlogs);

    Boolean update(Systemlogs systemlogs);
}

