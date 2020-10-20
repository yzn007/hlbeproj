package com.seaboxdata.hlbejk.service.modules.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seaboxdata.hlbejk.service.modules.entity.Filemanage;
import com.seaboxdata.commons.core.util.api.PageUtils;

import java.util.List;
import java.util.Map;
import com.seaboxdata.hlbejk.api.vo.FilemanageVO;
import com.seaboxdata.hlbejk.service.modules.entity.Filemanage;

/**
 * 文件管理表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-10-13 09:30:13
 */
public interface FilemanageService extends IService<Filemanage> {

    PageUtils queryPage(Map<String, Object> params);

    List<FilemanageVO> queryByIds(Map<String, Object> params);

    Filemanage queryById(String id);

    Boolean insert(Filemanage filemanage);

    Boolean update(Filemanage filemanage);
}

