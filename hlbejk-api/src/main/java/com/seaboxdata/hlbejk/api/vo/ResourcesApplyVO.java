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

	/**
	 * 是否使用部门资源池数据
	 */
	@ApiModelProperty(value = "是否使用部门资源池数据")
	private Integer isUsedDepRes;


}
