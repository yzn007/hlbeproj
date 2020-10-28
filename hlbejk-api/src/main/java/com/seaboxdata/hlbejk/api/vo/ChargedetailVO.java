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
 * 费用详细
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 18:18:06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ChargedetailVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户id
	 */
	@ApiModelProperty(value = "用户id")
	private String userid;

	/**
	 * 调用类型
	 */
	@ApiModelProperty(value = "调用类型")
	private String chargetype;

	/**
	 * 调用数据名称
	 */
	@ApiModelProperty(value = "调用数据名称")
	private String calldataname;

	/**
	 * 调用时间
	 */
	@ApiModelProperty(value = "调用时间")
	private Date calldate;

	/**
	 * 费用
	 */
	@ApiModelProperty(value = "费用")
	private BigDecimal cost;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键")
		private String id;

	/**
	 * 次数
	 */
	@ApiModelProperty(value = "次数")
	private int callnum;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getChargetype() {
		return chargetype;
	}

	public void setChargetype(String chargetype) {
		this.chargetype = chargetype;
	}

	public String getCalldataname() {
		return calldataname;
	}

	public void setCalldataname(String calldataname) {
		this.calldataname = calldataname;
	}

	public Date getCalldate() {
		return calldate;
	}

	public void setCalldate(Date calldate) {
		this.calldate = calldate;
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

	public int getCallnum() {
		return callnum;
	}

	public void setCallnum(int callnum) {
		this.callnum = callnum;
	}
}
