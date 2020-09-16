package com.seaboxdata.hlbejk.service.modules.controller;

import java.util.Arrays;
import java.util.Map;
import com.seaboxdata.hlbejk.api.controller.IChargetypeController;
import com.seaboxdata.hlbejk.api.vo.ChargetypeVO;
import com.seaboxdata.hlbejk.service.modules.entity.Chargetype;
import com.seaboxdata.hlbejk.service.modules.service.ChargetypeService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;


/**
 * 费用类型
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 18:18:06
 */
@RestController
public class ChargetypeController implements IChargetypeController{

    @Autowired
    private ChargetypeService chargetypeService;

    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = chargetypeService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @Override
    public ChargetypeVO info(@PathVariable("id") String id){
        Chargetype chargetype = chargetypeService.queryById(id);
        ChargetypeVO chargetypeVO = new ChargetypeVO();
        BeanUtils.copyProperties(chargetype, chargetypeVO);
        return chargetypeVO;
    }

    /**
     * 保存
     */
    @Override
    public Boolean save(@RequestBody ChargetypeVO chargetypeVO){
        Chargetype chargetype = new Chargetype();
        BeanUtils.copyProperties(chargetypeVO, chargetype);
        return chargetypeService.insert(chargetype);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody ChargetypeVO chargetypeVO){
        Chargetype chargetype = new Chargetype();
        BeanUtils.copyProperties(chargetypeVO, chargetype);
        return chargetypeService.update(chargetype);
    }

    /**
     * 删除
     */
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return chargetypeService.removeByIds(Arrays.asList(ids));
    }

}
