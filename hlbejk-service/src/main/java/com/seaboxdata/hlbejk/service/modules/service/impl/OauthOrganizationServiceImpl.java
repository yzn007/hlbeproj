package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.api.vo.OauthOrganizationVO;
import com.seaboxdata.hlbejk.service.modules.dao.OauthOrganizationDao;
import com.seaboxdata.hlbejk.service.modules.service.OauthOrganizationService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;
import com.seaboxdata.hlbejk.service.modules.entity.OauthOrganization;


@Service("oauthOrganizationService")
@DS("corc")
public class OauthOrganizationServiceImpl extends ServiceImpl<OauthOrganizationDao, OauthOrganization> implements OauthOrganizationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OauthOrganization> page = this.page(
                new Query<OauthOrganization>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public OauthOrganization queryById(Long id) {
        OauthOrganization oauthOrganization = this.getById(id);
        return oauthOrganization;
    }

    @Override
    public Boolean insert(OauthOrganization oauthOrganization) {
        this.save(oauthOrganization);
        return true;
    }

    @Override
    public Boolean update(OauthOrganization oauthOrganization) {
        this.updateById(oauthOrganization);
        return true;
    }



    @Override
    public List<OauthOrganizationVO> quertDeptList(OauthOrganizationVO oauthOrganizationVO) {

        return super.baseMapper.quertDeptList(oauthOrganizationVO);
    }


}