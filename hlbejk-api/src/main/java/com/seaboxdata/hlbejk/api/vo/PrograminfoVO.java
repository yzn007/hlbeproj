package com.seaboxdata.hlbejk.api.vo;

import com.baomidou.mybatisplus.annotation.*;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
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
 * 算法信息
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 17:35:51
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PrograminfoVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键")
		private String id;
	
	/**
	 * 算法名称
	 */
	@ApiModelProperty(value = "算法名称")
	private String programname;

	/**
	 * 算法id
	 */
	@ApiModelProperty(value = "算法id")
	private String programid;

	/**
	 * 算法类型
	 */
	@ApiModelProperty(value = "算法类型")
	private String programtype;

	/**
	 * 算法地址
	 */
	@ApiModelProperty(value = "算法地址")
	private String programaddr;

	/**
	 * 算法接口
	 */
	@ApiModelProperty(value = "算法接口")
	private String programapi;

	/**
	 * 算法标注
	 */
	@ApiModelProperty(value = "算法标注")
	private String programtag;

	/**
	 * 更新时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "更新时间")
	private Date updatetime;

	/**
	 * 状态
	 */
	@ApiModelProperty(value = "状态")
	private String state;

	/**
	 * 算法描述
	 */
	@ApiModelProperty(value = "算法描述")
	private String programdesc;

	/**
	 * 参数设置
	 */
	@ApiModelProperty(value = "参数设置")
	private String programparams;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProgramname() {
		return programname;
	}

	public void setProgramname(String programname) {
		this.programname = programname;
	}

	public String getProgramid() {
		return programid;
	}

	public void setProgramid(String programid) {
		this.programid = programid;
	}

	public String getProgramtype() {
		return programtype;
	}

	public void setProgramtype(String programtype) {
		this.programtype = programtype;
	}

	public String getProgramaddr() {
		return programaddr;
	}

	public void setProgramaddr(String programaddr) {
		this.programaddr = programaddr;
	}

	public String getProgramapi() {
		return programapi;
	}

	public void setProgramapi(String programapi) {
		this.programapi = programapi;
	}

	public String getProgramtag() {
		return programtag;
	}

	public void setProgramtag(String programtag) {
		this.programtag = programtag;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getProgramdesc() {
		return programdesc;
	}

	public void setProgramdesc(String programdesc) {
		this.programdesc = programdesc;
	}

	public String getProgramparams() {
		return programparams;
	}

	public void setProgramparams(String programparams) {
		this.programparams = programparams;
	}
}
