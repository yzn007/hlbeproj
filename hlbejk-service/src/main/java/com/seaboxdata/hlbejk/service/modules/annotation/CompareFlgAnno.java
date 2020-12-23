package com.seaboxdata.hlbejk.service.modules.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @创建人 PanHu.Gao
 * @创建时间 2020/5/18
 * @描述
 */
@Target(value = ElementType.FIELD)//字段注解
@Retention(value = RetentionPolicy.RUNTIME)//运行时可见
public @interface CompareFlgAnno {
    public boolean isCompared();
}
