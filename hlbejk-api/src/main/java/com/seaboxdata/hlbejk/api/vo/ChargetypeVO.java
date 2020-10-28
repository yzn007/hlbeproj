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
 * 费用类型
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 18:18:06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ChargetypeVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键")
		private String id;
	
	/**
	 * 是否超出计费
	 */
	@ApiModelProperty(value = "是否超出计费")
	private String ischargeoverflow;

	/**
	 * 费用类型
	 */
	@ApiModelProperty(value = "费用类型")
	private String chargetype;

	/**
	 * 单价
	 */
	@ApiModelProperty(value = "单价")
	private BigDecimal price;

	/**
	 * 费用名称
	 */
	@ApiModelProperty(value = "费用名称")
	private String chargename;

	/**
	 * 状态
	 */
	@ApiModelProperty(value = "状态")
	private String state;

	/**
	 * 调用类型
	 */
	@ApiModelProperty(value = "调用类型")
	private String calltype;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIschargeoverflow() {
		return ischargeoverflow;
	}

	public void setIschargeoverflow(String ischargeoverflow) {
		this.ischargeoverflow = ischargeoverflow;
	}

	public String getChargetype() {
		return chargetype;
	}

	public void setChargetype(String chargetype) {
		this.chargetype = chargetype;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getChargename() {
		return chargename;
	}

	public void setChargename(String chargename) {
		this.chargename = chargename;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCalltype() {
		return calltype;
	}

	public void setCalltype(String calltype) {
		this.calltype = calltype;
	}
}
