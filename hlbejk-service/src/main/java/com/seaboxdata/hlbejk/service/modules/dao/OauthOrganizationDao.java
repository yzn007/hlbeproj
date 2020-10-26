package com.seaboxdata.hlbejk.service.modules.dao;

import com.seaboxdata.hlbejk.api.vo.OauthOrganizationVO;
import com.seaboxdata.hlbejk.service.modules.entity.OauthOrganization;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 机构管理
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-10-25 17:24:45
 */
@Repository
@Mapper
public interface OauthOrganizationDao extends BaseMapper<OauthOrganization> {

    List<OauthOrganizationVO> quertDeptList(OauthOrganizationVO oauthOrganization);
}
