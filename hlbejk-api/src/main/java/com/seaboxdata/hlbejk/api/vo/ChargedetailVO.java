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
}
