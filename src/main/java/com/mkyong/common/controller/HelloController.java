package com.mkyong.common.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/home")
public class IndexController {
  @RequestMapping("/")
  String get(){
    //mapped to hostname:port/home/
    return "Hello from get";
  }
  @RequestMapping("/index")
  String index(){
    //mapped to hostname:port/home/index/
    return "Hello from index";
  }
}
