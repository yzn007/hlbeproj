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
 * 模型申请表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ModelapplyinfoVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键")
		private String id;
	
	/**
	 * 模型名称
	 */
	@ApiModelProperty(value = "模型名称")
	private String modelname;

	/**
	 * 模型地址
	 */
	@ApiModelProperty(value = "模型地址")
	private String modeladdr;

	/**
	 * 申请时间
	 */
	@ApiModelProperty(value = "申请时间")
	private Date applydate;

	/**
	 * 审批状态
	 */
	@ApiModelProperty(value = "审批状态")
	private String approvalstate;

	/**
	 * 模型调用时段
	 */
	@ApiModelProperty(value = "模型调用时段")
	private String modelcallperiod;

	/**
	 * 模型使用权限
	 */
	@ApiModelProperty(value = "模型使用权限")
	private String modelauthor;

	/**
	 * 用户监控Id
	 */
	@ApiModelProperty(value = "用户监控Id")
	private String monitorid;


}
