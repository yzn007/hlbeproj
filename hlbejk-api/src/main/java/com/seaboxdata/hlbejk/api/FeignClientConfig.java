package com.seaboxdata.hlbejk.api;

public class FeignClientConfig {

    /**
     * 实现该api的服务名称
     */
    public static final String NAME = "TEMPLATE-SERVICE";

    /**
     * 实现该api的服务地址
     */
    public static final String URL = "${template-service-url}";
}