package com.sc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author ZhPJ
 * @Date 2018/10/24 002416:46
 * @Version 1.0
 * @Description:
 */
@Controller
public class UserController {

    @RequestMapping(path = "/user")
    @ResponseBody
    public String getUser () {
        return "aaarrrr";
    }


}
