package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.seaboxdata.hlbejk.api.controller.INoticeController;
import com.seaboxdata.hlbejk.api.vo.NoticeVO;
import com.seaboxdata.hlbejk.service.modules.entity.Notice;
import com.seaboxdata.hlbejk.service.modules.service.NoticeService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 通知公告
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-16 10:21:25
 */
@RestController
public class NoticeController implements INoticeController{

    @Autowired
    private NoticeService noticeService;


    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = noticeService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @Override
    public NoticeVO info(@PathVariable("id") String id){
        Notice notice = noticeService.queryById(id);
        NoticeVO noticeVO = new NoticeVO();
        BeanUtils.copyProperties(notice, noticeVO);
        return noticeVO;
    }

    @Override
    public List<NoticeVO> getNoticeList(@RequestParam Map<String, Object> params) {
        List<NoticeVO> list = noticeService.getNoticeList(params);
        return  list;
    }

    /**
     * 保存
     */
    @Override
    public Boolean save(@RequestBody NoticeVO noticeVO){
        Notice notice = new Notice();
        BeanUtils.copyProperties(noticeVO, notice);
        return noticeService.insert(notice);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody NoticeVO noticeVO){
        Notice notice = new Notice();
        BeanUtils.copyProperties(noticeVO, notice);
        return noticeService.update(notice);
    }

    /**
     * 删除
     */
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return noticeService.removeByIds(Arrays.asList(ids));
    }

}
