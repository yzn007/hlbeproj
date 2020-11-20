package com.seaboxdata.hlbejk.service.modules.entity;

import com.baomidou.mybatisplus.annotation.*;
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
 * 系统访问统计报表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-04 10:33:33
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("system_access")
public class SystemAccess implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId(value = "id", type = IdType.INPUT)
	private String id;
	
	/**
	 * 部门
	 */
	private String department;

	/**
	 * 登录次数
	 */
	private Integer loginNum;

	/**
	 * 访问次数
	 */
	private Integer accessNum;

	/**
	 * 服务访问次数
	 */
	private Integer serviceAccessNum;

	/**
	 * 服务调用次数
	 */
	private Integer serviceCallNum;

	/**
	 * 
	 */
	private Integer accessData;

	/**
	 * 访问行数
	 */
	private Integer accessRows;

	/**
	 * 更新时间
	 */
	private Date updateTime;


}
