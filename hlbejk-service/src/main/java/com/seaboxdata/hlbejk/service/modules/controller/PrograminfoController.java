package com.seaboxdata.hlbejk.service.modules.controller;

import java.security.Key;
import java.security.KeyStore;
import java.util.*;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.seaboxdata.hlbejk.api.controller.IPrograminfoController;
import com.seaboxdata.hlbejk.api.vo.PrograminfoVO;
import com.seaboxdata.hlbejk.service.modules.entity.Programinfo;
import com.seaboxdata.hlbejk.service.modules.service.PrograminfoService;
import com.seaboxdata.commons.core.util.api.PageUtils;
import com.seaboxdata.hlbejk.service.utils.HttpClientUtils;
import netscape.javascript.JSObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.tomcat.util.collections.CaseInsensitiveKeyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.BeanUtils;
import sun.net.www.http.HttpClient;


/**
 * 算法信息
 *
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-15 17:35:51
 */
@RestController
public class PrograminfoController implements IPrograminfoController {

    //算法名称接口
    @Value("#{'${interface.program.typenames}'}")
    String urlNames="http://10.1.1.233:8010/saim/v1/interactive/getalgtype1";
    //算法详细接口
    @Value("#{'${interface.program.programDetail}'}")
    String urlProgramDetail="http://10.1.1.233:8010/saim/v1/interactive/alginfo1";


    @Override
    public List<PrograminfoVO> selectList() {
        List<PrograminfoVO> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            PrograminfoVO programinfo = new PrograminfoVO();
            programinfo.setId(Integer.toString(i + 1));
            programinfo.setProgramname("算法" + (i + 1));
            programinfo.setProgramaddr("地址" + (i + 1));
            programinfo.setProgramapi("算法接口" + (i + 1));
            programinfo.setProgramdesc("描述" + (i + 1));
            programinfo.setProgramparams("参数" + (i + 1));
            programinfo.setProgramtype(Integer.toString(i + 1));
            programinfo.setProgramid(Integer.toString(i + 1));
            programinfo.setState("1");
            list.add(programinfo);
        }
        return list;
    }
    final String idName = "alg_id";
    final String typeName = "algorithm_type";
    final String msgCode = "code";
    final String msgType="all_alg";
    final String algPath ="alg_path";
    final String algIp ="alg_ip";
    final String algInfo = "alg_info";
    final String algDesc = "alg_desc";
    /**
     * 取得算法名称列表
     *
     * @return
     */
    @Override
    public List<PrograminfoVO> programNmList() {


        List<PrograminfoVO> listMap = new ArrayList<>();
        Map keyMan = new CaseInsensitiveKeyMap();
        String postNames = "";
        //        String testReturn = "";

        try {
            Map mp = new CaseInsensitiveKeyMap();
            mp.put("id", "1");
            mp.put("programname", "测试写入post");
            postNames = HttpClientUtils.getJsonByPost(urlNames, mp, "");

        } catch (Exception ex) {

        }
        if (StringUtils.isEmpty(postNames)) {
            postNames = HttpClientUtils.returnTest(false, false, 0);
        }

        JSONObject jsonObject = JSON.parseObject(postNames);
        if(null!=jsonObject.get(msgCode)&&jsonObject.get(msgCode).toString().equals("0")) {
            jsonObject = jsonObject.getJSONObject(msgType);
            String[] keys = {""};
            jsonObject.entrySet().iterator().forEachRemaining((s -> {
                keys[0] += s.getKey() + "#";
            }));
            if (keys[0].lastIndexOf("#") == keys[0].length() - 1)
                keys[0] = keys[0].substring(0, keys[0].length() - 1);
            String[] names = keys[0].split("#");
            for (String s : names) {
                if (jsonObject.containsKey(s)) {
                    JSONObject jsonId = (JSONObject) jsonObject.get(s);
                    PrograminfoVO programinfoVO = new PrograminfoVO();
                    programinfoVO.setProgramid(jsonId.get(idName).toString());
                    programinfoVO.setProgramname(s);
                    programinfoVO.setProgramtype(jsonId.get(typeName).toString());
                    listMap.add(programinfoVO);
                }
            }
        }
        return listMap;
    }

    @Override
    public PrograminfoVO programDetail(Map param) {
//        //测试
//        String ret = HttpClientUtils.returnTest(true, true, param.get("programid").toString());
        String ret = "";
        try {
            String jsonStr = "";
            Set<Map.Entry<String,Object>> keySets = param.entrySet();
            for(Map.Entry<String,Object> m:keySets){
                if(m.getValue().toString().indexOf("{")>-1) {
                    jsonStr = m.getValue().toString();
                    JSONObject jsonK = JSONObject.parseObject(jsonStr);
                    param.put(m.getKey(),jsonK.get(m.getKey()));
                    break;
                }
            }
            if(StringUtils.isEmpty(jsonStr))
                ret = HttpClientUtils.getJsonByPost(urlProgramDetail,param,"");
            else
                ret = HttpClientUtils.httpPostWithJson(urlProgramDetail,jsonStr);
        }catch (Exception ce){

        }
        if(StringUtils.isEmpty(ret)){
            //假数据测试用
            ret = HttpClientUtils.returnTest(true, true, Integer.parseInt(param.get("id").toString()));
        }
        JSONObject jsonObject = JSONObject.parseObject(ret);
        PrograminfoVO programinfoVO = new PrograminfoVO();
        if (null != jsonObject.get(idName) && jsonObject.get(idName).equals(param.get("id"))) {
            if (null != param.get("programtype"))
                programinfoVO.setProgramtype(param.get("programtype").toString());
            if (null != jsonObject.get(param.get("programname")))
                programinfoVO.setProgramname(param.get("programname").toString());
            if (null != jsonObject.get(algIp))
                programinfoVO.setProgramapi(jsonObject.get(algIp).toString());
            if (null != jsonObject.get(algPath))
                programinfoVO.setProgramaddr(jsonObject.get(algPath).toString());
            if (null != jsonObject.get(algInfo))
                programinfoVO.setProgramparams(jsonObject.get(algInfo).toString());
            if (null != jsonObject.get(algDesc))
                programinfoVO.setProgramdesc(jsonObject.get(algDesc).toString());
        }
        return programinfoVO;
    }

    @Autowired
    private PrograminfoService programinfoService;

    /**
     * 列表
     */
    @Override
    public PageUtils list(@RequestParam Map<String, Object> params) {
        PageUtils page = programinfoService.queryPage(params);
        return page;
    }


    /**
     * 信息
     */
    @Override
    public PrograminfoVO info(@PathVariable("id") String id) {
        Programinfo programinfo = programinfoService.queryById(id);
        PrograminfoVO programinfoVO = new PrograminfoVO();
        if (programinfo != null)
            BeanUtils.copyProperties(programinfo, programinfoVO);
        return programinfoVO;
    }

    /**
     * 保存
     */
    @Override
    public Boolean save(@RequestBody PrograminfoVO programinfoVO) {
        Programinfo programinfo = new Programinfo();
        BeanUtils.copyProperties(programinfoVO, programinfo);
        return programinfoService.insert(programinfo);
    }

    /**
     * 修改
     */
    @Override
    public Boolean update(@RequestBody PrograminfoVO programinfoVO) {
        Programinfo programinfo = new Programinfo();
        BeanUtils.copyProperties(programinfoVO, programinfo);
        return programinfoService.update(programinfo);
    }

    /**
     * 删除
     */
    @Override
    public Boolean delete(@RequestBody String[] ids) {
        return programinfoService.removeByIds(Arrays.asList(ids));
    }

}
