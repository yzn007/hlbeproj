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

	public String getOperId() {
		return operId;
	}

	public void setOperId(String operId) {
		this.operId = operId;
	}

	public String getOperModul() {
		return operModul;
	}

	public void setOperModul(String operModul) {
		this.operModul = operModul;
	}

	public String getOperType() {
		return operType;
	}

	public void setOperType(String operType) {
		this.operType = operType;
	}

	public String getOperDesc() {
		return operDesc;
	}

	public void setOperDesc(String operDesc) {
		this.operDesc = operDesc;
	}

	public String getOperMethod() {
		return operMethod;
	}

	public void setOperMethod(String operMethod) {
		this.operMethod = operMethod;
	}

	public String getOperRequParam() {
		return operRequParam;
	}

	public void setOperRequParam(String operRequParam) {
		this.operRequParam = operRequParam;
	}

	public String getOperRespParam() {
		return operRespParam;
	}

	public void setOperRespParam(String operRespParam) {
		this.operRespParam = operRespParam;
	}

	public String getOperUserId() {
		return operUserId;
	}

	public void setOperUserId(String operUserId) {
		this.operUserId = operUserId;
	}

	public String getOperUserName() {
		return operUserName;
	}

	public void setOperUserName(String operUserName) {
		this.operUserName = operUserName;
	}

	public String getOperIp() {
		return operIp;
	}

	public void setOperIp(String operIp) {
		this.operIp = operIp;
	}

	public String getOperUri() {
		return operUri;
	}

	public void setOperUri(String operUri) {
		this.operUri = operUri;
	}

	public Date getOperCreateTime() {
		return OperCreateTime;
	}

	public void setOperCreateTime(Date operCreateTime) {
		OperCreateTime = operCreateTime;
	}

	public String getOperVer() {
		return OperVer;
	}

	public void setOperVer(String operVer) {
		OperVer = operVer;
	}
}