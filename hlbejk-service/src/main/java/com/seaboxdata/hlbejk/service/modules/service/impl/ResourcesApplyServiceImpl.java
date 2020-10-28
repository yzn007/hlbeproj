package com.seaboxdata.hlbejk.service.modules.service.impl;

import cn.hutool.core.map.CaseInsensitiveMap;
import cn.hutool.db.sql.Order;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.api.vo.ResourcesApplyVO;
import com.seaboxdata.hlbejk.service.modules.dao.ResourcesApplyDao;
import com.seaboxdata.hlbejk.service.modules.entity.OauthOrganization;
import com.seaboxdata.hlbejk.service.modules.entity.Operationlogs;
import com.seaboxdata.hlbejk.service.modules.service.ResourcesApplyService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
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
        IPage<ResourcesApply> page = this.getQuery(params);
        return new PageUtils(page);
    }

    private  IPage<ResourcesApply> getQuery(Map<String, Object> params){
        Map<String, Object> params2 = new HashMap<String,Object>();
        if(null!=params.get("page") && !"".equals(params.get("page"))
                && null!=params.get("limit") && !"".equals(params.get("limit"))){
            int limit = Integer.parseInt(params.get("limit").toString());
            int pages =  Integer.parseInt(params.get("page").toString());
            params2.put("offSet",(pages-1) * limit);
            params2.put("limit",limit);
        }
        if(null!=params.get("key") && !"".equals(params.get("key"))){
            params2.put("key",params.get("key"));
        }
        IPage<ResourcesApply> page = this.page(
                new Query<ResourcesApply>().getPage(params),
                new QueryWrapper<>()
        );
        List <ResourcesApplyVO>list = queryResource(params2);
        List<ResourcesApply> arrayRet = new ArrayList<>();
        for(ResourcesApplyVO resourcesApplyVo:list){
            arrayRet.add(ResourcesApply.toEntity(resourcesApplyVo));
        }
        page.setRecords(arrayRet);
        return page;
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
    public List<ResourcesApplyVO> queryResource(Map<String, Object> param) {
        return this.baseMapper.queryResource(param);
    }
}