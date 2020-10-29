package com.seaboxdata.hlbejk.common.utils.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.seaboxdata.hlbejk.service.modules.enums.OperateType;

/**
 * 自定义操作日志注解
 * 
 * @author 
 */
@Target(ElementType.METHOD) // 注解放置的目标位置,METHOD是可注解在方法级别上
@Retention(RetentionPolicy.RUNTIME) // 注解在哪个阶段执行
@Documented
public @interface OperLog {
	String operModul() default ""; // 操作模块

	OperateType operType() default OperateType.UNKNOWN; // 操作类型

	String operDesc() default ""; // 操作说明
}