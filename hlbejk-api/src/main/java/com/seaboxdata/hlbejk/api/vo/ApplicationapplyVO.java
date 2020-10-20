package com.seaboxdata.hlbejk.api.vo;

import com.baomidou.mybatisplus.annotation.*;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.ToString;
import java.time.LocalDateTime;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;

/**
 * 应用申请表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-10-12 15:03:27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ApplicationapplyVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键")
		private String id;
	
	/**
	 * 申请类型
	 */
	@ApiModelProperty(value = "申请类型")
	private String applytype;

	@ApiModelProperty(value = "申请列表")
	private String applylist;
	/**
	 * 申请状态：0审核中，1审核通过，2驳回
	 */
	@ApiModelProperty(value = "申请状态：0审核中，1审核通过，2驳回")
	private String applystate;

	/**
	 * 申请时间
	 */
	@ApiModelProperty(value = "申请时间")
	private String applytime;

	/**
	 * 申请说明信息
	 */
	@ApiModelProperty(value = "申请说明信息")
	private String applymessage;

	/**
	 * 发起人id
	 */
	@ApiModelProperty(value = "发起人id")
	private String sponsoruserid;

	/**
	 * 发起人部门
	 */
	@ApiModelProperty(value = "发起人部门")
	private String sponsordeptrid;

	/**
	 * 审核人id
	 */
	@ApiModelProperty(value = "审核人id")
	private String revieweruserid;

	/**
	 * 审核部门
	 */
	@ApiModelProperty(value = "审核部门")
	private String reviewerdeptid;

	/**
	 * 驳回理由
	 */
	@ApiModelProperty(value = "驳回理由")
	private String rejectmessage;

	/**
	 * 更新状态时间
	 */
	@ApiModelProperty(value = "更新状态时间")
	private String updatetimes;

	/**
	 * 备注
	 */
	@ApiModelProperty(value = "备注")
	private String remarks;

	@ApiModelProperty(value = "文件id")
	private String fileid;


	/**
	 * 应用发布地址
	 */
	@ApiModelProperty(value = "应用发布地址")
	private String releaseurl;

}
