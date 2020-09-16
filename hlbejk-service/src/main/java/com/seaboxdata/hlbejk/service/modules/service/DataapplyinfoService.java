package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.DataapplyinfoVO;
import com.seaboxdata.hlbejk.service.modules.entity.Dataapplyinfo;

/**
 * 数据申请表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
public interface DataapplyinfoService extends IService<Dataapplyinfo> {

    PageUtils queryPage(Map<String, Object> params);

    Dataapplyinfo queryById(String id);

    Boolean insert(Dataapplyinfo dataapplyinfo);

    Boolean update(Dataapplyinfo dataapplyinfo);
}

