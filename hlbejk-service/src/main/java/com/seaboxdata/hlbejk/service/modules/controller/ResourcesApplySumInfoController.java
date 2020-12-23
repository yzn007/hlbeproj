package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seaboxdata.api.controller.IResoureApplyInfoController;
import com.seaboxdata.api.dto.OrganizationDto;
import com.seaboxdata.api.dto.ResourceApplyInfoDto;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.hlbejk.service.modules.service.AccessAuditService;
import com.seaboxdata.hlbejk.service.modules.service.ResourceApplyInfoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


/**
 * 资源目录-申请使用资源汇总表
 *
 * @author zdl IResourcesApplySumInfoController
 * @email 492587402@qq.com
 * @date 2020-11-19 11:07:53
 */
@Api(tags = {"统计分析-资源申请情况"})
@RestController
public class ResourcesApplySumInfoController {

    @Autowired
    private IResoureApplyInfoController iResoureApplyInfoController;
    @Autowired
    private ResourceApplyInfoService resourceApplyInfoService;
	@Autowired
	private AccessAuditService accessAuditService;
    /**
     * 列表
     */
    @ApiOperation(value = "列表")
    @PostMapping("/template/resourcesapplysum/list")
	public PageUtils list(@RequestParam Map<String, Object> params) {
    	PageUtils page = resourceApplyInfoService.searchResourceApplyInfo(params);
    	return page;
	}
    
    /**
     * 详细信息
     */
    @ApiOperation(value = "详细信息")
    @PostMapping("/template/resourcesapplysum/info/{id}")
	public ResourceApplyInfoDto info(Long arg0) {
    	return iResoureApplyInfoController.getResourceApplyInfoDetails(arg0);
	}

    /**
     * 接入部门
     */
    @ApiOperation(value = "接入部门")
    @PostMapping("/select/accessApplyOrg")
    List<OrganizationDto> applyOrg(@RequestParam(value = "m") Boolean flg){
		return accessAuditService.selOrgNames(flg);
    }
}
