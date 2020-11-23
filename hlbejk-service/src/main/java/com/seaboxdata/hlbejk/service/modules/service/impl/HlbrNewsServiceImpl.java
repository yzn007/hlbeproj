package com.seaboxdata.hlbejk.service.modules.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import com.seaboxdata.hlbejk.api.vo.HlbrNewsTypeVO;
import com.seaboxdata.hlbejk.service.modules.dao.HlbrNewsDao;
import com.seaboxdata.hlbejk.service.modules.entity.HlbrNews;
import com.seaboxdata.hlbejk.service.modules.service.HlbrNewsService;

@Service("hlbrNewsService")
public class HlbrNewsServiceImpl extends ServiceImpl<HlbrNewsDao, HlbrNews> implements HlbrNewsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<HlbrNews> page = this.page(
                new Query<HlbrNews>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public HlbrNews queryById(String id) {
        HlbrNews hlbrNews = this.getById(id);
        return hlbrNews;
    }

    @Override
    public Boolean insert(HlbrNews hlbrNews) {
        this.save(hlbrNews);
        return true;
    }

    @Override
    public Boolean update(HlbrNews hlbrNews) {
        this.updateById(hlbrNews);
        return true;
    }

	@Override
	public List<HlbrNewsTypeVO> selectTypeList() {
		return this.baseMapper.selectTypeList();
	}

}