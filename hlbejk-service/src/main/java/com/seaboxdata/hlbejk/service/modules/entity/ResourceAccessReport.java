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
import org.springframework.data.annotation.Transient;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 资源访问统计表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-06 15:45:22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("resource_access_report")
public class ResourceAccessReport implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键id
	 */
	@TableId(value = "id", type = IdType.INPUT)
	private Integer id;
	
	/**
	 * 服务调用日期
	 */
	private String logDate;

	/**
	 * 服务编码
	 */
	private String serviceCode;

	/**
	 * 资源名称
	 */
	private String resourceName;

	@Transient
	private transient String systemName;

	/**
	 * 资源所属部门
	 */
	private String organizationName;

	/**
	 * 调用部门名称
	 */
	private String callDept;

	/**
	 * 调用用户
	 */
	private String callUser;

	/**
	 * 数据行数
	 */
	private Integer dataNumber;

	/**
	 * 访问流量
	 */
	private Double dataFlow;

	/**
	 * 访问次数
	 */
	private Integer visitsNum;


}
