package com.seaboxdata.hlbejk.api.vo;

import com.baomidou.mybatisplus.annotation.*;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
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
 * 模型申请表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ModelapplyinfoVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键")
		private String id;
	
	/**
	 * 模型名称
	 */
	@ApiModelProperty(value = "模型名称")
	private String modelname;

	/**
	 * 模型地址
	 */
	@ApiModelProperty(value = "模型地址")
	private String modeladdr;

	/**
	 * 申请时间
	 */
	@ApiModelProperty(value = "申请时间")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date applydate;

	/**
	 * 审批状态
	 */
	@ApiModelProperty(value = "审批状态")
	private String approvalstate;

	/**
	 * 模型调用时段
	 */
	@ApiModelProperty(value = "模型调用时段")
	private String modelcallperiod;

	/**
	 * 模型使用权限
	 */
	@ApiModelProperty(value = "模型使用权限")
	private String modelauthor;

	/**
	 * 用户监控Id
	 */
	@ApiModelProperty(value = "用户监控Id")
	private String monitorid;
	/**
	 * 用户id
	 */
	@ApiModelProperty(value="用户id")
	private String userId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public String getModeladdr() {
		return modeladdr;
	}

	public void setModeladdr(String modeladdr) {
		this.modeladdr = modeladdr;
	}

	public Date getApplydate() {
		return applydate;
	}

	public void setApplydate(Date applydate) {
		this.applydate = applydate;
	}

	public String getApprovalstate() {
		return approvalstate;
	}

	public void setApprovalstate(String approvalstate) {
		this.approvalstate = approvalstate;
	}

	public String getModelcallperiod() {
		return modelcallperiod;
	}

	public void setModelcallperiod(String modelcallperiod) {
		this.modelcallperiod = modelcallperiod;
	}

	public String getModelauthor() {
		return modelauthor;
	}

	public void setModelauthor(String modelauthor) {
		this.modelauthor = modelauthor;
	}

	public String getMonitorid() {
		return monitorid;
	}

	public void setMonitorid(String monitorid) {
		this.monitorid = monitorid;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
