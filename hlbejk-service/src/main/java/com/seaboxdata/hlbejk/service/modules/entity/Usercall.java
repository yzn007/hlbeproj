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
 * 个人调用
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 18:18:06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("usercall")
public class Usercall implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 调用次数
	 */
	private Integer callnum;

	/**
	 * 计费方式
	 */
	private String chargetype;

	/**
	 * 计费时段
	 */
	private String callperiod;

	/**
	 * 费用
	 */
	private BigDecimal cost;

	/**
	 * 用户Id
	 */
	private String userid;

	/**
	 * 主键
	 */
	@TableId(value = "id", type = IdType.INPUT)
	private String id;
	

}
