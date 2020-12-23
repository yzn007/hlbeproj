package com.seaboxdata.api.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 资源申请情况统计查询
 *
 * @author cxh
 * @email cxh@163.com
 * @date 2020-03-06 22:32:22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ResourceApplyListInfoDto implements Serializable {

	private static final long serialVersionUID = -8890173237055323565L;

	/**
	 * 资源信息主键id
	 */
	private Long id;

	private Long creator;

	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	private LocalDateTime createTm;
	private String reviewStatus;
	private Long createOrgan;
	private int delStatus;

	/**
	 * 资源名称
	 */
	private String resourceName;

	/**
	 * 资源代码
	 */
	private String resourceCode ;

	/**
	 * 申请部门名称
	 */

	private String organName ;

	/**
	 * 资源提供方部门编号
	 */
	private Integer organizationId;
	/**
	 * 资源提供方部门名称
	 * */
	private String organizationName;
	/**
	 * 申请人姓名
	 * */
	private String applyUserName;

    /**
     *  审核人
     */
    private Long reviewUserId;

	/**
	 *  审核人名称
	 */
	private String reviewerName;

	/**
	 * 审核人机构
	 * */

	private Long reviewDeptId;

	/**
	 * 审核状态名称
	 * */
	private String reviewStatusName;

	/**申请理由
	 */
	private String applyReason;

	/**申请字段
	 */
	private List<FieldNameInfoDto> fieldNames;
	/**
	 * 审核人手机号
	 * */
	private String phone;




}
