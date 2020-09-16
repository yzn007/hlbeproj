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
 * 计费设置
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 18:18:06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("chargeset")
public class Chargeset implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 部门id
	 */
	private String deptid;

	/**
	 * 费用类型
	 */
	private String chargetype;

	/**
	 * 次数
	 */
	private String num;

	/**
	 * 流量
	 */
	private String datatraffic;

	/**
	 * 开始日期
	 */
	private Date startdate;

	/**
	 * 结束日期
	 */
	private Date enddate;

	/**
	 * 用户Id
	 */
	private String userid;

	/**
	 * 主键
	 */
	@TableId(value = "id", type = IdType.INPUT)
	private String id;
	

}
