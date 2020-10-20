package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.IPrograminfoController;
import com.seaboxdata.hlbejk.api.vo.PrograminfoVO;
import com.seaboxdata.hlbejk.service.modules.entity.Programinfo;
import com.seaboxdata.hlbejk.service.modules.service.PrograminfoService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 算法信息
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 17:35:51
 */
@RestController
public class PrograminfoController implements IPrograminfoController{

    @Override
    public List<PrograminfoVO> selectList() {
        List<PrograminfoVO> list = new ArrayList<>();
        for(int i=0;i<6;i++){
            PrograminfoVO programinfo =new PrograminfoVO();
            programinfo.setId(Integer.toString(i+1));
            programinfo.setProgramname("算法"+(i+1));
            programinfo.setProgramaddr("地址"+(i+1));
            programinfo.setProgramapi("算法接口"+(i+1));
            programinfo.setProgramdesc("描述"+(i+1));
            programinfo.setProgramparams("参数"+(i+1));
            programinfo.setProgramtype(Integer.toString(i+1));
            programinfo.setProgramid(Integer.toString(i+1));
            programinfo.setState("1");
            list.add(programinfo);
        }
        return list;
    }

    @Autowired
    private PrograminfoService programinfoService;

    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = programinfoService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @Override
    public PrograminfoVO info(@PathVariable("id") String id){
        Programinfo programinfo = programinfoService.queryById(id);
        PrograminfoVO programinfoVO = new PrograminfoVO();
       if(programinfo!=null)
           BeanUtils.copyProperties(programinfo, programinfoVO);
        return programinfoVO;
    }

    /**
     * 保存
     */
    @Override
    public Boolean save(@RequestBody PrograminfoVO programinfoVO){
        Programinfo programinfo = new Programinfo();
        BeanUtils.copyProperties(programinfoVO, programinfo);
        return programinfoService.insert(programinfo);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody PrograminfoVO programinfoVO){
        Programinfo programinfo = new Programinfo();
        BeanUtils.copyProperties(programinfoVO, programinfo);
        return programinfoService.update(programinfo);
    }

    /**
     * 删除
     */
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return programinfoService.removeByIds(Arrays.asList(ids));
    }

}
