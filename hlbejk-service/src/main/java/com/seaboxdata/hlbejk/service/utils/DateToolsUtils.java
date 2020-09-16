package com.seaboxdata.hlbejk.service.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToolsUtils {

    public static final String yyyyMMdd = "yyyy-MM-dd";

    public static String toDataStr(Date data, String format){
        DateFormat df = new SimpleDateFormat(format);
        return df.format(data);
    }

    /**
     * 通过时间秒毫秒数判断两个时间的间隔
     * @param date1
     * @param date2
     * @return
     */
    public static int differentDaysByMillisecond(Date date1,Date date2)
    {
        int days = (int) ((date2.getTime() - date1.getTime()) / (1000*3600*24));
        return days;
    }

}
