package com.seaboxdata.hlbejk.service.utils;

import java.util.UUID;

public class UUIDUtils {


    public static String get(){
        return UUID.randomUUID().toString();
    }

    public static String getUUID() {
        return get().replaceAll("-", "");
    }



}
