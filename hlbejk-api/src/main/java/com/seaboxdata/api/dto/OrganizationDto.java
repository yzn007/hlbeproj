package com.seaboxdata.api.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <h3>rsp</h3>
 * <p>我的申请部门信息</p>
 * @author : PanhuGao
 * @date : 2020-03-05 17:12
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OrganizationDto implements Serializable {
    private static final long serialVersionUID = -7128117818153389326L;
    private Long applyId;
    private String organizationName;
    private Long organizationId;
}
