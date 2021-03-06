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
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 16:07:22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class DeptcallVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 部门Id
	 */
	@ApiModelProperty(value = "部门Id")
	private String deptid;

	/**
	 * 调用总数
	 */
	@ApiModelProperty(value = "调用总数")
	private String callnum;

	/**
	 * 费用类别
	 */
	@ApiModelProperty(value = "费用类别")
	private String chargetype;

	/**
	 * 调用周期
	 */
	@ApiModelProperty(value = "调用周期")
	private String chargeperiod;

	/**
	 * 费用
	 */
	@ApiModelProperty(value = "费用")
	private BigDecimal cost;

	/**
	 * 
	 */
	@ApiModelProperty(value = "")
		private String id;

	public String getDeptid() {
		return deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getCallnum() {
		return callnum;
	}

	public void setCallnum(String callnum) {
		this.callnum = callnum;
	}

	public String getChargetype() {
		return chargetype;
	}

	public void setChargetype(String chargetype) {
		this.chargetype = chargetype;
	}

	public String getChargeperiod() {
		return chargeperiod;
	}

	public void setChargeperiod(String chargeperiod) {
		this.chargeperiod = chargeperiod;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
