package com.seaboxdata.hlbejk.service.modules.service.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.api.enums.ReviewStatus;
import com.seaboxdata.authuc.api.service.AuthOrganizationService;
import com.seaboxdata.authuc.api.service.AuthUserCommonService;
import com.seaboxdata.authuc.api.vo.local.OauthOrganizationCommonVO;
import com.seaboxdata.authuc.api.vo.local.OauthUserCommonVO;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import com.seaboxdata.hlbejk.service.modules.constant.SysBlacklistSetConstant;
import com.seaboxdata.hlbejk.service.modules.dao.ResourceApplyInfoDao;
import com.seaboxdata.hlbejk.service.modules.entity.ResourceApplyListInfo;
import com.seaboxdata.hlbejk.service.modules.service.ResourceApplyInfoService;

import lombok.extern.slf4j.Slf4j;

/**
 * 资源申请情况统计查询
 *
 * @author cxh
 * @email cxh@163.com
 * @date 2020-03-06 22:32:22
 */
@Slf4j
@Service("resourceApplyInfoService")
@DS("corc")
public class ResourceApplyInfoServiceImpl extends ServiceImpl<ResourceApplyInfoDao, ResourceApplyListInfo> implements ResourceApplyInfoService {
	@Autowired
    private AuthOrganizationService authOrganizationService;
	@Autowired
	private AuthUserCommonService authUserCommonService;


    /**
     *  根据申请部门、申请用户、申请状态查询资源申请情况（带分页）
     * @param resourceApplyPageInput
     * @return: PaginationResult<ResourceApplyInfoDto>
     */
    @Override
    public PageUtils searchResourceApplyInfo (Map<String, Object> params) {
        log.info("searchResourceApplyInfo come into param ResourceApplyPageInput: {}", params);
        IPage<ResourceApplyListInfo> page = this.baseMapper.queryResource(new Query<ResourceApplyListInfo>().getPage(params), params);
        List<ResourceApplyListInfo> applyDtoList = page.getRecords().stream().map(items ->{
                    items.setApplyUserName("ss");
                    items.setOrganName("333");
                    items.setReviewStatusName("ee");
                    return items;
                }).collect(Collectors.toList());
        page.setRecords(applyDtoList);
        return new PageUtils(page);
    }

    
    
/**
 * 获得根据人员id 获得人员的姓名
 * @return 
 */
    private String getUserNameById (Long id){
    	String userName = "";
    	OauthUserCommonVO user = authUserCommonService.selectUserByUserId(id);
    	if(user!=null){
    		userName = user.getUsername();
    	}
    	return userName;
    }
    
    private String getOrganInfoById (Long id){
    	String orgName = "";
    	List<OauthOrganizationCommonVO> org = authOrganizationService.selectOrganizationByrganizationId(id);
    	if(org!=null&&org.size()>0){
    		orgName = org.get(0).getOrganizationName();
    	}
    	return orgName;
    }
    
    /**
     * 审核状态
     */
    public String getReviewStats(String stats) {
        log.info("getReviewStats come into param stats: {}", stats);
        String desc = "";
        ReviewStatus statusEnum = ReviewStatus.valueOf(stats);
        switch (statusEnum) {
            case REVIEW_PASSED:
                desc = SysBlacklistSetConstant.REVIEW_PASSED_DESC;
                break;
            case REVIEW_FAILD:
                desc = SysBlacklistSetConstant.REVIEW_FAILD_DESC;
                break;
            case UNREVIEWED:
                desc = SysBlacklistSetConstant.UNREVIEWED_DESC;
                break;
            case SECTION_PASSED:
                desc = SysBlacklistSetConstant.SECTION_PASSED_DESC;
                break;
            case REVOKE:
                desc = SysBlacklistSetConstant.REVOKE_DESC;
                break;
            default :
                desc = SysBlacklistSetConstant.REVIEW_FAILD_DESC;
        }
        return desc;
    }

}