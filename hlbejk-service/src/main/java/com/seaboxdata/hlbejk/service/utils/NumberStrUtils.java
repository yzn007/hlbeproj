package com.seaboxdata.hlbejk.service.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class NumberStrUtils {

    /**
     * 账号添加数据位数num: username + xxxx
     */
    public int USERNAME_DIGIT = 4;

    /**
     * 自增数字字符串 str
     * 字符创位数
     */
    public String increment(String str){
        int num = Integer.parseInt(str);
        num++;
        return String.format("%0"+ USERNAME_DIGIT +"d", num);
    }

    /**
     * 自增数字字符串 str
     * 字符创位数
     */
    public String increment(String str, int count){
        int num = Integer.parseInt(str);
        num++;
        return String.format("%0"+ count +"d", num);
    }

}
