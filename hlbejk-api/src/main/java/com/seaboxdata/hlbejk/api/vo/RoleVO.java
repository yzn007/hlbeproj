package com.seaboxdata.hlbejk.api.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.io.Serializable;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class RoleVO implements Serializable {

    private static final long serialVersionUID = 7728807532100669505L;

    /**
     * 主键Id
     */
    private Long id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色码
     */
    private String roleCode;

    /**
     * 序号
     */
    private Integer orderNumber;

    /**
     * 角色状态 1:启用 0:禁用
     */
    private Boolean status;

    /**
     * 父级Id
     */
    private Long parentId;

    /**
     * 角色描述
     */
    private String roleDescription;

    private List<RoleVO> children;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public List<RoleVO> getChildren() {
        return children;
    }

    public void setChildren(List<RoleVO> children) {
        this.children = children;
    }
}
