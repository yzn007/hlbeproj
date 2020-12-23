package com.seaboxdata.api.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.seaboxdata.api.enums.NrdReviewStatus;
import com.seaboxdata.api.enums.NrdShareType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <h3>rsp</h3>
 * <p>接入审核--列表数据</p>
 * @author : PanhuGao
 * @date : 2020-04-02 10:17
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class AccessAuditDto implements Serializable {
    private static final long serialVersionUID = -7128117818153389326L;
    //接入表ID
    private Long id;
   //资源名称
   private String resourceName;
    //共享类型
    private  NrdShareType shareType;
    //接入方式
    private String accessTe;
    //申请时间
    private LocalDateTime createTm;
    //审核状态
    private NrdReviewStatus reviewStatus;
    //资源状态
    private String resourceStatus;
    //接入部门
    private String organizationName;
    //计入部门ID
    private Long organizationId;
    //工作流ID
    private String taskId;
    //接入类型
    private Integer accessType;




}
