package com.seaboxdata.hlbejk.api.vo;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ExceptionLogVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "Id")
	private String excId;
	
	@ApiModelProperty(value = "请求参数")
	private String excRequParam; // 请求参数
	
	@ApiModelProperty(value = "异常名称")
	private String excName; // 异常名称
	
	@ApiModelProperty(value = "异常信息")
	private String excMessage; // 异常信息
	
	@ApiModelProperty(value = "请求方法名")
	private String operMethod; // 请求方法名
	
	@ApiModelProperty(value = "操作员ID")
	private String operUserId; // 操作员ID
	
	@ApiModelProperty(value = "操作员名称")
	private String operUserName; // 操作员名称
	
	@ApiModelProperty(value = "操作URI")
	private String operUri; // 操作URI
	
	@ApiModelProperty(value = "操作员IP")
	private String operIp; // 操作员IP
	
	@ApiModelProperty(value = "操作版本号")
	private String operVer; // 操作版本号
	
	@ApiModelProperty(value = "发生异常时间")
	private Date operCreateTime; // 发生异常时间

	public String getExcId() {
		return excId;
	}

	public void setExcId(String excId) {
		this.excId = excId;
	}

	public String getExcRequParam() {
		return excRequParam;
	}

	public void setExcRequParam(String excRequParam) {
		this.excRequParam = excRequParam;
	}

	public String getExcName() {
		return excName;
	}

	public void setExcName(String excName) {
		this.excName = excName;
	}

	public String getExcMessage() {
		return excMessage;
	}

	public void setExcMessage(String excMessage) {
		this.excMessage = excMessage;
	}

	public String getOperMethod() {
		return operMethod;
	}

	public void setOperMethod(String operMethod) {
		this.operMethod = operMethod;
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

	public String getOperUri() {
		return operUri;
	}

	public void setOperUri(String operUri) {
		this.operUri = operUri;
	}

	public String getOperIp() {
		return operIp;
	}

	public void setOperIp(String operIp) {
		this.operIp = operIp;
	}

	public String getOperVer() {
		return operVer;
	}

	public void setOperVer(String operVer) {
		this.operVer = operVer;
	}

	public Date getOperCreateTime() {
		return operCreateTime;
	}

	public void setOperCreateTime(Date operCreateTime) {
		this.operCreateTime = operCreateTime;
	}
}