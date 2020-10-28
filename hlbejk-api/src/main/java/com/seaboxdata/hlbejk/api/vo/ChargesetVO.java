package com.seaboxdata.hlbejk.api.vo;

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
import io.swagger.annotations.ApiModelProperty;

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
public class ChargesetVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 部门id
	 */
	@ApiModelProperty(value = "部门id")
	private String deptid;

	/**
	 * 费用类型
	 */
	@ApiModelProperty(value = "费用类型")
	private String chargetype;

	/**
	 * 次数
	 */
	@ApiModelProperty(value = "次数")
	private String num;

	/**
	 * 流量
	 */
	@ApiModelProperty(value = "流量")
	private String datatraffic;

	/**
	 * 开始日期
	 */
	@ApiModelProperty(value = "开始日期")
	private Date startdate;

	/**
	 * 结束日期
	 */
	@ApiModelProperty(value = "结束日期")
	private Date enddate;

	/**
	 * 用户Id
	 */
	@ApiModelProperty(value = "用户Id")
	private String userid;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键")
		private String id;


	public String getDeptid() {
		return deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getChargetype() {
		return chargetype;
	}

	public void setChargetype(String chargetype) {
		this.chargetype = chargetype;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getDatatraffic() {
		return datatraffic;
	}

	public void setDatatraffic(String datatraffic) {
		this.datatraffic = datatraffic;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
