package com.seaboxdata.hlbejk.service.modules.enums;

public enum OperateType {
	ADD("add", "新增"), 
	UPDATE("update", "修改"), 
	DELETE("delete", "删除"), 
	QUERY("query", "查询"), 
	DETAIL("detail", "明细"),
	UNKNOWN("unknown", "未知");

	private String code;
	private String desc;

	private OperateType(String code, String desc) {
		this.code = code;
		this.desc = name();
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return desc;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setName(String name) {
		this.desc = name;
	}
}
