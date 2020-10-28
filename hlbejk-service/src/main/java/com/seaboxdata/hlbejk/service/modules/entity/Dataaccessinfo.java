package com.seaboxdata.hlbejk.service.modules.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.ToString;
import org.springframework.data.annotation.Transient;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 数据调用表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("dataaccessinfo")
public class Dataaccessinfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    /**
     * 数据资源名称
     */
    private String dataresname;

    /**
     * 数据类型
     */
    private String datatype;

    /**
     * 数据地址
     */
    private String dateaddr;

    /**
     * 调用次数
     */
    private String applynum;

    /**
     * 调用时间
     */
    private Date applydate;

    /**
     * 使用数据范围
     */
    private String datarange;

    /**
     * 使用数据流量
     */
    private BigDecimal usedatas;

    /**
     * 用户监控Id
     */
    private String monitorid;

    /**
     * 用户id
     */
    @Transient
    private transient String userId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDataresname() {
        return dataresname;
    }

    public void setDataresname(String dataresname) {
        this.dataresname = dataresname;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public String getDateaddr() {
        return dateaddr;
    }

    public void setDateaddr(String dateaddr) {
        this.dateaddr = dateaddr;
    }

    public String getApplynum() {
        return applynum;
    }

    public void setApplynum(String applynum) {
        this.applynum = applynum;
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    public String getDatarange() {
        return datarange;
    }

    public void setDatarange(String datarange) {
        this.datarange = datarange;
    }

    public BigDecimal getUsedatas() {
        return usedatas;
    }

    public void setUsedatas(BigDecimal usedatas) {
        this.usedatas = usedatas;
    }

    public String getMonitorid() {
        return monitorid;
    }

    public void setMonitorid(String monitorid) {
        this.monitorid = monitorid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
