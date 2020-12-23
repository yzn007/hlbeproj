package com.seaboxdata.api.dto;

import java.io.Serializable;
import java.util.List;

import com.seaboxdata.api.enums.NrdDataType;
import com.seaboxdata.api.enums.NrdShareAttr;
import com.seaboxdata.api.enums.OperationStatus;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <h3>rsp</h3>
 * <p>信息项实体</p>
 *
 * @author : PanhuGao
 * @date : 2020-03-01 23:42
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CatalogueItemDto implements Serializable {
    private static final long serialVersionUID = -7128117818153389326L;
    //信息项Id
    private Long id;
    //信息项名称
    private String name;
    //信息项数据类型
    private NrdDataType dataType;
    //信息项共享类型
    private NrdShareAttr shareAttr;
    //新信项开放类型
    private String openAttr;
    //信息项数据长度
    private String dataLength;
    //信息项共享条件
    private String shareReason;
    //发布状态
    private String isPush;
    //是否发布
    private Boolean isPublish;
    //是否为标准字段
    private Integer standardfieldStatus;
    //数据库字段名
    private String dbFiledName;
    //字段类型
    private String dbFiledType;
    //字段长度
    private String dbFiledLength;
    //是否向社会开放
    private Integer isOpenSociety;
    //开放条件
    private String openSocietyConditions;
    //信息项--字典
    private List<DictionaryDto> dictionaryList;
    //是否为副本
    private int ectype;
    //主表信息项id
    private  Long  resourcesItemId;

    //信息项历史记录新增，为了不影响已上线功能，额外新增返回值
    //操作标志位
    private OperationStatus operationStatus;
    //信息项名称
    private String nameHis;
    //信息项名称
    private OperationStatus nameOpe;
    //信息项数据类型
    private NrdDataType dataTypeHis;
    //信息项数据类型
    private OperationStatus dataTypeOpe;
    //信息项数据长度
    private String dataLengthHis;
    //信息项数据长度
    private OperationStatus dataLengthOpe;
    //信息项共享类型
    private NrdShareAttr shareAttrHis;
    //信息项共享类型
    private OperationStatus shareAttrOpe;
    //是否向社会开放
    private Integer isOpenSocietyHis;
    //是否向社会开放
    private OperationStatus isOpenSocietyOpe;
    //信息项共享条件
    private String shareReasonHis;
    //信息项共享条件
    private OperationStatus shareReasonOpe;
    //数据库字段名
    private String dbFiledNameHis;
    //数据库字段名
    private OperationStatus dbFiledNameOpe;
    //字段类型
    private String dbFiledTypeHis;
    //字段类型
    private OperationStatus dbFiledTypeOpe;
    //字段长度
    private String dbFiledLengthHis;
    //字段长度
    private OperationStatus dbFiledLengthOpe;
    //删除标识
    private Boolean delStatus;


}
