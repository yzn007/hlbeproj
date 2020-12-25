package com.seaboxdata.hlbejk.api.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 接入情况概率
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class AccessRateVO {
	/**
	 * 接入概率
	 */
	@ApiModelProperty(value = "接入概率")
	private String accessRate;
	
	/**
	 * 接入合格率
	 */
	@ApiModelProperty(value = "接入合格率")
	private String accessQualificationRate;
	
	/**
	 * 目录清单编制共享率
	 */
	@ApiModelProperty(value = "目录清单编制共享率")
	private String compilationRate;
	
	/**
	 * 资源目录共享率
	 */
	@ApiModelProperty(value = "资源目录共享率")
	private String resourceDirectoryRate;
	
	
}
