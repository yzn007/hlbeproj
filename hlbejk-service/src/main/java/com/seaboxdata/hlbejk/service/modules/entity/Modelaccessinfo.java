package com.seaboxdata.hlbejk.service.modules.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.ToString;
import org.springframework.data.annotation.Transient;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 模型调用表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("modelaccessinfo")
public class Modelaccessinfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    /**
     * 模型名称
     */
    private String modelname;

    /**
     * 模型地址
     */
    private String modeladdr;

    /**
     * 使用流量
     */
    private BigDecimal usedatas;

    /**
     * 调用次数
     */
    private String applynum;

    /**
     * 调用时间
     */
    private Date applydate;

    /**
     * 用户监控Id
     */
    private String monitorid;
    /**
     * y用户id
     */
    @Transient
    private transient String userId;


}
