package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.NoticeVO;
import com.seaboxdata.hlbejk.service.modules.entity.Notice;

/**
 * 通知公告
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-16 10:21:25
 */
public interface NoticeService extends IService<Notice> {

    PageUtils queryPage(Map<String, Object> params);

    Notice queryById(String id);

    Boolean insert(Notice notice);

    Boolean update(Notice notice);
}

