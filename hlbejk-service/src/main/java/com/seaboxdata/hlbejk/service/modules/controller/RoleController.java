package com.seaboxdata.hlbejk.service.modules.controller;

import com.seaboxdata.hlbejk.api.controller.IRoleController;
import com.seaboxdata.hlbejk.api.vo.RoleVO;
import com.seaboxdata.hlbejk.service.modules.service.TemplateRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class RoleController implements IRoleController {

    @Autowired
    private TemplateRoleService templateRoleService;

    @Override
    public List<RoleVO> querRoleVOs() {
        return templateRoleService.querRoleVOs();
    }

}
