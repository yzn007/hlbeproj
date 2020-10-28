package com.seaboxdata.hlbejk.service.modules.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import com.seaboxdata.hlbejk.service.modules.dao.TestDao;
import com.seaboxdata.hlbejk.service.modules.entity.Apiaccessinfo;
import com.seaboxdata.hlbejk.service.modules.service.TestService;

import cn.hutool.core.map.CaseInsensitiveMap;


@Service("testService")
//@DS("corc")
public class TestServiceImpl extends ServiceImpl<TestDao, Apiaccessinfo> implements TestService {

    @Override
    public PageUtils list(Map<String, Object> params) {
        IPage<Apiaccessinfo> page = this.page(
                new Query<Apiaccessinfo>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }
    
    @Override
    public List<Map> list2(Map<String, Object> params) {
    	Map <String,Object> param = new CaseInsensitiveMap<>();
    	return super.baseMapper.listTest(param);
    }

}