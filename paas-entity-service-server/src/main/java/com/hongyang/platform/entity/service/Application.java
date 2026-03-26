package com.hongyang.platform.entity.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import com.hongyang.framework.base.utils.AppStartupHelper;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.hongyang.platform.entity.service.mapper")
public class Application {
    public static void main(String[] args) {
        AppStartupHelper.run(Application.class, args);
    }
}
