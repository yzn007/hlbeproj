package com.seaboxdata.hlbejk.service.modules.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.api.vo.ApiOperateTypeVO;
import com.seaboxdata.hlbejk.service.modules.dao.ApiOperTypeDao;
import com.seaboxdata.hlbejk.service.modules.entity.ApiOperType;
import com.seaboxdata.hlbejk.service.modules.service.ApiOperTypeService;


@Service("apiOperTypeService")
public class ApiOperTypeServiceImpl extends ServiceImpl<ApiOperTypeDao, ApiOperType> implements ApiOperTypeService {

    @Override
    public List<ApiOperateTypeVO> queryList(Map<String, Object> params) {
    	List<ApiOperateTypeVO> list = this.baseMapper.queryList(params);

        return list;
    }


}