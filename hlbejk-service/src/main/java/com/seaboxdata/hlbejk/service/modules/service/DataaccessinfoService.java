package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;

import java.util.List;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.DataaccessinfoVO;
import com.seaboxdata.hlbejk.service.modules.dao.DaymonitorDao;
import com.seaboxdata.hlbejk.service.modules.entity.Dataaccessinfo;

/**
 * 数据调用表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
public interface DataaccessinfoService extends IService<Dataaccessinfo> {


    PageUtils queryPage(Map<String, Object> params);

    Dataaccessinfo queryById(String id);

    Boolean insert(Dataaccessinfo dataaccessinfo);

    Boolean update(Dataaccessinfo dataaccessinfo);


}

