package com.seaboxdata.api.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ShareExchangeDto implements Serializable {
    private static final long serialVersionUID = -7128117818153389326L;
    private Long id;
    //资源提供方id
    private Long organizationId;
    //资源提供方名称
    private String organizationName;
    //信息资源名称
    private String resourceName;
    private String resourceNameHistory;
    private String resourceNameSign;
    //信息资源代码
    private String resourceCode;
    private String resourceCodeHistory;
    private String resourceCodeSign;
    //信息资源摘要
    private String resourceDesc;
    private String resourceDescHistory;
    private String resourceDescSign;
    //信息资源提供方内部部门
    private String interdepartName;
    private String interdepartNameHistory;
    private String interdepartNameSign;
    //资源提供方代码
    private String provideCode;
    private String provideCodeHistory;
    private String provideCodeSign;
    //关联及类目名称
    private String categoryName;
    //更新周期
    private  String renewCycle;
    private String renewCycleHistory;
    private String renewCycleSign;
    //信息资源格式分类
    private String infoSourceSort;
    private String infoSourceSortHistory;
    private String infoSourceSortSign;
    //信息资源格式类型
    private String infoSourceType;
    private String infoSourceTypeHistory;
    private String infoSourceTypeSign;
    //其他类型资源格式描述
    private String otherDescription;
    //共享方式分类
    private String shareSort;
    private String shareSortHistory;
    private String shareSortSign;
    //共享方式类型
    private String shareType;
    private String shareTypeHistory;
    private String shareTypeSign;
    //所属系统
    private List<ResBelongSystemDto> sysTems;
    //资源分类表id
    private Long classificationId;
    //是否为草稿
    private Integer draftStatus;
    //数据接入方式
   private String   accessType;
    //其他说明
    private String remark;
    private String remarkHistory;
    private String remarkSign;
    //资源的信息项
    private List<CatalogueItemDto> catalogueItemDtos;
    //标准数据修改申请判别上个申请流程是否完成
    private int processStatus;
     //是否标准资源(是否标准资源 0-否 1-是)
   private int standardStatus;
   //资源接入申请审核状态
    private String reviewStatus;
    //资源审核意见
    private String auditOpinion;
    //资源状态
   private int resourceStatus;
   //工作流id
    private String taskId;
    //审核方式
    private String applyType;
    //驳回时回显上次副表id
    private Long rejectId;
    //获取资源发布所需资源ID
    private Long apiResId;
}
