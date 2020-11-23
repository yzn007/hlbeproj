package com.seaboxdata.hlbejk.service.modules.entity;

import com.baomidou.mybatisplus.annotation.*;
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

/**
 * HLBR_NEWS【公告/新闻管理】
 * 
 * @author 管理员
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("hlbr_news")
public class HlbrNews implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */

	@TableId(value = "id", type = IdType.AUTO)
	private String id;

	/**
	 * 标题
	 */
	private String title;

	/**
	 * 发布人
	 */
	private String userName;

	/**
	 * 发布人ID
	 */
	private String userId;

	/**
	 * 发布时间
	 */
	private Date publicDate;

	/**
	 * 失效时间
	 */
	private Date loseDate;

	/**
	 * 关键字
	 */
	private String newsKey;

	/**
	 * 发布范围组织
	 */
	private String depName;

	/**
	 * 
	 */
	private String depId;

	/**
	 * 是否公共
	 */
	private String isPublic;

	/**
	 * 类型
	 */
	private String typeDesc;

	/**
	 * 类型id
	 */
	private String typeId;

	/**
	 * 附件
	 */
	private String fileAttach;

	/**
	 * 发布状态
	 */
	private String status;

	/**
	 * 内容
	 */
	private String content;

}
