package com.seaboxdata.hlbejk.service.modules.service;

import java.util.List;
import java.util.Set;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.hlbejk.service.modules.entity.SysResource;

public interface SysResourceService extends IService<SysResource>{

	List<SysResource> queryResource(Set<String> permissionCodes);

}
