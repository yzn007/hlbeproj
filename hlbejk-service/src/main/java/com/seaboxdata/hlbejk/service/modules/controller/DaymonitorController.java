package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.IDaymonitorController;
import com.seaboxdata.hlbejk.api.vo.DaymonitorVO;
import com.seaboxdata.hlbejk.service.modules.entity.Daymonitor;
import com.seaboxdata.hlbejk.service.modules.service.DaymonitorService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 14:22:28
 */
@RestController
public class DaymonitorController implements IDaymonitorController{

    @Autowired
    private DaymonitorService daymonitorService;

    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = daymonitorService.queryPage(params);
        return page;
    }

    @Override
    public DaymonitorVO info(String id) {
        Daymonitor daymonitor = daymonitorService.queryById(id);
        DaymonitorVO daymonitorVO = new DaymonitorVO();
        BeanUtils.copyProperties(daymonitor, daymonitorVO);
        return daymonitorVO;
    }


    /**
     * 信息
     */
//    @Override
//    public DaymonitorVO info(@PathVariable("id") Long id){
//        Daymonitor daymonitor = daymonitorService.queryById(id);
//        DaymonitorVO daymonitorVO = new DaymonitorVO();
//        BeanUtils.copyProperties(daymonitor, daymonitorVO);
//        return daymonitorVO;
//    }

    /**
     * 保存
     */
    @Override
    public Boolean save(@RequestBody DaymonitorVO daymonitorVO){
        Daymonitor daymonitor = new Daymonitor();
        BeanUtils.copyProperties(daymonitorVO, daymonitor);
        return daymonitorService.insert(daymonitor);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody DaymonitorVO daymonitorVO){
        Daymonitor daymonitor = new Daymonitor();
        BeanUtils.copyProperties(daymonitorVO, daymonitor);
        return daymonitorService.update(daymonitor);
    }

    @Override
    public Boolean delete(String[] ids) {
        return daymonitorService.removeByIds(Arrays.asList(ids));
    }

    @Override
    public List<DaymonitorVO> listQ(String day) {

        return daymonitorService.list(day);
    }

//    /**
//     * 删除
//     */
//    @Override
//    public Boolean delete(@RequestBody Long[] ids){
//        return daymonitorService.removeByIds(Arrays.asList(ids));
//    }

}
