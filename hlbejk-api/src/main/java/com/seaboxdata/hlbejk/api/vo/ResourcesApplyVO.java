package com.seaboxdata.hlbejk.api.vo;

import com.baomidou.mybatisplus.annotation.*;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
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
 * 资源目录用户申请使用表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-10-25 15:00:44
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ResourcesApplyVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@ApiModelProperty(value = "")
		private Long id;
	
	/**
	 * 资源信息主键id
	 */
	@ApiModelProperty(value = "资源信息主键id")
	private Long resourcesCatalogueId;

	/**
	 * 是否用于系统建设 0:不是 1:是
	 */
	@ApiModelProperty(value = "是否用于系统建设 0:不是 1:是")
	private Integer isUsedSystem;

	/**
	 * 系统名称
	 */
	@ApiModelProperty(value = "系统名称")
	private String systemName;

	/**
	 * 申请理由
	 */
	@ApiModelProperty(value = "申请理由")
	private String applyReason;

	/**
	 * 租户id
	 */
	@ApiModelProperty(value = "租户id")
	private Long tenantId;

	/**
	 * 创建者
	 */
	@ApiModelProperty(value = "创建者")
	private Long creator;

	/**
	 * 修改者
	 */
	@ApiModelProperty(value = "修改者")
	private Long modifier;

	/**
	 * 修改时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "修改时间")
		private Date modifyTm;
	
	/**
	 * 创建时间
	 */
	@ApiModelProperty(value = "创建时间")
		private Date createTm;
	
	/**
	 * 审核状态
	 */
	@ApiModelProperty(value = "审核状态")
	private String reviewStatus;

	/**
	 * 申请人部门
	 */
	@ApiModelProperty(value = "申请人部门")
	private Long createOrgan;

	/**
	 * 是否删除
	 */
	@ApiModelProperty(value = "是否删除")
	private Integer delStatus;

	/**
	 * 流程id
	 */
	@ApiModelProperty(value = "流程id")
	private String taskId;

	/**
	 * 资源所属部门
	 */
	@ApiModelProperty(value = "资源所属部门")
	private Long resourceOrgan;

	/**
	 * 所属流程类型 分为不走流程 内部  外部
	 */
	@ApiModelProperty(value = "所属流程类型 分为不走流程 内部  外部")
	private String taskType;

	/**
	 * 个人申请使用资源汇总表
	 */
	@ApiModelProperty(value = "个人申请使用资源汇总表")
	private Long applySumId;

	/**
	 * 分组id，只有走外部审批的数据才需要
	 */
	@ApiModelProperty(value = "分组id，只有走外部审批的数据才需要")
	private Long groupId;

	/**
	 * 内部分组id
	 */
	@ApiModelProperty(value = "内部分组id")
	private Long deptGroupId;

	@ApiModelProperty(value = "资源名称")
	private String 	resourceName;


	/**
	 * 是否使用部门资源池数据
	 */
	@ApiModelProperty(value = "是否使用部门资源池数据")
	private Integer isUsedDepRes;


	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getResourcesCatalogueId() {
		return resourcesCatalogueId;
	}

	public void setResourcesCatalogueId(Long resourcesCatalogueId) {
		this.resourcesCatalogueId = resourcesCatalogueId;
	}

	public Integer getIsUsedSystem() {
		return isUsedSystem;
	}

	public void setIsUsedSystem(Integer isUsedSystem) {
		this.isUsedSystem = isUsedSystem;
	}

	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getApplyReason() {
		return applyReason;
	}

	public void setApplyReason(String applyReason) {
		this.applyReason = applyReason;
	}

	public Long getTenantId() {
		return tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

	public Long getCreator() {
		return creator;
	}

	public void setCreator(Long creator) {
		this.creator = creator;
	}

	public Long getModifier() {
		return modifier;
	}

	public void setModifier(Long modifier) {
		this.modifier = modifier;
	}

	public Date getModifyTm() {
		return modifyTm;
	}

	public void setModifyTm(Date modifyTm) {
		this.modifyTm = modifyTm;
	}

	public Date getCreateTm() {
		return createTm;
	}

	public void setCreateTm(Date createTm) {
		this.createTm = createTm;
	}

	public String getReviewStatus() {
		return reviewStatus;
	}

	public void setReviewStatus(String reviewStatus) {
		this.reviewStatus = reviewStatus;
	}

	public Long getCreateOrgan() {
		return createOrgan;
	}

	public void setCreateOrgan(Long createOrgan) {
		this.createOrgan = createOrgan;
	}

	public Integer getDelStatus() {
		return delStatus;
	}

	public void setDelStatus(Integer delStatus) {
		this.delStatus = delStatus;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public Long getResourceOrgan() {
		return resourceOrgan;
	}

	public void setResourceOrgan(Long resourceOrgan) {
		this.resourceOrgan = resourceOrgan;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public Long getApplySumId() {
		return applySumId;
	}

	public void setApplySumId(Long applySumId) {
		this.applySumId = applySumId;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getDeptGroupId() {
		return deptGroupId;
	}

	public void setDeptGroupId(Long deptGroupId) {
		this.deptGroupId = deptGroupId;
	}

	public Integer getIsUsedDepRes() {
		return isUsedDepRes;
	}

	public void setIsUsedDepRes(Integer isUsedDepRes) {
		this.isUsedDepRes = isUsedDepRes;
	}
}
