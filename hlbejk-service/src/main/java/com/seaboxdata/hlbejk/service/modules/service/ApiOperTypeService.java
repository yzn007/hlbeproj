package com.seaboxdata.hlbejk.service.modules.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.hlbejk.api.vo.ApiOperateTypeVO;
import com.seaboxdata.hlbejk.service.modules.entity.ApiOperType;

public interface ApiOperTypeService extends IService<ApiOperType> {

	List<ApiOperateTypeVO> queryList(Map<String, Object> params);

}
