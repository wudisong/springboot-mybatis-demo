package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public Object test() {
        System.out.println("~~~~~~~~~~~~~~~~~~");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", "200");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        return map;
    }
}
