package com.seaboxdata.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @program: nrd-server
 * @description: 操作日志
 * @author: sqq
 * @create: 2020-01-13 14:51
 **/
@Data

public class ApplyInfoDetailsDto implements Serializable {
    private static final long serialVersionUID = -1382957409235963730L;
    private String reviewerName;
    private String reviewerPhone;
    private String reviewDeptName;
    private String suggestion;
    private String applyUserName;
    private String reviewStatusName;
    private List<FieldNameInfoDto> fieldNames;
    private List<FieldNameInfoDto> passedFieldNames;
    private List<FieldNameInfoDto> faildFieldNames;
}