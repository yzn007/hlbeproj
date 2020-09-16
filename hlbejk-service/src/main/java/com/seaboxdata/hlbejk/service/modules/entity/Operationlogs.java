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
 * 操作日志
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 17:35:51
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("operationlogs")
public class Operationlogs implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId(value = "id", type = IdType.INPUT)
	private String id;
	
	/**
	 * 操作模块
	 */
	private String model;

	/**
	 * 登录信息
	 */
	private String logininfo;

	/**
	 * 请求地址
	 */
	private String requestaddr;

	/**
	 * 请求方法
	 */
	private String requestmethor;

	/**
	 * 操作方法
	 */
	private String operationfunction;

	/**
	 * 请求参数
	 */
	private String requestparams;

	/**
	 * 返回参数
	 */
	private String backparams;

	/**
	 * 状态
	 */
	private String state;


}
