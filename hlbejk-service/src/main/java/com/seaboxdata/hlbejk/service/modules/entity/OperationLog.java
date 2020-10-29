package com.seaboxdata.hlbejk.service.modules.entity;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("operation_log")
public class OperationLog implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@TableId(type = IdType.INPUT)
    private String operId; // 主键ID
    private String operModul; // 操作模块
    private String operType; // 操作类型
    private String operDesc; // 操作描述
    private String operMethod; // 请求方法
    private String operRequParam; // 请求参数
    private String operRespParam; // 返回结果
    private String operUserId; // 请求用户ID
    private String operUserName; // 请求用户名称
    private String operIp; // 请求IP
    private String operUri; // 请求URI
    private Date operCreateTime; // 创建时间
    private String operVer; // 操作版本


}