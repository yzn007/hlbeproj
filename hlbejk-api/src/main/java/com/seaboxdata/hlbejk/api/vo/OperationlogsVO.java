package com.seaboxdata.hlbejk.api.vo;

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
import io.swagger.annotations.ApiModelProperty;

/**
 * 操作日志
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 17:35:51
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OperationlogsVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键")
		private String id;
	
	/**
	 * 操作模块
	 */
	@ApiModelProperty(value = "操作模块")
	private String model;

	/**
	 * 登录信息
	 */
	@ApiModelProperty(value = "登录信息")
	private String logininfo;

	/**
	 * 请求地址
	 */
	@ApiModelProperty(value = "请求地址")
	private String requestaddr;

	/**
	 * 请求方法
	 */
	@ApiModelProperty(value = "请求方法")
	private String requestmethor;

	/**
	 * 操作方法
	 */
	@ApiModelProperty(value = "操作方法")
	private String operationfunction;

	/**
	 * 请求参数
	 */
	@ApiModelProperty(value = "请求参数")
	private String requestparams;

	/**
	 * 返回参数
	 */
	@ApiModelProperty(value = "返回参数")
	private String backparams;

	/**
	 * 状态
	 */
	@ApiModelProperty(value = "状态")
	private String state;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getLogininfo() {
		return logininfo;
	}

	public void setLogininfo(String logininfo) {
		this.logininfo = logininfo;
	}

	public String getRequestaddr() {
		return requestaddr;
	}

	public void setRequestaddr(String requestaddr) {
		this.requestaddr = requestaddr;
	}

	public String getRequestmethor() {
		return requestmethor;
	}

	public void setRequestmethor(String requestmethor) {
		this.requestmethor = requestmethor;
	}

	public String getOperationfunction() {
		return operationfunction;
	}

	public void setOperationfunction(String operationfunction) {
		this.operationfunction = operationfunction;
	}

	public String getRequestparams() {
		return requestparams;
	}

	public void setRequestparams(String requestparams) {
		this.requestparams = requestparams;
	}

	public String getBackparams() {
		return backparams;
	}

	public void setBackparams(String backparams) {
		this.backparams = backparams;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
