package com.seaboxdata.hlbejk.service.modules.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.service.modules.dao.SysResourceDao;
import com.seaboxdata.hlbejk.service.modules.entity.SysResource;
import com.seaboxdata.hlbejk.service.modules.service.SysResourceService;
import com.seaboxdata.hlbejk.service.utils.ResourceTreeUtils;

@Service("sysResourceService")
public class SysResourceServiceImpl extends ServiceImpl<SysResourceDao, SysResource> implements SysResourceService {

	@Override
	public List<SysResource> queryResource(Set<String> permissionCodes) {
		List<SysResource> list = this.baseMapper.queryResource(permissionCodes);

		List<SysResource> treeList = ResourceTreeUtils.buidTree(list);
		
		return treeList;
	}


}