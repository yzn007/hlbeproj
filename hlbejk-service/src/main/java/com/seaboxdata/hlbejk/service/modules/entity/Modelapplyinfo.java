package com.seaboxdata.hlbejk.service.modules.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.annotation.*;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.ToString;
import org.springframework.data.annotation.Transient;

import java.time.LocalDateTime;
import java.util.Date;

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
@TableName("modelapplyinfo")
public class Modelapplyinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId(value = "id", type = IdType.INPUT)
	private String id;
	
	/**
	 * 模型名称
	 */
	private String modelname;

	/**
	 * 模型地址
	 */
	private String modeladdr;

	/**
	 * 申请时间
	 */
	private Date applydate;

	/**
	 * 审批状态
	 */
	private String approvalstate;

	/**
	 * 模型调用时段
	 */
	private String modelcallperiod;

	/**
	 * 模型使用权限
	 */
	private String modelauthor;

	/**
	 * 用户监控Id
	 */
	private String monitorid;

	/**
	 * 用户id
	 */
	@Transient
	private transient String userId;

}
