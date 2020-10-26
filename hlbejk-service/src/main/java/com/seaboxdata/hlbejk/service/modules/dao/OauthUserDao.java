package com.seaboxdata.hlbejk.service.modules.dao;

import com.seaboxdata.hlbejk.api.vo.OauthUserVO;
import com.seaboxdata.hlbejk.service.modules.entity.OauthUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * 用户信息表
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-10-25 19:53:33
 */
@Repository
@Mapper
public interface OauthUserDao extends BaseMapper<OauthUser> {

    List<OauthUserVO> quertUserList(OauthUserVO oauthUserVO);
}
