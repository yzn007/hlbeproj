package com.seaboxdata.hlbejk.service.modules.entity;

import com.baomidou.mybatisplus.annotation.*;
import java.math.BigDecimal;
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
@TableName("chargedetail")
public class Chargedetail implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户id
	 */
	private String userid;

	/**
	 * 调用类型
	 */
	private String chargetype;

	/**
	 * 调用数据名称
	 */
	private String calldataname;

	/**
	 * 调用时间
	 */
	private Date calldate;

	/**
	 * 费用
	 */
	private BigDecimal cost;

	/**
	 * 主键
	 */
	@TableId(value = "id", type = IdType.INPUT)
	private String id;
	

}
