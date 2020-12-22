package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

	//获取自定义参数的值
	@Value("${auth.systemCode}")
	private String systemCode;
	
	/**
	 * 操作日志
	 */
	@RequestMapping(value = "/queryResource")
	@ResponseBody
	protected List<SysResource> queryResource() throws Exception {
		try {
			Set<String> p = /* new HashSet(); */authUserInService.getLoginUser().getPermissionCodes();
			/*
			 * p.add("YYJG_ZYSQTJ"); p.add("YYJG_ZYSQQK"); p.add("YYJG_ZYSQ");
			 * p.add("YYJG_ZYFWTZB"); p.add("YYJG_YYSQ"); p.add("YYJG_YYSH");
			 * p.add("YYJG_YCFWRZ"); p.add("YYJG_XWJG"); p.add("YYJG_XTFWTJB");
			 * p.add("YYJG_SPLB"); p.add("YYJG_SFGL"); p.add("YYJG_LCSP");
			 * p.add("YYJG_JGSY"); p.add("YYJG_GRFU"); p.add("YYJG_GGGL");
			 * p.add("YYJG_FWGL"); p.add("YYJG_FUFWRZ"); p.add("YYJG_BMZYTJB");
			 * p.add("YYJG_BMFU"); p.add("YYJG_SJSQ");
			 */
			
			List<SysResource> list = sysResourceService.queryResource(p, systemCode);

			return list;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

}
