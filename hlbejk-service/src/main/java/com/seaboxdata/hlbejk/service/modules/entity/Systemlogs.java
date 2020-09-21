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
 * 系统日志
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 17:35:51
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("systemlogs")
public class Systemlogs implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	private String num;

	/**
	 * 主键
	 */
	@TableId(value = "id", type = IdType.INPUT)
	private String id;
	
	/**
	 * 系统模块
	 */
	private String model;

	/**
	 * 操作类型
	 */
	private String opertype;

	/**
	 * 用户id
	 */
	private String userid;

	/**
	 * 部门id
	 */
	private String deptid;

	/**
	 * 主机
	 */
	private String host;

	/**
	 * 操作地点
	 */
	private String remote;


	/**
	 * 操作时间
	 */
	private String operdate;

	/**
	 * 状态
	 */
	private String state;


}
