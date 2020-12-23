package com.seaboxdata.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 资源申请情况统计查询(详情信息)
 *
 * @author cxh
 * @email cxh@163.com
 * @date 2020-03-06 22:32:22
 */
@Data
public class ResourceApplyInfoDto implements Serializable {

	//部门内部审核
	private ApplyInfoDetailsDto innerReview;
	//其他部门审核
	private ApplyInfoDetailsDto otherReview;

	//无条件共享
	private ApplyInfoDetailsDto noReview;

	//申请信息
	private ResourceApplyListInfoDto applyListInfo;

}
