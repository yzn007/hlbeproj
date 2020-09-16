package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.UsercallVO;
import com.seaboxdata.hlbejk.service.modules.entity.Usercall;

/**
 * 个人调用
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 18:18:06
 */
public interface UsercallService extends IService<Usercall> {

    PageUtils queryPage(Map<String, Object> params);

    Usercall queryById(String id);

    Boolean insert(Usercall usercall);

    Boolean update(Usercall usercall);
}

