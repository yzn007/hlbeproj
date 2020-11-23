package com.seaboxdata.hlbejk.service.modules.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.hlbejk.api.vo.HlbrNewsTypeVO;
import com.seaboxdata.hlbejk.service.modules.entity.HlbrNews;

/**
 * HLBR_NEWS【公告/新闻管理】
 * 
 * @author 管理员
 *
 */
public interface HlbrNewsService extends IService<HlbrNews> {

    PageUtils queryPage(Map<String, Object> params);

    HlbrNews queryById(String id);

    Boolean insert(HlbrNews hlbrNews);

    Boolean update(HlbrNews hlbrNews);

	List<HlbrNewsTypeVO> selectTypeList();
}

