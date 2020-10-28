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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApplytype() {
		return applytype;
	}

	public void setApplytype(String applytype) {
		this.applytype = applytype;
	}

	public String getApplylist() {
		return applylist;
	}

	public void setApplylist(String applylist) {
		this.applylist = applylist;
	}

	public String getApplystate() {
		return applystate;
	}

	public void setApplystate(String applystate) {
		this.applystate = applystate;
	}

	public String getApplytime() {
		return applytime;
	}

	public void setApplytime(String applytime) {
		this.applytime = applytime;
	}

	public String getApplymessage() {
		return applymessage;
	}

	public void setApplymessage(String applymessage) {
		this.applymessage = applymessage;
	}

	public String getSponsoruserid() {
		return sponsoruserid;
	}

	public void setSponsoruserid(String sponsoruserid) {
		this.sponsoruserid = sponsoruserid;
	}

	public String getSponsordeptrid() {
		return sponsordeptrid;
	}

	public void setSponsordeptrid(String sponsordeptrid) {
		this.sponsordeptrid = sponsordeptrid;
	}

	public String getRevieweruserid() {
		return revieweruserid;
	}

	public void setRevieweruserid(String revieweruserid) {
		this.revieweruserid = revieweruserid;
	}

	public String getReviewerdeptid() {
		return reviewerdeptid;
	}

	public void setReviewerdeptid(String reviewerdeptid) {
		this.reviewerdeptid = reviewerdeptid;
	}

	public String getRejectmessage() {
		return rejectmessage;
	}

	public void setRejectmessage(String rejectmessage) {
		this.rejectmessage = rejectmessage;
	}

	public String getUpdatetimes() {
		return updatetimes;
	}

	public void setUpdatetimes(String updatetimes) {
		this.updatetimes = updatetimes;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getFileid() {
		return fileid;
	}

	public void setFileid(String fileid) {
		this.fileid = fileid;
	}

	public String getReleaseurl() {
		return releaseurl;
	}

	public void setReleaseurl(String releaseurl) {
		this.releaseurl = releaseurl;
	}
}
