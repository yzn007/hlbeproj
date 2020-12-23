package com.seaboxdata.hlbejk.service.modules.service.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.api.dto.OrganizationDto;
import com.seaboxdata.api.enums.ApplyType;
import com.seaboxdata.hlbejk.service.modules.dao.ShareExcDataDao;
import com.seaboxdata.hlbejk.service.modules.entity.ShareExcData;
import com.seaboxdata.hlbejk.service.modules.service.AccessAuditService;

/**
 * <h3>rsp</h3>
 * <p>资源接入审核实现类</p>
 *
 * @author : PanhuGao
 * @date : 2020-04-02 11:17
 **/
@Service("accessAuditService")
@DS("corc")
public class AccessAuditServiceImpl extends ServiceImpl<ShareExcDataDao, ShareExcData> implements AccessAuditService {
	@Autowired
	private AccessAuditService accessAuditService;
	    /**             
		 * 接入部门
		 *
		 * @param flg
		 * @return
		 */
	    @Override
		public List<OrganizationDto> selOrgNames(Boolean flg) {
			//TRUE 资源接入 FALSE 资源更新
	    	QueryWrapper<ShareExcData> wrapper = new QueryWrapper<>();
	    	wrapper.and(flg.equals(Boolean.TRUE),m -> m.isNull("apply_type").or().eq("apply_type", ApplyType.RESOURCE_ACCESS.toString()));
	    	wrapper.eq(flg.equals(Boolean.FALSE), "apply_type", ApplyType.RESOURCE_UPDATE.toString());
	    	
	    	List<ShareExcData> fres = accessAuditService.list(wrapper);
			List<OrganizationDto> res = fres.parallelStream().filter(m -> m.getOrganizationId() != null).map(ShareExcData::ofOrg).map(Optional::get).collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(OrganizationDto::getOrganizationId))), ArrayList::new));
			return res;
		}
}
