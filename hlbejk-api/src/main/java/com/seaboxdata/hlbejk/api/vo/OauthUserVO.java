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
 * 用户信息表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-10-25 19:53:33
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OauthUserVO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键ID
	 */
	@ApiModelProperty(value = "主键ID")
		private Long id;
	
	/**
	 * 用户姓名
	 */
	@ApiModelProperty(value = "用户姓名")
	private String name;

	/**
	 * 登录账号
	 */
	@ApiModelProperty(value = "登录账号")
	private String username;

	/**
	 * 密码
	 */
	@ApiModelProperty(value = "密码")
	private String password;

	/**
	 * 主移动电话号码
	 */
	@ApiModelProperty(value = "主移动电话号码")
	private String phoneNumber;

	/**
	 * 主固定电话
	 */
	@ApiModelProperty(value = "主固定电话")
	private String fixedPhoneNumber;

	/**
	 * 主传真号码
	 */
	@ApiModelProperty(value = "主传真号码")
	private String faxNumber;

	/**
	 * 租户Id
	 */
	@ApiModelProperty(value = "租户Id")
	private Long tenantId;

	/**
	 * 工号
	 */
	@ApiModelProperty(value = "工号")
	private String jobNumber;

	/**
	 * 主电子邮箱
	 */
	@ApiModelProperty(value = "主电子邮箱")
	private String email;

	/**
	 * 状态: 0-可用，1-禁用
	 */
	@ApiModelProperty(value = "状态: 0-可用，1-禁用")
	private Integer enabled;

	/**
	 * 性别: 0-男 ,1-女
	 */
	@ApiModelProperty(value = "性别: 0-男 ,1-女")
	private Integer userSex;

	/**
	 * 生日
	 */
	@ApiModelProperty(value = "生日")
	private String userBirthday;

	/**
	 * 外包公司名称
	 */
	@ApiModelProperty(value = "外包公司名称")
	private String outsourcingCompany;

	/**
	 * 外包公司电话
	 */
	@ApiModelProperty(value = "外包公司电话")
	private String outsourcingPhone;

	/**
	 * 职位
	 */
	@ApiModelProperty(value = "职位")
	private String position;

	/**
	 * 职称
	 */
	@ApiModelProperty(value = "职称")
	private String title;

	/**
	 * 头像
	 */
	@ApiModelProperty(value = "头像")
	private String userAvatar;

	/**
	 * 地址
	 */
	@ApiModelProperty(value = "地址")
	private String userAddress;

	/**
	 * 个人介绍
	 */
	@ApiModelProperty(value = "个人介绍")
	private String personalSignature;

	/**
	 * 最后登录时间
	 */
	@ApiModelProperty(value = "最后登录时间")
	private Date lastLoginTime;

	/**
	 * 创建时间
	 */
	@ApiModelProperty(value = "创建时间")
	private Date createTime;

	/**
	 * 修改时间
	 */
	@ApiModelProperty(value = "修改时间")
	private Date updateTime;

	/**
	 * 是否为系统用户
	 */
	@ApiModelProperty(value = "是否为系统用户")
	private Integer systemUser;

	/**
	 * 是否为租户管理员
	 */
	@ApiModelProperty(value = "是否为租户管理员")
	private Integer tenantManager;

	/**
	 * 用户IP备案
	 */
	@ApiModelProperty(value = "用户IP备案")
	private String recordIp;

	/**
	 * 
	 */
	@ApiModelProperty(value = "")
	private String passwordTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFixedPhoneNumber() {
		return fixedPhoneNumber;
	}

	public void setFixedPhoneNumber(String fixedPhoneNumber) {
		this.fixedPhoneNumber = fixedPhoneNumber;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public Long getTenantId() {
		return tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

	public String getJobNumber() {
		return jobNumber;
	}

	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public Integer getUserSex() {
		return userSex;
	}

	public void setUserSex(Integer userSex) {
		this.userSex = userSex;
	}

	public String getUserBirthday() {
		return userBirthday;
	}

	public void setUserBirthday(String userBirthday) {
		this.userBirthday = userBirthday;
	}

	public String getOutsourcingCompany() {
		return outsourcingCompany;
	}

	public void setOutsourcingCompany(String outsourcingCompany) {
		this.outsourcingCompany = outsourcingCompany;
	}

	public String getOutsourcingPhone() {
		return outsourcingPhone;
	}

	public void setOutsourcingPhone(String outsourcingPhone) {
		this.outsourcingPhone = outsourcingPhone;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUserAvatar() {
		return userAvatar;
	}

	public void setUserAvatar(String userAvatar) {
		this.userAvatar = userAvatar;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getPersonalSignature() {
		return personalSignature;
	}

	public void setPersonalSignature(String personalSignature) {
		this.personalSignature = personalSignature;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
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

	public Integer getSystemUser() {
		return systemUser;
	}

	public void setSystemUser(Integer systemUser) {
		this.systemUser = systemUser;
	}

	public Integer getTenantManager() {
		return tenantManager;
	}

	public void setTenantManager(Integer tenantManager) {
		this.tenantManager = tenantManager;
	}

	public String getRecordIp() {
		return recordIp;
	}

	public void setRecordIp(String recordIp) {
		this.recordIp = recordIp;
	}

	public String getPasswordTime() {
		return passwordTime;
	}

	public void setPasswordTime(String passwordTime) {
		this.passwordTime = passwordTime;
	}
}
