package com.seaboxdata.hlbejk.api.vo;

import com.baomidou.mybatisplus.annotation.*;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
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
 * 接口申请表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ApiapplyinfoVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键")
		private String id;
	
	/**
	 * 接口名
	 */
	@ApiModelProperty(value = "接口名")
	private String apiname;

	/**
	 * 接口地址
	 */
	@ApiModelProperty(value = "接口地址")
	private String apiaddr;

	/**
	 * 申请时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "申请时间")
	private Date applydate;

	/**
	 * 审批状态
	 */
	@ApiModelProperty(value = "审批状态")
	private String approvalstate;

	/**
	 * api调用时段
	 */
	@ApiModelProperty(value = "api调用时段")
	private String apicallperiod;

	/**
	 * 接口使用权限
	 */
	@ApiModelProperty(value = "接口使用权限")
	private String apiauthor;

	/**
	 * 用户监控Id
	 */
	@ApiModelProperty(value = "用户监控Id")
	private String monitorid;


}
