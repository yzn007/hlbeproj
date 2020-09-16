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
 * 数据管理
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 17:35:51
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class DatamanagerVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键")
		private String id;
	
	/**
	 * 数据名称
	 */
	@ApiModelProperty(value = "数据名称")
	private String dataname;

	/**
	 * 数据类型
	 */
	@ApiModelProperty(value = "数据类型")
	private String datatype;

	/**
	 * 数据库
	 */
	@ApiModelProperty(value = "数据库")
	private String dtbase;

	/**
	 * 发布时间
	 */
	@ApiModelProperty(value = "发布时间")
	private Date publishtime;

	/**
	 * 更新时间
	 */
	@ApiModelProperty(value = "更新时间")
	private Date updatetime;

	/**
	 * 状态
	 */
	@ApiModelProperty(value = "状态")
	private String state;


}
