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
 * 费用类型
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 18:18:06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("chargetype")
public class Chargetype implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId(value = "id", type = IdType.INPUT)
	private String id;
	
	/**
	 * 是否超出计费
	 */
	private String ischargeoverflow;

	/**
	 * 费用类型
	 */
	private String chargetype;

	/**
	 * 单价
	 */
	private BigDecimal price;

	/**
	 * 费用名称
	 */
	private String chargename;

	/**
	 * 状态
	 */
	private String state;

	/**
	 * 调用类型
	 */
	private String calltype;


}
