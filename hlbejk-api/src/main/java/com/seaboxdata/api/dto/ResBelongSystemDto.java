package com.seaboxdata.api.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <h3>rsp</h3>
 * <p>资源所属系统</p>
 *
 * @author : PanhuGao
 * @date : 2020-03-02 16:27
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ResBelongSystemDto implements Serializable {
    private static final long serialVersionUID = -7532102141160296410L;
    private Long  id ;
    private Long  creator   ;
    private Long  modifier  ;
    private String  systemName ;
    private String  systemDescription  ;
    private Long  resourceId ;
    private String systemNameHistory;
    private String systemDescriptionHistory;
    private String systemNameSign;
    private String systemDescriptionSign;
}
