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
 * 数据申请表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class DataapplyinfoVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键")
		private String id;
	
	/**
	 * 数据资源名称
	 */
	@ApiModelProperty(value = "数据资源名称")
	private String dataresname;

	/**
	 * 数据类型
	 */
	@ApiModelProperty(value = "数据类型")
	private String datatype;

	/**
	 * 数据地址
	 */
	@ApiModelProperty(value = "数据地址")
	private String dataaddr;

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
	 * 数据调用时段
	 */
	@ApiModelProperty(value = "数据调用时段")
	private String datacallperiod;

	/**
	 * 数据使用权限
	 */
	@ApiModelProperty(value = "数据使用权限")
	private String dataauthor;

	/**
	 * 用户监控Id
	 */
	@ApiModelProperty(value = "用户监控Id")
	private String monitorid;


}
