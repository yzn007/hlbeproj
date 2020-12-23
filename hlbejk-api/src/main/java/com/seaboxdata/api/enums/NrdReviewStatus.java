package com.seaboxdata.api.enums;

/**
 * @author sqq
 * @version 1.0.0
 * @ClassName ReviewStatus
 * @Description 审核状态
 * @createTime 2020/1/7
 */
public enum NrdReviewStatus {
    REVIEW_PASSED, //审核通过
    REVIEW_FAILD, //审核未通过
    ROOT_REVIEW_FAILD, //平台管理员驳回
    UNREVIEWED, //未审核
    REVIEW_ING ,//审核中
    REVOKE// 撤销(部门管理员的操作)
}
