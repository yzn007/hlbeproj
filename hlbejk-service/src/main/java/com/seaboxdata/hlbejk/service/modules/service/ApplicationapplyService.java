package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.ApplicationapplyVO;
import com.seaboxdata.hlbejk.service.modules.entity.Applicationapply;

/**
 * 应用申请表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-10-12 15:03:27
 */
public interface ApplicationapplyService extends IService<Applicationapply> {

    PageUtils queryPage(Map<String, Object> params);


    Applicationapply queryById(String id);

    Boolean insert(Applicationapply applicationapply);

    Boolean update(Applicationapply applicationapply);
}

