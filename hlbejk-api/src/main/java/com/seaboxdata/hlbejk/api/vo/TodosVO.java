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
 * 待办事项
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-16 10:21:25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TodosVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键")
		private String id;
	
	/**
	 * 标题
	 */
	@ApiModelProperty(value = "标题")
	private String title;

	/**
	 * 内容
	 */
	@ApiModelProperty(value = "内容")
	private String content;

	/**
	 * 状态：{0：待办；1：已办}
	 */
	@ApiModelProperty(value = "状态：{0：待办；1：已办}")
	private String state;

	/**
	 * 日期
	 */
	@ApiModelProperty(value = "日期")
	private Date updatetime;

	/**
	 * 用户Id
	 */
	@ApiModelProperty(value = "用户Id")
	private String userid;


}
