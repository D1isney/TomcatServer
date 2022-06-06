package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/yyds")
//添加路径前缀
public class MainController {

//    http://localhost:8080/mvc/index

//    @RequestMapping("/index1")//请求映射
//    public ModelAndView index(){
////        return new ModelAndView("index");
//        ModelAndView modelAndView = new ModelAndView("index");
//        modelAndView.getModel().put("name","阿巴阿巴");
//        return modelAndView;
//    }
//    @GetMapping("index1")
//    @RequestMapping(value = "index1",method = RequestMethod.GET)
    @RequestMapping(value = "index1",params = "username")
    public String index(){
        return "index";
    }

    //    http://localhost:8080/mvc/index
    @RequestMapping("/test2")
    public ModelAndView index2(){
        return new ModelAndView("index2");
    }
}
