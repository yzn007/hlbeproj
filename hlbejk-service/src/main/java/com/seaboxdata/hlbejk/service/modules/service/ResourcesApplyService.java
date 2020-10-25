package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.hlbejk.service.modules.entity.ResourcesApply;
import com.seaboxdata.commons.core.util.api.PageUtils;

import java.util.List;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.ResourcesApplyVO;

/**
 * 资源目录用户申请使用表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-10-25 15:00:44
 */
public interface ResourcesApplyService extends IService<ResourcesApply> {

    PageUtils queryPage(Map<String, Object> params);

    ResourcesApply queryById(Long id);

    Boolean insert(ResourcesApply resourcesApply);

    Boolean update(ResourcesApply resourcesApply);

    List<ResourcesApplyVO> queryResource(String name);
}

