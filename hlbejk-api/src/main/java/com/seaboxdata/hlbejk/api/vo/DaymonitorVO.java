package com.seaboxdata.hlbejk.api.vo;

import com.baomidou.mybatisplus.annotation.*;

import java.beans.Transient;
import java.math.BigDecimal;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.ToString;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;

import io.swagger.annotations.ApiModelProperty;


/**
 * 监控日表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 14:22:28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
	public class DaymonitorVO implements Serializable {
	private static final long serialVersionUID = 1L;


	/**
	 * 
	 */
	@ApiModelProperty(value = "用户监控主键",name="monitorid",required = true)
	private String monitorid;

	//@JsonIgnore
	@ApiModelProperty(value = "行政区划代码",name="districtcode")
	private String districtcode;

	@ApiModelProperty(value = "主键", name = "id", required = true)
	private String id;

	@ApiModelProperty(value = "接口流量", name = "accapidata")
	private BigDecimal accapidata;

	@ApiModelProperty(value = "调用模型流量", name = "accmodeldata", required = true)
	private BigDecimal accmodeldata;

	@ApiModelProperty(value = "数据流量", name = "accdatatraffic", required = true)
	private BigDecimal accdatatraffic;

	@ApiModelProperty(value = "日期", name = "date", required = true)
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private Date date;

	@ApiModelProperty(value = "年月", name = "yearmonth", required = true)
	private transient String yearmonth;

	@ApiModelProperty(value = "调用次数", name = "accnum", required = true)
	private int accnum;

	@ApiModelProperty(value = "申请次数", name = "applynum", required = true)
	private int applynum;

	public String getMonitorid() {
		return monitorid;
	}

	public void setMonitorid(String monitorid) {
		this.monitorid = monitorid;
	}

	public String getDistrictcode() {
		return districtcode;
	}

	public void setDistrictcode(String districtcode) {
		this.districtcode = districtcode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getYearmonth() {
		return yearmonth;
	}

	public void setYearmonth(String yearmonth) {
		this.yearmonth = yearmonth;
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
}
