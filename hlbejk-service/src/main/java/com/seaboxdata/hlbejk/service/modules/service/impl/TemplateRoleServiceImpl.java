package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.seaboxdata.authuc.api.service.AuthRoleCommonService;
import com.seaboxdata.authuc.api.vo.local.OauthRoleCommonVO;
import com.seaboxdata.hlbejk.api.vo.RoleVO;
import com.seaboxdata.hlbejk.service.modules.mapstruct.AuthCommonsMapstruct;
import com.seaboxdata.hlbejk.service.modules.service.TemplateRoleService;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class TemplateRoleServiceImpl implements TemplateRoleService {
    @Autowired
    private AuthRoleCommonService authRoleCommonService;

    @Override
    public List<RoleVO> querRoleVOs() {

        List<OauthRoleCommonVO> roleCommonVOS = authRoleCommonService.selectAllRole();
        List<RoleVO> queryRoles = new ArrayList<>();
        for(OauthRoleCommonVO commonVO : roleCommonVOS){
            queryRoles.add(AuthCommonsMapstruct.INSTANCE.toRoleVO(commonVO));
        }
        List<RoleVO> toRoles = new ArrayList<>();
        this.createRolesTrees(toRoles, queryRoles, NumberUtils.LONG_ZERO);
        return toRoles;
    }

    private void createRolesTrees(List<RoleVO> toRoles, List<RoleVO> fromRoles, Long parentId){
        for(RoleVO VO : fromRoles){
            if(parentId.equals(VO.getParentId())){
                List<RoleVO> children = new ArrayList<>();
                this.createRolesTrees(children, fromRoles, VO.getId());
                if(children.size() > 0){
                    VO.setChildren(children);
                }
                toRoles.add(VO);
            }
        }
    }

}
