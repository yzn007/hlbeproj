package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.api.vo.OauthUserVO;
import com.seaboxdata.hlbejk.service.modules.dao.OauthUserDao;
import com.seaboxdata.hlbejk.service.modules.service.OauthUserService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;
import com.seaboxdata.hlbejk.service.modules.entity.OauthUser;


@Service("oauthUserService")
@DS("corc")
public class OauthUserServiceImpl extends ServiceImpl<OauthUserDao, OauthUser> implements OauthUserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OauthUser> page = this.page(
                new Query<OauthUser>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public OauthUser queryById(Long id) {
        OauthUser oauthUser = this.getById(id);
        return oauthUser;
    }

    @Override
    public Boolean insert(OauthUser oauthUser) {
        this.save(oauthUser);
        return true;
    }

    @Override
    public Boolean update(OauthUser oauthUser) {
        this.updateById(oauthUser);
        return true;
    }

    @Override
    public List<OauthUserVO> quertUserList(OauthUserVO oauthUserVO) {
        return super.baseMapper.quertUserList(oauthUserVO);
    }

}