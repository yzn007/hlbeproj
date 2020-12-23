package com.seaboxdata.api.enums;

/**
 * @author sqq
 * @version 1.0.0
 * @ClassName ReviewStatus
 * @Description 数据类型
 * @createTime 2020/1/7
 */
public enum NrdDataType {
    CHAR,//字符串型C
    NUMBER,//数值型N
    MONLY,//货币型Y
    DATE, //日期型D
    DATETIME, //日期时间型T
    LOGIC, //逻辑型L
    REMARKS, //备注型M
    CURRENCY, //通用型G
    BOOLEAN,//双精度型B
    INTEGER,//整型I
    FLOAT, //浮点型F
    BLOB, //二进制blob
    TEXT, //长文本text
}
