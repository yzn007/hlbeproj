package com.seaboxdata.hlbejk.service.modules.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.BeanUtils;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.seaboxdata.api.dto.ResourceApplyListInfoDto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 资源申请情况统计查询
 *
 * @author cxh
 * @email cxh@163.com
 * @date 2020-03-06 22:32:22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("resources_apply")
public class ResourceApplyListInfo implements Serializable {

	private static final long serialVersionUID = -5722613953356195560L;
	@TableId
	private Long id;
	private Long creator;
	private Long modifier;
	private LocalDateTime modifyTm;
	private LocalDateTime createTm;
	private String reviewStatus;
	private Long createOrgan;
	private int delStatus;
	private String applyReason;


	/**
	 * 资源名称
	 */
	@TableField(exist = false)
	private String resourceName;


	/**
	 * 资源代码
	 */
	@TableField(exist = false)
	private String resourceCode ;


	/**
	 * 申请部门名称
	 */
	@TableField(exist = false)
	private String organName ;



	/**
	 * 资源提供方部门编号
	 */
	@TableField(exist = false)
	private Integer organizationId;

	/**
     *资源提供方部门名称
     */

	@TableField(exist = false)
	private String organizationName;






	/**
	 * 审核人
	 * */
	@TableField(exist = false)
	private Long reviewUserId;



	/**
	 * 审核人名称
	 * */
	@TableField(exist = false)
	private Integer reviewerName;





	/**
	 * 审核人机构名称
	 * */
	@TableField(exist = false)
	private String reviewDeptName;



	/**
	 * 申请人姓名
	 */

	@TableField(exist = false)
	private String applyUserName;

	/**
	 *审核状态名称
	 */
	@TableField(exist = false)
	private String reviewStatusName;

	/**
	 * 审核人机构
	 * */
	@TableField(exist = false)
	private Long reviewDeptId;




	/**
	 * 转换为dto对象
	 * @param resourceInfo
	 * @return Optional<ResourceApplyInfoDto>
	 */
	public static Optional<ResourceApplyListInfoDto> of(ResourceApplyListInfo resourceInfo) {
		if(resourceInfo == null) {
			return Optional.empty();
		}
		ResourceApplyListInfoDto dto = new ResourceApplyListInfoDto();
		BeanUtils.copyProperties(resourceInfo, dto);
		return Optional.of(dto);
	}

}
