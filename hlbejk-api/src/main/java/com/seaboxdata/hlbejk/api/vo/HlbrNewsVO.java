package com.seaboxdata.hlbejk.api.vo;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * HLBR_NEWS【公告/新闻管理】
 * 
 * @author 管理员
 *
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class HlbrNewsVO implements Serializable {
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
	 * 发布人
	 */
	@ApiModelProperty(value = "发布人")
	private String userName;

	/**
	 * 发布人ID
	 */
	@ApiModelProperty(value = "发布人ID")
	private String userId;

	/**
	 * 发布时间
	 */
	@ApiModelProperty(value = "发布时间")
	private Date publicDate;

	/**
	 * 失效时间
	 */
	@ApiModelProperty(value = "失效时间")
	private Date loseDate;

	/**
	 * 关键字
	 */
	@ApiModelProperty(value = "关键字")
	private String newsKey;

	/**
	 * 发布范围组织
	 */
	@ApiModelProperty(value = "发布范围组织")
	private String depName;

	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	private String depId;

	/**
	 * 是否公共
	 */
	@ApiModelProperty(value = "是否公共")
	private String isPublic;

	/**
	 * 类型
	 */
	@ApiModelProperty(value = "类型")
	private String typeDesc;

	/**
	 * 类型id
	 */
	@ApiModelProperty(value = "类型id")
	private String typeId;

	/**
	 * 附件
	 */
	@ApiModelProperty(value = "附件")
	private String fileAttach;

	/**
	 * 发布状态
	 */
	@ApiModelProperty(value = "发布状态")
	private String status;

	/**
	 * 内容
	 */
	@ApiModelProperty(value = "内容")
	private String content;

}
