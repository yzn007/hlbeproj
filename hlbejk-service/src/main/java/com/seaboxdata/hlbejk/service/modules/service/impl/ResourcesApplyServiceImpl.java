package com.seaboxdata.hlbejk.service.modules.service.impl;

import cn.hutool.core.map.CaseInsensitiveMap;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.api.vo.ResourcesApplyVO;
import com.seaboxdata.hlbejk.service.modules.dao.ResourcesApplyDao;
import com.seaboxdata.hlbejk.service.modules.entity.OauthOrganization;
import com.seaboxdata.hlbejk.service.modules.service.ResourcesApplyService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.seaboxdata.hlbejk.service.modules.entity.ResourcesApply;


@Service("resourcesApplyService")
@DS("corc")
public class ResourcesApplyServiceImpl extends ServiceImpl<ResourcesApplyDao, ResourcesApply> implements ResourcesApplyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        QueryWrapper queryWrapper = new QueryWrapper();
        if(null != params.get("key") && !"".equals(params.get("key"))){
            queryWrapper.like("create_organ", params.get("key"));
        }
        IPage<ResourcesApply> page = this.page(
                new Query<ResourcesApply>().getPage(params),
                queryWrapper
        );
        if(null != params.get("key") && !"".equals(params.get("key"))){
            List <ResourcesApplyVO>list = queryResource(params.get("key").toString());
            List<ResourcesApply> arrayRet = new ArrayList<>();
            for(ResourcesApplyVO resourcesApplyVo:list){
                arrayRet.add(ResourcesApply.toEntity(resourcesApplyVo));
            }
            page.setRecords(arrayRet);
        }

        return new PageUtils(page);
    }



    @Override
    public ResourcesApply queryById(Long id) {
        ResourcesApply resourcesApply = this.getById(id);
        return resourcesApply;
    }

    @Override
    public Boolean insert(ResourcesApply resourcesApply) {
        this.save(resourcesApply);
        return true;
    }

    @Override
    public Boolean update(ResourcesApply resourcesApply) {
        this.updateById(resourcesApply);
        return true;
    }

    @Override
    public List<ResourcesApplyVO> queryResource(String name) {
        Map<String, Object> param = new CaseInsensitiveMap<>();
        param.put("name", name);
        return this.baseMapper.queryResource(param);
    }
}