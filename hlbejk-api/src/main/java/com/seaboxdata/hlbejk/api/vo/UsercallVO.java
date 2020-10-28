package com.seaboxdata.hlbejk.api.vo;

import com.baomidou.mybatisplus.annotation.*;
import java.math.BigDecimal;
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
 * 个人调用
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 18:18:06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UsercallVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 调用次数
	 */
	@ApiModelProperty(value = "调用次数")
	private Integer callnum;

	/**
	 * 计费方式
	 */
	@ApiModelProperty(value = "计费方式")
	private String chargetype;

	/**
	 * 计费时段
	 */
	@ApiModelProperty(value = "计费时段")
	private String callperiod;

	/**
	 * 费用
	 */
	@ApiModelProperty(value = "费用")
	private BigDecimal cost;

	/**
	 * 用户Id
	 */
	@ApiModelProperty(value = "用户Id")
	private String userid;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键")
		private String id;

	public Integer getCallnum() {
		return callnum;
	}

	public void setCallnum(Integer callnum) {
		this.callnum = callnum;
	}

	public String getChargetype() {
		return chargetype;
	}

	public void setChargetype(String chargetype) {
		this.chargetype = chargetype;
	}

	public String getCallperiod() {
		return callperiod;
	}

	public void setCallperiod(String callperiod) {
		this.callperiod = callperiod;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
