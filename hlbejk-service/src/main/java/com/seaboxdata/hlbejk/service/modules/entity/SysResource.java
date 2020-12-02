package com.seaboxdata.hlbejk.service.modules.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 【系统资源】
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-12-02 09:47:34
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_resource")
public class SysResource implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId(value = "id", type = IdType.INPUT)
	private String id;

	/**
	 * 资源别名
	 */
	private String alias;

	/**
	 * 资源名称
	 */
	private String name;

	/**
	 * 排序号
	 */
	private Long sn;

	/**
	 * 图标
	 */
	private String icon;

	/**
	 * 样式
	 */
	private String cls;

	/**
	 * 资源类型
	 */
	private String resourceType;

	/**
	 * 父类ID
	 */
	private String parentId;

	/**
	 * 默认URL
	 */
	private String defaultUrl;

	/**
	 * 是否展开
	 */
	private String isOpen;

	/**
	 * 描述
	 */
	private String desc;

	/**
	 * 是否叶子节点
	 */
	private String isLeaf;

	/**
	 * 子节点集合
	 */
	private List<SysResource> children = new ArrayList<SysResource>();
}
