package com.seaboxdata.hlbejk.service.modules.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.hlbejk.service.modules.entity.ResourceApplyListInfo;

/**
 * 资源目录用户申请使用表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-17 14:37:23
 */
public interface ResourceApplyInfoService extends IService<ResourceApplyListInfo> {
	 /**
     * 根据申请部门、申请用户、申请状态查询资源申请情况（带分页）
     * @param resourceApplyPageInput
     * @return: PaginationResult
     */
    PageUtils searchResourceApplyInfo(Map<String, Object> params);
}

