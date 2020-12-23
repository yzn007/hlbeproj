package com.seaboxdata.api.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.seaboxdata.api.dto.ResourceApplyInfoDto;
import com.seaboxdata.api.dto.ResourceApplyListInfoDto;
import com.seaboxdata.api.input.ResourceApplyPageInput;
import com.seaboxdata.commons.constant.query.PaginationResult;
import com.seaboxdata.hlbejk.api.FeignClientConfig;

/**
 * 统计查询资源申请 *
 * 
 * @author cxh
 * @email cxh@163.com
 * @date 2020-03-06 22:32:22
 */
@FeignClient(contextId = "ResourceApplyInfoStat", name = FeignClientConfig.RSP_NAME, url = FeignClientConfig.RSP_URL, configuration = FeignClientsConfiguration.class)
public interface IResoureApplyInfoController {

	/**
	 * 根据申请部门、申请用户、申请状态查询资源申请情况（带分页）
	 * 
	 * @return: PaginationResult<ResourceApplyDto>
	 */
	@GetMapping("/resourceApplyListInfo/pages")
	PaginationResult<ResourceApplyListInfoDto> searchResourceApplyInfo(
			@RequestBody ResourceApplyPageInput resourceApplyPageInput);

	/**
	 * 根据Id主键查询资源申请的历史详情
	 * 
	 * @param id
	 * @return: ResourceApplyDto
	 */
	@GetMapping("/resourceApplyInfo/details")
	ResourceApplyInfoDto getResourceApplyInfoDetails(@RequestParam("id") Long id);

}
