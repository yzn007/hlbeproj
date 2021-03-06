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
 * 系统访问统计
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-06 15:36:58
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SystemAccessReportVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 日期
	 */
	@ApiModelProperty(value = "日期")
	private String logDate;

	/**
	 * 部门
	 */
	@ApiModelProperty(value = "部门")
	private String organizationName;

	/**
	 * 登录次数
	 */
	@ApiModelProperty(value = "登录次数")
	private Long loginNum;

	/**
	 * 访问次数
	 */
	@ApiModelProperty(value = "访问次数")
	private Long visitorNum;

	/**
	 * 被调用次数
	 */
	@ApiModelProperty(value = "被调用次数")
	private Long becallNum;

	/**
	 * 访问服务次数
	 */
	@ApiModelProperty(value = "访问服务次数")
	private Long visitServiceNum;

	/**
	 * 访问流量
	 */
	@ApiModelProperty(value = "访问流量")
	private Double dataflow;

	/**
	 * 访问行数
	 */
	@ApiModelProperty(value = "访问行数")
	private Long visitrows;


}
