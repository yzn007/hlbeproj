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
 * 通知公告
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-16 10:21:25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class NoticeVO implements Serializable {
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
	 * 用户id
	 */
	@ApiModelProperty(value = "用户id")
	private String userid;

	/**
	 * 部门id
	 */
	@ApiModelProperty(value = "部门id")
	private String deptid;

	/**
	 * 备注
	 */
	@ApiModelProperty(value = "备注")
	private String remark;

	/**
	 * 日期
	 */
	@ApiModelProperty(value = "日期")
	private Date updatetime;

	/**
	 * 是否已读
	 */
	@ApiModelProperty(value = "是否已读")
	private String isread;


}
