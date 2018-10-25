package com.sc;

import com.sc.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author ZhPJ
 * @Date 2018/10/24 002416:47
 * @Version 1.0
 * @Description:
 */
// @SpringCloudApplication 注解是断路器负载均衡服务注册的集合
@SpringBootApplication
@EnableDiscoveryClient
public class UserControllerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserControllerApplication.class, args);
    }
}
