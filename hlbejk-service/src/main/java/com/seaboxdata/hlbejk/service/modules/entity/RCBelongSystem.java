package com.seaboxdata.hlbejk.service.modules.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.BeanUtils;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.seaboxdata.api.dto.ResBelongSystemDto;
import com.seaboxdata.hlbejk.service.modules.annotation.CompareFlgAnno;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <h3>rsp</h3>
 * <p>资源所属系统表--副表</p>
 *
 * @author : PanhuGao
 * @date : 2020-03-27 10:24
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("data_access_belong_system")
public class RCBelongSystem implements Serializable {
    private static final long serialVersionUID = 940213210790893755L;
    @TableId(value = "id",type = IdType.INPUT)
    private Long id;
    @CompareFlgAnno(isCompared = true)
    private String systemName;
    @CompareFlgAnno(isCompared = true)
    private String systemDescription;

    private Long creator;
    private LocalDateTime createTm;
    private Long dataAccessId;
    @TableField(exist = false)
    private String systemNameHistory;
    @TableField(exist = false)
    private String systemDescriptionHistory;
    @TableField(exist = false)
    private String systemNameSign;
    @TableField(exist = false)
    private String systemDescriptionSign;
    /**
     * 转换为dto对象
     * @param belongSystem
     * @return Optional<NewsDto>
     */
    public static Optional<ResBelongSystemDto> of(RCBelongSystem belongSystem) {
        if(belongSystem == null) {
            return Optional.empty();
        }
        ResBelongSystemDto dto = new ResBelongSystemDto();
        BeanUtils.copyProperties(belongSystem, dto);
        return Optional.of(dto);
    }
}
