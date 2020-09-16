package com.seaboxdata.hlbejk.service.modules.entity;

import com.baomidou.mybatisplus.annotation.*;
import java.math.BigDecimal;
import java.io.Serializable;

import com.seaboxdata.hlbejk.api.vo.DaymonitorVO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * 监控日标
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 14:22:28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("daymonitor")
public class Daymonitor implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId(value = "id", type = IdType.INPUT)
	private String id;
	
	/**
	 * 调用接口流量
	 */
	private BigDecimal accapidata;

	/**
	 * 调用模型流量
	 */
	private BigDecimal accmodeldata;

	/**
	 * 调用数据流量
	 */
	private BigDecimal accdatatraffic;

	/**
	 * 日期
	 */
	private Date date;

	/**
	 * 调用次数
	 */
	private int accnum;

	/**
	 * 申请次数
	 */
	private int applynum;

	/**
	 * 用户监控主键
	 */
	private String monitorid;

	public static Daymonitor toEntity(DaymonitorVO daymonitorVo){
		if (null == daymonitorVo) {
			return null;
		}
		Daymonitor daymonitor = new Daymonitor();
		BeanUtils.copyProperties(daymonitorVo,daymonitor);
		return daymonitor;
	}


}
