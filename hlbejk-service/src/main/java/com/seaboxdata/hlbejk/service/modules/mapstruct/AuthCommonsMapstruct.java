package com.seaboxdata.hlbejk.service.modules.mapstruct;

import com.seaboxdata.authuc.api.vo.local.OauthRoleCommonVO;


import com.seaboxdata.hlbejk.api.vo.RoleVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthCommonsMapstruct {

    AuthCommonsMapstruct INSTANCE = Mappers.getMapper(AuthCommonsMapstruct.class);

    RoleVO toRoleVO(OauthRoleCommonVO commonVO);

}
