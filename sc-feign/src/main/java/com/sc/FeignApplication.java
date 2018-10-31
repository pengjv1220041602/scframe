package com.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @Author ZhPJ
 * @Date 2018/10/30 00309:00
 * @Version 1.0
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class FeignApplication {

    @LoadBalanced
    @Bean
    RestTemplate restTemplate(){
        // 结合OKhttp
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }

    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class,args);
    }
}
