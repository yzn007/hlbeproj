package com.seaboxdata.hlbejk.service.utils;

import com.seaboxdata.commons.provider.utils.LoginUserVO;
import com.seaboxdata.commons.provider.utils.UserUtils;

public class OnlineUserUtils {

    public static LoginUserVO user(){
        return UserUtils.onlineUser();
//        LoginUserVO vo = new LoginUserVO();
//        vo.setUserId(1L);
//        vo.setTenantId(1L);
//        return vo;
    }

}
