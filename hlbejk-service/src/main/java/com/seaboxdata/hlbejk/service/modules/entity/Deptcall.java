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
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 16:07:22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("deptcall")
public class Deptcall implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 部门Id
	 */
	private String deptid;

	/**
	 * 调用总数
	 */
	private String callnum;

	/**
	 * 费用类别
	 */
	private String chargetype;

	/**
	 * 调用周期
	 */
	private String chargeperiod;

	/**
	 * 费用
	 */
	private BigDecimal cost;

	/**
	 * 
	 */
	@TableId(value = "id", type = IdType.INPUT)
	private String id;
	

}
