package com.seaboxdata.hlbejk.service.modules.entity;

import com.baomidou.mybatisplus.annotation.*;
import java.math.BigDecimal;
import java.io.Serializable;

import com.seaboxdata.hlbejk.api.vo.DaymonitorVO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.beans.BeanUtils;
import org.springframework.data.annotation.Transient;

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
	 * 行政区划代码
	 */
	@Transient
	private transient String districtcode;
	
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
	 * 年月
	 */
	@Transient
	private transient String yearmnnth;

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

	public static DaymonitorVO toData(Daymonitor daymonitor){
		if (null == daymonitor) {
			return null;
		}
		DaymonitorVO daymonitorVo = new DaymonitorVO();
		BeanUtils.copyProperties(daymonitor,daymonitorVo);
		return daymonitorVo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDistrictcode() {
		return districtcode;
	}

	public void setDistrictcode(String districtcode) {
		this.districtcode = districtcode;
	}

	public BigDecimal getAccapidata() {
		return accapidata;
	}

	public void setAccapidata(BigDecimal accapidata) {
		this.accapidata = accapidata;
	}

	public BigDecimal getAccmodeldata() {
		return accmodeldata;
	}

	public void setAccmodeldata(BigDecimal accmodeldata) {
		this.accmodeldata = accmodeldata;
	}

	public BigDecimal getAccdatatraffic() {
		return accdatatraffic;
	}

	public void setAccdatatraffic(BigDecimal accdatatraffic) {
		this.accdatatraffic = accdatatraffic;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getYearmnnth() {
		return yearmnnth;
	}

	public void setYearmnnth(String yearmnnth) {
		this.yearmnnth = yearmnnth;
	}

	public int getAccnum() {
		return accnum;
	}

	public void setAccnum(int accnum) {
		this.accnum = accnum;
	}

	public int getApplynum() {
		return applynum;
	}

	public void setApplynum(int applynum) {
		this.applynum = applynum;
	}

	public String getMonitorid() {
		return monitorid;
	}

	public void setMonitorid(String monitorid) {
		this.monitorid = monitorid;
	}
}
