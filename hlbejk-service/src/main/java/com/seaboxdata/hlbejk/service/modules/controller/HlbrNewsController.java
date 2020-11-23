package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seaboxdata.authuc.api.service.AuthOrganizationService;
import com.seaboxdata.authuc.api.vo.local.OauthOrganizationCommonVO;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.hlbejk.api.controller.IHlbrNewsController;
import com.seaboxdata.hlbejk.api.vo.HlbrNewsTypeVO;
import com.seaboxdata.hlbejk.api.vo.HlbrNewsVO;
import com.seaboxdata.hlbejk.service.modules.entity.HlbrNews;
import com.seaboxdata.hlbejk.service.modules.service.HlbrNewsService;


/**
 * HLBR_NEWS【公告/新闻管理】
 * 
 * @author 管理员
 *
 */
@RestController
public class HlbrNewsController implements IHlbrNewsController{

    @Autowired
    private AuthOrganizationService authOrganizationService;
    
    @Autowired
    private HlbrNewsService hlbrNewsService;

    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = hlbrNewsService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @Override
    public HlbrNewsVO info(@PathVariable("id") String id){
        HlbrNews hlbrNews = hlbrNewsService.queryById(id);
        HlbrNewsVO hlbrNewsVO = new HlbrNewsVO();
        BeanUtils.copyProperties(hlbrNews, hlbrNewsVO);
        return hlbrNewsVO;
    }

    /**
     * 保存
     */
    @Override
    public Boolean save(@RequestBody HlbrNewsVO hlbrNewsVO){
        HlbrNews hlbrNews = new HlbrNews();
        BeanUtils.copyProperties(hlbrNewsVO, hlbrNews);
        return hlbrNewsService.insert(hlbrNews);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody HlbrNewsVO hlbrNewsVO){
        HlbrNews hlbrNews = new HlbrNews();
        BeanUtils.copyProperties(hlbrNewsVO, hlbrNews);
        return hlbrNewsService.update(hlbrNews);
    }

    /**
     * 删除
     */
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return hlbrNewsService.removeByIds(Arrays.asList(ids));
    }

    /**
     * 获取机构
     */
	@Override
	public List<OauthOrganizationCommonVO> organizationList() {
		return authOrganizationService.selectAllOrganizationNotUnderUser();
	}

	/**
	 * 类型
	 */
	@Override
	public List<HlbrNewsTypeVO> typeList() {
		return hlbrNewsService.selectTypeList();
	}

}
