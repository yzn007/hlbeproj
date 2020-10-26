package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.hlbejk.service.modules.entity.OauthOrganization;
import com.seaboxdata.commons.core.util.api.PageUtils;

import java.util.List;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.OauthOrganizationVO;
import com.seaboxdata.hlbejk.service.modules.entity.OauthOrganization;

/**
 * 机构管理
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-10-25 17:24:45
 */
public interface OauthOrganizationService extends IService<OauthOrganization> {

    PageUtils queryPage(Map<String, Object> params);

    OauthOrganization queryById(Long id);

    Boolean insert(OauthOrganization oauthOrganization);

    Boolean update(OauthOrganization oauthOrganization);

    List<OauthOrganizationVO> quertDeptList(OauthOrganizationVO oauthOrganizationVO);
}

