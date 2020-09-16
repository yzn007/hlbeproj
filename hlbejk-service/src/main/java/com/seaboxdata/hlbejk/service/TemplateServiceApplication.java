package com.seaboxdata.hlbejk.service;

import com.seaboxdata.commons.auth.frontier.annotation.EnableDfjinxinResourceFrontier;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = "com.seaboxdata")
@MapperScan(basePackages = "com.seaboxdata.hlbejk.service.modules.dao")//设置dao
@EnableTransactionManagement//启动事务
@EnableFeignClients("com.seaboxdata")//启动feign组件使用
@EnableDfjinxinResourceFrontier//对接auth启动
public class TemplateServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateServiceApplication.class, args);
    }

}
