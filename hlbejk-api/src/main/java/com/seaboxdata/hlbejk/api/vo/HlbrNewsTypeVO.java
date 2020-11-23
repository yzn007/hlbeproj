package com.seaboxdata.hlbejk.api.vo;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * HLBR_NEWS_TYPE【公告类型表】
 * 
 * @author 管理员
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class HlbrNewsTypeVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键")
	private String id;

	/**
	 * 类型描述
	 */
	@ApiModelProperty(value = "类型描述")
	private String typeDesc;

}
