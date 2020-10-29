package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import com.seaboxdata.authuc.api.service.AuthUserInService;
import com.seaboxdata.authuc.api.vo.local.OauthUserInfoCommonVO;
import com.seaboxdata.hlbejk.api.controller.IApplicationapplyController;
import com.seaboxdata.hlbejk.api.vo.ApplicationapplyVO;
import com.seaboxdata.hlbejk.common.utils.annotation.OperLog;
import com.seaboxdata.hlbejk.service.modules.entity.Applicationapply;
import com.seaboxdata.hlbejk.service.modules.enums.OperateType;
import com.seaboxdata.hlbejk.service.modules.service.ApplicationapplyService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.hlbejk.service.utils.DateToolsUtils;
import com.seaboxdata.hlbejk.service.utils.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 应用申请表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-10-12 15:03:27
 */
@RestController
public class ApplicationapplyController implements IApplicationapplyController{

    @Autowired
    private ApplicationapplyService applicationapplyService;
    @Autowired
    private AuthUserInService authUserInService;
    /**
     * 列表delete
     */
    @OperLog(operModul = "查询应用申请列表",operType = OperateType.QUERY,operDesc = "查询应用申请列表")
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = applicationapplyService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @OperLog(operModul = "查询应用申请信息",operType = OperateType.QUERY,operDesc = "根据id查询应用申请信息")
    @Override
    public ApplicationapplyVO info(@PathVariable("id") String id){
        Applicationapply applicationapply = applicationapplyService.queryById(id);
        ApplicationapplyVO applicationapplyVO = new ApplicationapplyVO();
        BeanUtils.copyProperties(applicationapply, applicationapplyVO);
        return applicationapplyVO;
    }

    /**
     * 保存
     */
    @OperLog(operModul = "新增应用申请信息",operType = OperateType.ADD,operDesc = "新增应用申请信息")
    @Override
    public Boolean save(@RequestBody ApplicationapplyVO applicationapplyVO){
        Applicationapply applicationapply = new Applicationapply();
        BeanUtils.copyProperties(applicationapplyVO, applicationapply);
        applicationapply.setId(UUIDUtils.getUUID());
        applicationapply.setApplystate("0");
        applicationapply.setApplytime(DateToolsUtils.toDataStr(new Date(),"yyyy-MM-dd HH:mm:ss"));
        OauthUserInfoCommonVO loginUser = authUserInService.getLoginUser();
        //演示需要，默认假部门
        applicationapply.setRevieweruserid("206659250594910208");
        applicationapply.setReviewerdeptid("1");
        //申请人id
        Long sponsorUserId = loginUser.getId();
        //部门id
        applicationapply.setSponsoruserid(sponsorUserId+"");
        applicationapply.setSponsordeptrid("2");

        return applicationapplyService.insert(applicationapply);
    }

    /**
     * 修改
     */
    @OperLog(operModul = "更新应用申请信息",operType = OperateType.UPDATE,operDesc = "更新应用申请信息")
    @Override
    public Boolean update(@RequestBody ApplicationapplyVO applicationapplyVO){
        Applicationapply applicationapply = new Applicationapply();
        BeanUtils.copyProperties(applicationapplyVO, applicationapply);
        if(!"".equals(applicationapply.getApplystate())){
            //更新时间
            applicationapply.setUpdatetimes(DateToolsUtils.toDataStr(new Date(),"yyyy-MM-dd HH:mm:ss"));
        }
        return applicationapplyService.update(applicationapply);
    }

    /**
     * 删除
     */
    @OperLog(operModul = "删除应用申请信息",operType = OperateType.DELETE,operDesc = "删除应用申请信息")
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return applicationapplyService.removeByIds(Arrays.asList(ids));
    }

}
