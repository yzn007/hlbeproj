package com.seaboxdata.api.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * 资源申请情况统计查询(详情信息)
 *
 * @author cxh
 * @email cxh@163.com
 * @date 2020-03-06 22:32:22
 */
@Data
public class FieldNameInfoDto implements Serializable {
    private String reviewStatus;

    private String name;

    private Long id;
}
