package com.seaboxdata.hlbejk.api.controller;

import com.seaboxdata.hlbejk.api.FeignClientConfig;
import com.seaboxdata.hlbejk.api.vo.RoleVO;
import io.swagger.annotations.Api;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Api(tags = {"角色"})
@FeignClient(contextId = "role",
        name = FeignClientConfig.NAME, url = FeignClientConfig.URL, configuration = FeignClientsConfiguration.class)
public interface IRoleController {

    @GetMapping("/hlbejk/roles/query")
    List<RoleVO> querRoleVOs();
}
