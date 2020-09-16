package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.service.modules.dao.NoticeDao;
import com.seaboxdata.hlbejk.service.modules.service.NoticeService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;
import com.seaboxdata.hlbejk.service.modules.entity.Notice;


@Service("noticeService")
public class NoticeServiceImpl extends ServiceImpl<NoticeDao, Notice> implements NoticeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Notice> page = this.page(
                new Query<Notice>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public Notice queryById(String id) {
        Notice notice = this.getById(id);
        return notice;
    }

    @Override
    public Boolean insert(Notice notice) {
        this.save(notice);
        return true;
    }

    @Override
    public Boolean update(Notice notice) {
        this.updateById(notice);
        return true;
    }

}