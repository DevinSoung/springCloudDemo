/*
 * yingyinglicai.com Inc.
 * Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.example.eurekaClient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author devin
 * @version $Id: HiController on 2018/7/7 上午11:49.
 */
@RestController
public class HiController {

    @Value("${server.port}")
    private String port;
    @RequestMapping("/hi")
    public String home(@RequestParam String name){
        return "hi"+name+",i am from port:"+port;
    }

}