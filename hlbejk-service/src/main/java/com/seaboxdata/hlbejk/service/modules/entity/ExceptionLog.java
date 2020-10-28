package com.seaboxdata.hlbejk.service.modules.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("exception_log")
public class ExceptionLog implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String excId;
	private String excRequParam; // 请求参数
	private String excName; // 异常名称
	private String excMessage; // 异常信息
	private String operMethod; // 请求方法名
	private String operUserId; // 操作员ID
	private String operUserName; // 操作员名称
	private String operUri; // 操作URI
	private String operIp; // 操作员IP
	private String operVer; // 操作版本号
	@TableField(fill = FieldFill.INSERT)
	private Date operCreateTime; // 发生异常时间
}