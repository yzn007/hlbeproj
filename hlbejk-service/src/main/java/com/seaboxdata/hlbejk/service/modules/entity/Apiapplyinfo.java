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
 * 接口申请表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("apiapplyinfo")
public class Apiapplyinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId(value = "id", type = IdType.INPUT)
	private String id;
	
	/**
	 * 接口名
	 */
	private String apiname;

	/**
	 * 接口地址
	 */
	private String apiaddr;

	/**
	 * 申请时间
	 */
	private Date applydate;

	/**
	 * 审批状态
	 */
	private String approvalstate;

	/**
	 * api调用时段
	 */
	private String apicallperiod;

	/**
	 * 接口使用权限
	 */
	private String apiauthor;

	/**
	 * 用户监控Id
	 */
	private String monitorid;


}
