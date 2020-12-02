package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.seaboxdata.authuc.api.service.AuthUserInService;
import com.seaboxdata.hlbejk.service.modules.entity.SysResource;
import com.seaboxdata.hlbejk.service.modules.service.SysResourceService;

/**
 * 操作日志
 * 
 * @author
 *
 */
@RestController
@RequestMapping(value = "/sys/resource")
public class SysResourceController {

	@Autowired
	private AuthUserInService authUserInService;

	@Autowired
	private SysResourceService sysResourceService;

	/**
	 * 操作日志
	 */
	@RequestMapping(value = "/queryResource")
	@ResponseBody
	protected List<SysResource> queryResource() throws Exception {
		try {
			Set<String> p = authUserInService.getLoginUser().getPermissionCodes();

			List<SysResource> list = sysResourceService.queryResource(p);

			return list;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

}
