package com.seaboxdata.api.input;

import com.seaboxdata.api.enums.ReviewStatus;
import com.seaboxdata.commons.core.query.PaginationQueryInput;

import lombok.Data;

/**
 * 资源申请情况统计查询
 *
 * @author cxh
 * @email cxh@163.com
 * @date 2020-03-06 22:32:22
 */
@Data
public class ResourceApplyPageInput extends PaginationQueryInput {

	 /*申请状态*/
	private ReviewStatus reviewStatus;

    /*申请部门*/
	private Long createOrgan;

	/**申请人编号*/
	private Long creator;

    /**资源名称*/
	private String resourceName;

	private Long id;



}
