package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.hlbejk.service.modules.entity.OauthUser;
import com.seaboxdata.commons.core.util.api.PageUtils;

import java.util.List;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.OauthUserVO;
import com.seaboxdata.hlbejk.service.modules.entity.OauthUser;

/**
 * 用户信息表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-10-25 19:53:33
 */
public interface OauthUserService extends IService<OauthUser> {

    PageUtils queryPage(Map<String, Object> params);

    OauthUser queryById(Long id);

    Boolean insert(OauthUser oauthUser);

    Boolean update(OauthUser oauthUser);

    List<OauthUserVO> quertUserList(OauthUserVO oauthUserVO);
}

