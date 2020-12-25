package com.seaboxdata.hlbejk.service.modules.service.impl;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.api.vo.AccessRateVO;
import com.seaboxdata.hlbejk.service.modules.dao.ResourcesCatalogueItemDao;
import com.seaboxdata.hlbejk.service.modules.entity.ResourcesCatalogue;
import com.seaboxdata.hlbejk.service.modules.entity.ResourcesCatalogueItem;
import com.seaboxdata.hlbejk.service.modules.service.ResourcesCatalogueItemService;
import com.seaboxdata.hlbejk.service.modules.service.ResourcesCatalogueService;


@Service("resourcesCatalogueItemService")
@DS("corc")
public class ResourcesCatalogueItemServiceImpl extends ServiceImpl<ResourcesCatalogueItemDao, ResourcesCatalogueItem> implements ResourcesCatalogueItemService {
	@Autowired
    private ResourcesCatalogueService resourcesCatalogueService;
	
	@Override
	public AccessRateVO getResourceCatalogueNum() {
		AccessRateVO accessRateVO = new AccessRateVO();
		/**查询接入率方法*/
		//责任清单总数查询
		int count1 = resourcesCatalogueService.lambdaQuery().eq(ResourcesCatalogue::getDelStatus, 0).ne(ResourcesCatalogue::getShareAttr, "NO_SHARE").count();
		//总数据项数量
		int count2 = this.lambdaQuery().eq(ResourcesCatalogueItem::getDelStatus, 0).ne(ResourcesCatalogueItem::getShareAttr, "NO_SHARE").count();
		//已共享数据资源数量（类）
		int count3 = resourcesCatalogueService.lambdaQuery().eq(ResourcesCatalogue::getDelStatus, 0).eq(ResourcesCatalogue::getAccessStatus, 1).count();
		//已接入数据项数量（个）
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		int count4 = this.lambdaQuery().eq(ResourcesCatalogueItem::getDelStatus, 0).in(ResourcesCatalogueItem::getIsPush, list).count();
		//目录清单编制共享率
		int count7 = resourcesCatalogueService.lambdaQuery().eq(ResourcesCatalogue::getDelStatus, 0).eq(ResourcesCatalogue::getDataSources, 1).count();
		//目录清单已共享数量
		int count8 = resourcesCatalogueService.lambdaQuery().eq(ResourcesCatalogue::getDelStatus, 0).eq(ResourcesCatalogue::getDataSources, 1).eq(ResourcesCatalogue::getAccessStatus, 1).count();
		//资源目录共享率
		int count9 = resourcesCatalogueService.lambdaQuery().eq(ResourcesCatalogue::getDelStatus, 0).eq(ResourcesCatalogue::getDataSources, 3).count();
		//资源目录已共享数量
		int count10 = resourcesCatalogueService.lambdaQuery().eq(ResourcesCatalogue::getDelStatus, 0).eq(ResourcesCatalogue::getDataSources, 3).eq(ResourcesCatalogue::getAccessStatus, 1).count();
		//目录清单编制共享率
		double count11 = Double.valueOf(count8)/Double.valueOf(count7);
		//资源目录共享率
		double count12 = Double.valueOf(count10)/Double.valueOf(count9);
		//接入率
		double count5 = Double.valueOf(count3)/Double.valueOf(count1);
		//接入合格率
		double count6 = Double.valueOf(count4)/Double.valueOf(count2);
	
		String compilationRate = this.doubleRoundingMode(count11);
		String resourceDirectoryRate = this.doubleRoundingMode(count12);
		String accessRate = this.doubleRoundingMode(count5);
		String accessQualificationRate = this.doubleRoundingMode(count6);
		
		if(compilationRate.equals("NaN")) {
			compilationRate ="0";
		}
		
		if(resourceDirectoryRate.equals("NaN")) {
			resourceDirectoryRate ="0";
		}
		
		if(accessRate.equals("NaN")) {
			accessRate ="0";
		}
		
		if(accessQualificationRate.equals("NaN")) {
			accessQualificationRate ="0";
		}
		
		accessRateVO.setAccessQualificationRate(accessQualificationRate);
		accessRateVO.setAccessRate(accessRate);
		accessRateVO.setCompilationRate(compilationRate);
		accessRateVO.setResourceDirectoryRate(resourceDirectoryRate);
		return accessRateVO;
	}
	
	/**精确小数点位数*/
	public String doubleRoundingMode(double b) {
		NumberFormat nf = NumberFormat.getNumberInstance();
		// 保留两位小数
		nf.setMaximumFractionDigits(4); 
		 // 如果不需要四舍五入，可以使用RoundingMode.DOWN
		nf.setRoundingMode(RoundingMode.DOWN);
		return nf.format(b);
	}
	
}