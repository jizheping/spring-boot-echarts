package com.jizheping.controller;

import com.alibaba.fastjson.JSONObject;
import com.jizheping.service.EchartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/echarts")
public class EchartsController {
    @Autowired
    private EchartsService echartsService;

    @RequestMapping("/toIndex")
    public String toIndex(){
        return "index";
    }

    @ResponseBody
    @RequestMapping( "/getMessageToShow" )
    public String getMessageToShow(){
        return echartsService.getMessageToShow();
    }
}
