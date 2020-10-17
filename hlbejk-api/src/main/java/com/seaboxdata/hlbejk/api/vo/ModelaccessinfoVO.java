package com.seaboxdata.hlbejk.api.vo;

import com.baomidou.mybatisplus.annotation.*;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;

/**
 * 模型调用表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonIgnoreProperties({"userId"})
public class ModelaccessinfoVO implements Serializable {
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
	 * 使用数据流量
	 */
	@ApiModelProperty(value = "使用数据流量")
	private BigDecimal usedatas;

	/**
	 * 调用次数
	 */
	@ApiModelProperty(value = "调用次数")
	private String applynum;

	/**
	 * 调用时间
	 */
//	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "调用时间")
	private Date applydate;

	/**
	 * 用户监控Id
	 */
	@ApiModelProperty(value = "用户监控Id")
	private String monitorid;

	/**
	 * 用户id
	 */
	@ApiModelProperty(value="用户id")
	private String userId;

}
