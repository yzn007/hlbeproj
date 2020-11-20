package com.seaboxdata.hlbejk.service.modules.entity;

import com.baomidou.mybatisplus.annotation.*;
import java.math.BigDecimal;
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
 * 部门资源调用统计次数
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-11-04 10:33:33
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("dept_access")
public class DeptAccess implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId(value = "id", type = IdType.INPUT)
	private String id;
	
	/**
	 * 部门id
	 */
	private String deptId;

	/**
	 * 系统名称
	 */
	private String systemName;

	/**
	 * 资源名称
	 */
	private String resourceName;

	/**
	 * 调用次数
	 */
	private Integer accessNum;

	/**
	 * 调用流量
	 */
	private BigDecimal dataNum;

	/**
	 * 更新日期
	 */
	private Date updateTime;


}
