package com.seaboxdata.hlbejk.service.modules.controller;

import java.io.File;
import java.util.*;

import com.seaboxdata.hlbejk.api.controller.IFilemanageController;
import com.seaboxdata.hlbejk.api.vo.FilemanageVO;
import com.seaboxdata.hlbejk.service.modules.entity.Filemanage;
import com.seaboxdata.hlbejk.service.modules.service.FilemanageService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.hlbejk.service.utils.DateToolsUtils;
import com.seaboxdata.hlbejk.service.utils.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;
import org.springframework.web.multipart.MultipartFile;


/**
 * 文件管理表
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-10-13 09:30:13
 */
@RestController
public class FilemanageController implements IFilemanageController{

    @Autowired
    private FilemanageService filemanageService;

    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params){
        PageUtils page = filemanageService.queryPage(params);
        return page;
    }

    @Override
    public List<FilemanageVO> getFileList(@RequestParam Map<String, Object> params) {
        List<FilemanageVO> filemanage = filemanageService.queryByIds(params);
        return filemanage;
    }


    /**
     * 信息
     */
    @Override
    public FilemanageVO info(@PathVariable("id") String id){
        Filemanage filemanage = filemanageService.queryById(id);
        FilemanageVO filemanageVO = new FilemanageVO();
        BeanUtils.copyProperties(filemanage, filemanageVO);
        return filemanageVO;
    }

    /**
     * 保存
     */
    @Override
    public Boolean save(@RequestBody FilemanageVO filemanageVO){
        Filemanage filemanage = new Filemanage();
        BeanUtils.copyProperties(filemanageVO, filemanage);
        return filemanageService.insert(filemanage);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody FilemanageVO filemanageVO){
        Filemanage filemanage = new Filemanage();
        BeanUtils.copyProperties(filemanageVO, filemanage);
        return filemanageService.update(filemanage);
    }

    /**
     * 删除
     */
    @Override
    public Boolean delete(@RequestBody String[] ids){
        return filemanageService.removeByIds(Arrays.asList(ids));
    }

    @Override
    public String upload(MultipartFile file) {
        String result  = "";
        if (!file.isEmpty()) {
                try {
                    // 获取图片的文件名
                    String fileName = file.getOriginalFilename();
                    // 获取图片的扩展名
                    String extensionName = fileName.substring(fileName.indexOf("."));
                    // 新的图片文件名 = 获取时间戳+"."图片扩展名
                    String newFileName = String.valueOf(System.currentTimeMillis()) + extensionName;
                    //获取当天日期为子目录
                    String folderPath = DateToolsUtils.toDataStr(new Date(),"yyyy-MM-dd");
                    String filePath = "D:/0test/"+folderPath;
                    File dest = new File(filePath, newFileName);
                    if (!dest.getParentFile().exists()) {
                        dest.getParentFile().mkdirs();
                    }
                    // 上传到指定目录
                    file.transferTo(dest);
                    //保存数据
                    Filemanage filemanage = new Filemanage();
                    filemanage.setFilename(fileName);
                    filemanage.setFiletype(extensionName);
                    filemanage.setFilepath(filePath+"/"+newFileName);
                    filemanage.setUploadtime(DateToolsUtils.toDataStr(new Date(),"yyyy-MM-dd HH:mm:ss"));
                    String id = UUIDUtils.getUUID();
                    filemanage.setId(id);
                    boolean tag = filemanageService.insert(filemanage);
                    if(tag){
                        result = filemanage.getId();
                    }
                    //返回上传文件关联的id
                    return result;
                }catch (Exception e){
                    return "";
                }
        }
        return result;
    }

}
