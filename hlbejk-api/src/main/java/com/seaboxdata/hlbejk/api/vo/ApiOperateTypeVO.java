package com.seaboxdata.hlbejk.api.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 
 * @author 管理员
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ApiOperateTypeVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键")
	private String id;

	/**
	 * 操作类型编码
	 */
	@ApiModelProperty(value = "操作类型编码")
	private String typeCode;

	/**
	 * 操作类型名称
	 */
	@ApiModelProperty(value = "操作类型名称")
	private String typeDesc;

}
