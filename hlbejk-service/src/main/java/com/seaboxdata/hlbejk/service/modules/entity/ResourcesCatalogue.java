package com.seaboxdata.hlbejk.service.modules.entity;

import com.baomidou.mybatisplus.annotation.*;
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

/**
 * 资源目录表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-12-23 14:10:42
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("resources_catalogue")
public class ResourcesCatalogue implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@TableId(value = "id", type = IdType.INPUT)
	private Long id;
	
	/**
	 * 租户id
	 */
	private Long tenantId;

	/**
	 * 创建者
	 */
	private Long creator;

	/**
	 * 修改者
	 */
	private Long modifier;

	/**
	 * 修改时间
	 */
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Date modifyTm;
	
	/**
	 * 创建时间
	 */
	@TableField(fill = FieldFill.INSERT)
	private Date createTm;
	
	/**
	 * 资源提供方部门id
	 */
	private Long organizationId;

	/**
	 * 资源提供方部门名称
	 */
	private String organizationName;

	/**
	 * 资源名称
	 */
	private String resourceName;

	/**
	 * 资源代码
	 */
	private String resourceCode;

	/**
	 * 来源
	 */
	private String sources;

	/**
	 * 资源简介
	 */
	private String resourceDesc;

	/**
	 * 信息资源格式类型
	 */
	private String infoSourceType;

	/**
	 * 资源拼音
	 */
	private String resourcePinyin;

	/**
	 * 信息资源格式分类
	 */
	private String infoSourceSort;

	/**
	 * 其他类型资源格式描述
	 */
	private String otherDescription;

	/**
	 * 是否纳入考核
	 */
	private Integer isAssessment;

	/**
	 * 资源分类表id
	 */
	private Long classificationId;

	/**
	 * 主题分类id(主题分类存储在资源分类表)
	 */
	private Long themeId;

	/**
	 * 是否是草稿状态
	 */
	private Integer draftStatus;

	/**
	 * 更新周期
	 */
	private String renewCycle;

	/**
	 * 共享方式分类
	 */
	private String shareSort;

	/**
	 * 共享条件
	 */
	private String shareAttr;

	/**
	 * 共享方式类型0为数据库 1为服务 2为文件
	 */
	private String shareType;

	/**
	 * 数据来源 1为目录编制 2为资源共享 3为资源目录管理
	 */
	private String dataSources;

	/**
	 * 是否删除
	 */
	private Integer delStatus;

	/**
	 * 关联类目及名称
	 */
	private String categoryName;

	/**
	 * 提供方内部部门
	 */
	private String interdepartName;

	/**
	 * 是否标准资源 0-否 1-是
	 */
	private Integer standardStatus;

	/**
	 * 发布日期
	 */
	private Date pushDate;

	/**
	 * 资源提供方代码
	 */
	private String provideCode;

	/**
	 * 资源是否可以修改共享方式
	 */
	private Integer accessModifyStatus;

	/**
	 * 是否在资源目录展示，默认为1
	 */
	private Integer isShowResources;

	/**
	 * 接入方式 0-数据库 1-服务 2-文件
	 */
	private Integer accessType;

	/**
	 * 
	 */
	private String remark;

	/**
	 * 共享条件
	 */
	private String shareReason;

	/**
	 * 开放属性
	 */
	private String openType;

	/**
	 * 是否接入 0-否 1-是
	 */
	private Integer accessStatus;

	/**
	 * 接入时间
	 */
	private Date accessDate;

	/**
	 * 审核状态
	 */
	private String reviewStatus;

	/**
	 * 是否发布 
	 */
	private Integer isPush;

	/**
	 * 资源编码
	 */
	private String resourcesEncode;

	/**
	 * 
	 */
	private Integer operateType;

	/**
	 * 是否能够同步数据至_push表
	 */
	private Integer isCanCopyData;

	/**
	 * 服务是否删除
	 */
	private Integer serviceDelStatus;

	/**
	 * 服务删除时间
	 */
	private Date serviceDelTime;


}
