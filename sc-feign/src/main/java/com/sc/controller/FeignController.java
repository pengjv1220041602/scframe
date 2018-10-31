package com.sc.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * @Author ZhPJ
 * @Date 2018/10/30 00309:05
 * @Version 1.0
 * @Description:
 */
@Controller
public class FeignController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(path = "/user")
    @ResponseBody
    @HystrixCommand(fallbackMethod = "error")
    public String getUser () {
        String serviceId = "user-controller";
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://" + serviceId + "/user", String.class);
        return forEntity.getStatusCode().is2xxSuccessful() ? forEntity.getBody() : "@@@";
    }

    public String error() {
        return "error-information";
    }

}
