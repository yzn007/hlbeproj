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
 * 系统日志
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 17:35:51
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SystemlogsVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@ApiModelProperty(value = "编号")
	private String num;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键")
		private String id;
	
	/**
	 * 系统模块
	 */
	@ApiModelProperty(value = "系统模块")
	private String model;

	/**
	 * 操作类型
	 */
	@ApiModelProperty(value = "操作类型")
	private String opertype;

	/**
	 * 用户id
	 */
	@ApiModelProperty(value = "用户id")
	private String userid;

	/**
	 * 部门id
	 */
	@ApiModelProperty(value = "部门id")
	private String deptid;

	/**
	 * 主机
	 */
	@ApiModelProperty(value = "主机")
	private String host;

	/**
	 * 操作地点
	 */
	@ApiModelProperty(value = "操作地点")
	private String remote;

	/**
	 * 状态
	 */
	@ApiModelProperty(value = "状态")
	private String state;


}
