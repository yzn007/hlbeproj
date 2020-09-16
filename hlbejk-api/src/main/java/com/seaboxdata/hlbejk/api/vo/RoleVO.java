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

}
