package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;

import java.util.List;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.UsermonitorVO;
import com.seaboxdata.hlbejk.service.modules.entity.Usermonitor;

/**
 * 用户监控
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
public interface UsermonitorService extends IService<Usermonitor> {

    PageUtils queryPage(Map<String, Object> params);

    Usermonitor queryById(String id);

    Boolean insert(Usermonitor usermonitor);

    Boolean update(Usermonitor usermonitor);

    List<Usermonitor> queryByDateAndUser (Map<String, Object> params);
}

