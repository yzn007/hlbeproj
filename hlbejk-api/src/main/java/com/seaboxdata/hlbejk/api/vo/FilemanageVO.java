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
 * 文件管理表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-10-13 09:30:13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FilemanageVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键")
		private String id;
	
	/**
	 * 文件名称
	 */
	@ApiModelProperty(value = "文件名称")
	private String filename;

	/**
	 * 文件存储路径
	 */
	@ApiModelProperty(value = "文件存储路径")
	private String filepath;

	/**
	 * 文件类型
	 */
	@ApiModelProperty(value = "文件类型")
	private String filetype;

	/**
	 * 备注
	 */
	@ApiModelProperty(value = "备注")
	private String remarks;

	@ApiModelProperty(value = "上传时间")
	private String uploadtime;

	public String getUploadtime() {
		return uploadtime;
	}

	public void setUploadtime(String uploadtime) {
		this.uploadtime = uploadtime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String getFiletype() {
		return filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
