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
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-20 15:01:40
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("resource_call_count")
public class ResourceCallCount implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@TableId(value = "id", type = IdType.INPUT)
	private Integer id;
	
	/**
	 * 调用日期
	 */
	private String logDate;

	/**
	 * 资源名称
	 */
	private String resourceName;

	/**
	 * 被调用部门
	 */
	private String becalldept;

	/**
	 * 被调用次数
	 */
	private Integer becallnum;

	/**
	 * 调用部门
	 */
	private String calldept;

	/**
	 * 调用次数
	 */
	private Integer callnum;

	/**
	 * 调用用户
	 */
	private String calluser;

	/**
	 * 数据行数
	 */
	private Integer datarows;

	/**
	 * 数据流量
	 */
	private Integer dataflow;


}
