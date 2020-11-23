package com.seaboxdata.hlbejk.service.modules.service.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import com.seaboxdata.hlbejk.service.modules.dao.ResourceAnalysisReportDao;
import com.seaboxdata.hlbejk.service.modules.entity.ResourceAccessReport;
import com.seaboxdata.hlbejk.service.modules.entity.ResourceCallCount;
import com.seaboxdata.hlbejk.service.modules.service.ResourceAnalysisReportService;

@Service("resourceAnalysisReportService")
public class ResourceAnalysisReportServiceImpl extends ServiceImpl<ResourceAnalysisReportDao, ResourceCallCount>
		implements ResourceAnalysisReportService {

	@Override
	public PageUtils queryPage(Map<String, Object> params) {
		LocalDateTime local = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String startTm = (String) params.get("startDate");
		String endTm = (String) params.get("endDate");
		String queryDateEnum = (String) params.get("dateEnum");

		String dateEnum = null;
		if ("TODAY".equals(queryDateEnum)) {
			// 今天
			String today = formatter.format(local);
			dateEnum = today;

		} else if ("YESTERDAY".equals(queryDateEnum)) {
			LocalDateTime lastDay = local.minusDays(1);
			// 昨天
			String yesterday = formatter.format(lastDay);
			dateEnum = yesterday;

		} else if ("LAST_7_DAYS".equals(queryDateEnum)) {
			LocalDateTime lastWeek = local.minusWeeks(1);
			// 过去一周
			String last_week = formatter.format(lastWeek);
			dateEnum = last_week;
		} else if ("LAST_30_DAYS".equals(queryDateEnum)) {
			// 过去一个月
			LocalDateTime lastMonth = local.minusMonths(1);
			String last_month = formatter.format(lastMonth);
			dateEnum = last_month;
		}

		IPage<ResourceAccessReport> page = this.baseMapper.queryPage(new Query<ResourceCallCount>().getPage(params), startTm,
				endTm, dateEnum);

		return new PageUtils(page);
	}

}