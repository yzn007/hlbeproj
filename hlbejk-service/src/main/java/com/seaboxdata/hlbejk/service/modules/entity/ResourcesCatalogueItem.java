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
 * 资源目录-资源信息项表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-12-23 14:12:08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("resources_catalogue_item")
public class ResourcesCatalogueItem implements Serializable {
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
	 * 资源目录表主键id
	 */
	private Long resourcesId;

	/**
	 * 数据来源 1为目录编制 2为资源共享 3为资源目录管理
	 */
	private String dataSources;

	/**
	 * 信息项名称
	 */
	private String name;

	/**
	 * 数据类型
	 */
	private String dataType;

	/**
	 * 数据长度
	 */
	private String dataLength;

	/**
	 * 共享类型
	 */
	private String shareAttr;

	/**
	 * 共享条件（只有为有条件共享时才有此字段）
	 */
	private String shareReason;

	/**
	 * 数据库字段名(如果不是数据库接入，则为映射字段)
	 */
	private String dbFiledName;

	/**
	 * 数据库字段类型
	 */
	private String dbFiledType;

	/**
	 * 数据库字段长度
	 */
	private String dbFiledLength;

	/**
	 * 发布状态
	 */
	private String isPush;

	/**
	 * 是否向社会开放
	 */
	private Integer isOpenSociety;

	/**
	 * 开放条件
	 */
	private String openSocietyConditions;

	/**
	 * 永不超时
	 */
	private String noTimeOut;

	/**
	 * 考核时间
	 */
	private Date testTime;

	/**
	 * 敏感数据屏蔽
	 */
	private String sensitiveDataMasking;

	/**
	 * 是否删除
	 */
	private Integer delStatus;

	/**
	 * 是否为标准字段
	 */
	private Integer standardfieldStatus;

	/**
	 * 是否发布
	 */
	private Integer isPublish;

	/**
	 * 排序
	 */
	private Integer itemOrder;

	/**
	 * 考核时间
	 */
	private Date timeOut;


}
