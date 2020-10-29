package com.seaboxdata.hlbejk.api.vo;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OperationLogVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "主键ID")
	private String operId; // 主键ID
	
	@ApiModelProperty(value = "操作模块")
	private String operModul; // 操作模块
	
	@ApiModelProperty(value = "操作类型")
	private String operType; // 操作类型
	
	@ApiModelProperty(value = "操作描述")
	private String operDesc; // 操作描述
	
	@ApiModelProperty(value = "请求方法")
	private String operMethod; // 请求方法
	
	@ApiModelProperty(value = "请求参数")
	private String operRequParam; // 请求参数
	
	@ApiModelProperty(value = "主键")
	private String operRespParam; // 返回结果
	
	@ApiModelProperty(value = "求用户ID")
	private String operUserId; // 请求用户ID
	
	@ApiModelProperty(value = "请求用户名称")
	private String operUserName; // 请求用户名称
	
	@ApiModelProperty(value = "请求IP")
	private String operIp; // 请求IP
	
	@ApiModelProperty(value = "请求URI")
	private String operUri; // 请求URI
	
	@ApiModelProperty(value = "创建时间")
	private Date OperCreateTime; // 创建时间
	
	@ApiModelProperty(value = "操作版本")
	private String OperVer; // 操作版本

}