package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.IResourcesApplyController;
import com.seaboxdata.hlbejk.api.vo.OauthOrganizationVO;
import com.seaboxdata.hlbejk.api.vo.OauthUserVO;
import com.seaboxdata.hlbejk.api.vo.ResourcesApplyVO;
import com.seaboxdata.hlbejk.service.modules.entity.OauthOrganization;
import com.seaboxdata.hlbejk.service.modules.entity.OauthUser;
import com.seaboxdata.hlbejk.service.modules.entity.ResourcesApply;
import com.seaboxdata.hlbejk.service.modules.service.OauthOrganizationService;
import com.seaboxdata.hlbejk.service.modules.service.OauthUserService;
import com.seaboxdata.hlbejk.service.modules.service.ResourcesApplyService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 资源目录用户申请使用表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-10-25 15:00:44
 */
@RestController
public class ResourcesApplyController implements IResourcesApplyController{

    @Autowired
    private ResourcesApplyService resourcesApplyService;

    @Autowired
    private OauthOrganizationService oauthOrganizationService;

    @Autowired
    private OauthUserService oauthUserService;
    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = resourcesApplyService.queryPage(params);
        return page;
    }

    @Override
    public List<OauthOrganizationVO> getDeptList(Map<String, Object> params) {
        List<OauthOrganizationVO> list = oauthOrganizationService.quertDeptList(new OauthOrganizationVO());
        return list;
    }

    @Override
    public List<OauthUserVO> getUserList(Map<String, Object> params) {

        List<OauthUserVO> list = oauthUserService.quertUserList(new OauthUserVO());
        System.out.println(list);
        return list;
    }


    /**
     * 信息
     */
    @Override
    public ResourcesApplyVO info(@PathVariable("id") Long id){
        ResourcesApply resourcesApply = resourcesApplyService.queryById(id);
        ResourcesApplyVO resourcesApplyVO = new ResourcesApplyVO();
        BeanUtils.copyProperties(resourcesApply, resourcesApplyVO);
        return resourcesApplyVO;
    }

    /**
     * 保存
     */
    @Override
    public Boolean save(@RequestBody ResourcesApplyVO resourcesApplyVO){
        ResourcesApply resourcesApply = new ResourcesApply();
        BeanUtils.copyProperties(resourcesApplyVO, resourcesApply);
        return resourcesApplyService.insert(resourcesApply);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody ResourcesApplyVO resourcesApplyVO){
        ResourcesApply resourcesApply = new ResourcesApply();
        BeanUtils.copyProperties(resourcesApplyVO, resourcesApply);
        return resourcesApplyService.update(resourcesApply);
    }

    /**
     * 删除
     */
    @Override
    public Boolean delete(@RequestBody Long[] ids){
        return resourcesApplyService.removeByIds(Arrays.asList(ids));
    }

}
