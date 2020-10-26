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
 * 机构管理
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-10-25 17:24:45
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("oauth_organization")
public class OauthOrganization implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@TableId(value = "id", type = IdType.INPUT)
	private Long id;
	
	/**
	 * 父Id
	 */
	private Long parentId;

	/**
	 * 租户Id
	 */
	private Long tenantId;

	/**
	 * 机构名称
	 */
	private String organizationName;

	/**
	 * 机构编码
	 */
	private String organizationCode;

	/**
	 * 机构地址
	 */
	private String organizationAddress;

	/**
	 * 机构编号
	 */
	private Long organizationNumber;

	/**
	 * 负责人用户Id
	 */
	private Long managerUserId;

	/**
	 * 机构层级等级
	 */
	private Integer level;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 修改时间
	 */
	private Date updateTime;

	/**
	 * 
	 */
	private String isDeleted;

	/**
	 * 
	 */
	private String departmentEnum;

	/**
	 * 
	 */
	private Integer orderIndex;

	/**
	 * 
	 */
	private Long superOrgid;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getTenantId() {
		return tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getOrganizationCode() {
		return organizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	public String getOrganizationAddress() {
		return organizationAddress;
	}

	public void setOrganizationAddress(String organizationAddress) {
		this.organizationAddress = organizationAddress;
	}

	public Long getOrganizationNumber() {
		return organizationNumber;
	}

	public void setOrganizationNumber(Long organizationNumber) {
		this.organizationNumber = organizationNumber;
	}

	public Long getManagerUserId() {
		return managerUserId;
	}

	public void setManagerUserId(Long managerUserId) {
		this.managerUserId = managerUserId;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getDepartmentEnum() {
		return departmentEnum;
	}

	public void setDepartmentEnum(String departmentEnum) {
		this.departmentEnum = departmentEnum;
	}

	public Integer getOrderIndex() {
		return orderIndex;
	}

	public void setOrderIndex(Integer orderIndex) {
		this.orderIndex = orderIndex;
	}

	public Long getSuperOrgid() {
		return superOrgid;
	}

	public void setSuperOrgid(Long superOrgid) {
		this.superOrgid = superOrgid;
	}
}
