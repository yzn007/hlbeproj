package com.seaboxdata.hlbejk.service.modules.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.BeanUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.seaboxdata.api.dto.AccessAuditDto;
import com.seaboxdata.api.dto.OrganizationDto;
import com.seaboxdata.api.dto.ShareExchangeDto;
import com.seaboxdata.hlbejk.service.modules.annotation.CompareFlgAnno;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("data_access")
public class ShareExcData implements Serializable {
    private static final long serialVersionUID = -5722613953356595560L;
    @TableId(value = "id",type = IdType.INPUT)
    private Long id;

    private Long tenantId;
    private Long creator;
    private Long modifier;
    private LocalDateTime modifyTm;
    private LocalDateTime createTm;
    private Long organizationId;
    private String organizationName;
    @CompareFlgAnno(isCompared = true)
    private String resourceName;
    @TableField(exist = false)
    private String resourceNameHistory;
    @TableField(exist = false)
    private String resourceNameSign;
    @CompareFlgAnno(isCompared = true)
    private String resourceCode;
    @TableField(exist = false)
    private String resourceCodeHistory;
    @TableField(exist = false)
    private String resourceCodeSign;
    @CompareFlgAnno(isCompared = true)
    private String resourceDesc;
    @TableField(exist = false)
    private String resourceDescHistory;
    @TableField(exist = false)
    private String resourceDescSign;
    @CompareFlgAnno(isCompared = true)
    private String infoSourceType;
    @TableField(exist = false)
    private String infoSourceTypeHistory;
    @TableField(exist = false)
    private String infoSourceTypeSign;
    @CompareFlgAnno(isCompared = true)
    private String infoSourceSort;
    @TableField(exist = false)
    private String infoSourceSortHistory;
    @TableField(exist = false)
    private String infoSourceSortSign;
    private String otherDescription;
    private Long classificationId;
    private Integer draftStatus;
    @CompareFlgAnno(isCompared = true)
    private String renewCycle;
    @TableField(exist = false)
    private String renewCycleHistory;
    @TableField(exist = false)
    private String renewCycleSign;
    @CompareFlgAnno(isCompared = true)
    private String shareSort;
    @TableField(exist = false)
    private String shareSortHistory;
    @TableField(exist = false)
    private String shareSortSign;
    @TableField(exist = false)
    private String shareAttr;
    @CompareFlgAnno(isCompared = true)
    private String shareType;
    @TableField(exist = false)
    private String shareTypeHistory;
    @TableField(exist = false)
    private String shareTypeSign;
    @CompareFlgAnno(isCompared = true)
    private String remark;
    @TableField(exist = false)
    private String remarkHistory;
    @TableField(exist = false)
    private String remarkSign;
    @TableField(exist = false)
    private Integer delStatus;
    private String categoryName;
    @CompareFlgAnno(isCompared = true)
    private String interdepartName;
    @TableField(exist = false)
    private String interdepartNameHistory;
    @TableField(exist = false)
    private String interdepartNameSign;
    private Integer standardStatus;
    private String accessType;
    private Long resourcesId;
    private int agreeStatus;
    @CompareFlgAnno(isCompared = true)
    private String provideCode;
    @TableField(exist = false)
    private String provideCodeHistory;
    @TableField(exist = false)
    private String provideCodeSign;
    private String taskId;
    private String reviewStatus;
    private String resourceStatus;
    private String auditOpinion;
    private String applyType;
    private String openType;
    private String openAttr;
    @TableField(exist = false)
    private List<Map<String,Object>> systems;
    @TableField(exist = false)
    private List<RCBelongSystem> rcBelongSystems;
    @TableField(exist = false)
    private String accessTe;
    @TableField(exist = false)
    private Long rejectId;
    //获取资源发布所需资源ID
    @TableField(exist = false)
    private Long apiResId;
    /**
     * 转换为dto对象
     * @param shareExcData
     * @return Optional<NewsDto>
     */
    public static Optional<ShareExchangeDto> of(ShareExcData shareExcData) {
        if(shareExcData == null) {
            return Optional.empty();
        }
        ShareExchangeDto dto = new ShareExchangeDto();
        BeanUtils.copyProperties(shareExcData, dto);
        return Optional.of(dto);
    }

    /**
     * 转换为OrganizationDto对象
     * @param shareExcData
     * @return Optional<NewsDto>
     */
    public static Optional<OrganizationDto> ofOrg(ShareExcData shareExcData) {
        if(shareExcData == null) {
            return Optional.empty();
        }
        OrganizationDto dto = new OrganizationDto();
        BeanUtils.copyProperties(shareExcData, dto);
        return Optional.of(dto);
    }

    /**
     * 转换为AccessAuditDto对象
     * @param shareExcData
     * @return Optional<NewsDto>
     */
    public static Optional<AccessAuditDto> ofAccess(ShareExcData shareExcData) {
        if(shareExcData == null) {
            return Optional.empty();
        }
        AccessAuditDto dto = new AccessAuditDto();
        dto= JSONObject.parseObject(JSON.toJSONString(shareExcData), AccessAuditDto.class);
        return Optional.of(dto);
    }


}
