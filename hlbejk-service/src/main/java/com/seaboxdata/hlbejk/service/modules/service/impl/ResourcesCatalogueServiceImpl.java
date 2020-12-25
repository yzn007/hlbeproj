package com.seaboxdata.hlbejk.service.modules.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.service.modules.dao.ResourcesCatalogueDao;
import com.seaboxdata.hlbejk.service.modules.entity.ResourcesCatalogue;
import com.seaboxdata.hlbejk.service.modules.service.ResourcesCatalogueService;


@Service("resourcesCatalogueService")
public class ResourcesCatalogueServiceImpl extends ServiceImpl<ResourcesCatalogueDao, ResourcesCatalogue> implements ResourcesCatalogueService {

}