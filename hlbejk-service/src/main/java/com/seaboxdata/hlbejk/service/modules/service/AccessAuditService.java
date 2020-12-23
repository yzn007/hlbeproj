package com.seaboxdata.hlbejk.service.modules.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.api.dto.OrganizationDto;
import com.seaboxdata.hlbejk.service.modules.entity.ShareExcData;

public interface AccessAuditService extends IService<ShareExcData> {
	List<OrganizationDto> selOrgNames(Boolean flg);
}
