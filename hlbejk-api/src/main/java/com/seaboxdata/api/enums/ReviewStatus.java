package com.seaboxdata.api.enums;

/**
 * @author sqq
 * @version 1.0.0
 * @ClassName ReviewStatus
 * @Description 审核状态
 * @createTime 2020/1/7
 */
public enum ReviewStatus {
	REVIEW_PASSED,//审核通过
	REVIEW_FAILD, //审核未通过
	UNREVIEWED, //未审核
	SECTION_PASSED, //部分通过审核
	REVOKE,// 撤销(部门管理员的操作)
	//RECALL,// 撤回(用户自己的操作)
	ALL, //接入审核已处理标识
	REJECT//驳回
}
