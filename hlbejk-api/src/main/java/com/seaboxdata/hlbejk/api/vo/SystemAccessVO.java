package com.seaboxdata.hlbejk.api.vo;

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
import io.swagger.annotations.ApiModelProperty;

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
public class SystemAccessVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键")
		private String id;
	
	/**
	 * 部门
	 */
	@ApiModelProperty(value = "部门")
	private String department;

	/**
	 * 登录次数
	 */
	@ApiModelProperty(value = "登录次数")
	private Integer loginNum;

	/**
	 * 访问次数
	 */
	@ApiModelProperty(value = "访问次数")
	private Integer accessNum;

	/**
	 * 服务访问次数
	 */
	@ApiModelProperty(value = "服务访问次数")
	private Integer serviceAccessNum;

	/**
	 * 服务调用次数
	 */
	@ApiModelProperty(value = "服务调用次数")
	private Integer serviceCallNum;

	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	private Integer accessData;

	/**
	 * 访问行数
	 */
	@ApiModelProperty(value = "访问行数")
	private Integer accessRows;

	/**
	 * 更新时间
	 */
	@ApiModelProperty(value = "更新时间")
	private Date updateTime;


}
