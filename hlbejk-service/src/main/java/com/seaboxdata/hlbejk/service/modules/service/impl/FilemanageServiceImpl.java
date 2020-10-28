package com.seaboxdata.hlbejk.service.modules.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.seaboxdata.hlbejk.api.vo.FilemanageVO;
import com.seaboxdata.hlbejk.service.modules.dao.FilemanageDao;
import com.seaboxdata.hlbejk.service.modules.service.FilemanageService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.commons.core.util.api.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.BeanUtils;
import com.seaboxdata.hlbejk.service.modules.entity.Filemanage;


@Service("filemanageService")
public class FilemanageServiceImpl extends ServiceImpl<FilemanageDao, Filemanage> implements FilemanageService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<Filemanage> page = this.page(
                new Query<Filemanage>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<FilemanageVO> queryByIds(Map<String, Object> params) {
        QueryWrapper queryWrapper = new QueryWrapper();
        if(!"".equals(params.get("fileids")) && null!=params.get("fileids")){
           String fileids =  params.get("fileids").toString();
           if(fileids.indexOf(",")!=-1){
               String[] files =  fileids.split(",");
               queryWrapper = (QueryWrapper) queryWrapper.in("id",files);
           }else{
               queryWrapper = (QueryWrapper) queryWrapper.in("id",fileids);
           }
        }
        queryWrapper = (QueryWrapper) queryWrapper.orderByDesc("uploadTime");
        List<FilemanageVO> list = this.list(queryWrapper);
        return  list;
    }

    @Override
    public Filemanage queryById(String id) {
        Filemanage filemanage = this.getById(id);
        return filemanage;
    }

    @Override
    public Boolean insert(Filemanage filemanage) {
        this.save(filemanage);
        return true;
    }

    @Override
    public Boolean update(Filemanage filemanage) {
        this.updateById(filemanage);
        return true;
    }

}